import io.scalajs.nodejs
import io.scalajs.nodejs.readline.ReadlineOptions
import org.scalatest.AsyncFreeSpec
import org.scalatest.OptionValues._

import scala.concurrent.{ExecutionContextExecutor, Future, Promise}

class AfLogSyncSpec extends AsyncFreeSpec {
  implicit override def executionContext: ExecutionContextExecutor =
    scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

  def getLastTimes(file: String): Future[Option[(String, Int)]] = {
    val readInterface = nodejs.readline.Readline.createInterface(
      new ReadlineOptions(
        input = nodejs.fs.Fs.createReadStream(file)
      ))
    val promise = Promise[Option[(String, Int)]]
    var haveTime: String = null
    var haveCount = 0
    readInterface.onLine { line =>
      haveCount = haveCount + 1
      val time = line.split("\t").head
      if (haveTime != time) {
        haveCount = 1
      }
      haveTime = time
    }
    readInterface.onClose(() => {
      promise.success {
        Option(haveTime).map { r =>
          (r, haveCount)
        }
      }
    })
    promise.future
  }

  "it works" in {
    val sampleTimes = List(1, 2, 3, 3, 3).map { n =>
      s"2017-01-02T01:02:0${n}Z"
    }

    val lines = sampleTimes.map { time =>
      s"$time\tserver\tMessage"
    }

    val targetFile = "test-file"
    nodejs.fs.Fs.writeFileSync(targetFile, lines.map(_ + "\n").mkString)
    getLastTimes(targetFile).map { result =>
      assert(result.value._1 == sampleTimes.last)
      assert(result.value._2 == 3)
    }
  }
}

import scala.scalajs.js
import js._
import io.scalajs.nodejs._

object HelloWorldApp extends JSApp {
  def main(): Unit = {
    println("Hello world from Scala.js!")
    println("----")
    println("To demonstrate usage of Node.js api, here's some of your environment:")
//    process.env.take(5).foreach {
//      case (key, value) =>
//        println(s"${key} = ${value}")
//    }

//    val eventSource = Dynamic.global.require("eventsource")
//    import scala.scalajs.js.DynamicImplicits._
//    val es = Dynamic.newInstance(eventSource)("https://actionfps.com/server-updates/")
//    es.addEventListener("current-game-status-fragment", { e: js.Dynamic =>
//      console.log(JSON.stringify(e))
//    })
    println(process.cwd())

    fs.Fs
      .watch(process.cwd(), (e, s) => {
        println(e)
        println(s)
      })
      .onChange((e, s) => {
        println("CH", e)
        println("CH", s)
      })

  }
}

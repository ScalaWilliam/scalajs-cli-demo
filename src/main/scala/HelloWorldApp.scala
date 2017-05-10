import scala.scalajs.js.JSApp
import io.scalajs.nodejs._

object HelloWorldApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    println("----")
    println("Here's your environment:")
    process.env.foreach {
      case (key, value) =>
        println(s"${key} = ${value}")
    }
  }
}

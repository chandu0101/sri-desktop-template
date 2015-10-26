package sri.desktop.examples.renderprocess

import org.scalajs.dom
import sri.desktop.examples.renderprocess.components.HelloDesktop
import sri.web.ReactDOM

import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object RenderProcess extends JSApp {
  @JSExport
  override def main(): Unit = {
    ReactDOM.render(HelloDesktop(), dom.document.getElementById("app"))
  }
}

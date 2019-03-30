import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle
import scalafx.scene.{Group, Scene}

object Game extends JFXApp {
  var x = 0
  var y = 0

  val Height: Double = 500
  val Width: Double = 500

  val playerWidth: Double = 20
  val playerHieght: Double = 20

  var sceneGraphics: Group = new Group {}


  val player: Rectangle = new Rectangle {
    x = math.random() * 10
    y = math.random() * 15
    width = playerHieght
    height = playerWidth
    fill = Color.Black
  }
  sceneGraphics.children.add(player)

  this.stage = new PrimaryStage {
    this.title = "2D Graphics"
    scene = new Scene(Width, Height) {
      content = List(sceneGraphics)

    }
  }
  //addEventFilter(KeyEvent.KEY_PRESSED, (event: KeyEvent) =>
  //{

  //})
}

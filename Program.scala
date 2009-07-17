package tinycrawl {
  import swing._
  import event._
  import model._
  import view._

  object Program extends GUIApplication {
    val w: World = World.random(50)
    def main(args: Array[String]): Unit = run {
      val frame = new MainFrame {
        title = "tinycrawl"
        contents = new WorldView(w)
      }

      frame.pack()
      frame.visible = true
    }
  }
}

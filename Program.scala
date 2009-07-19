package tinycrawl {
  import swing._
  import event._
  import model._
  import view._

  object Program extends GUIApplication {
    val w: World = World.random(50)
    val a = Node('town, Position(0, 0))
    val b = Node('town, Position(0.5, 0.5))
    val c = Node('town, Position(0.5, 0))
    val d = Node('forest, Position(0.75, 0.25))
    def main(args: Array[String]): Unit = run {
      w.connect(a,b)
      w.connect(b,c)
      w.connect(c,d)
      w.connect(a,c)
      w.connect(b,d)
      w.connect(a,d)
      val frame = new MainFrame {
        preferredSize = (100,100)
        title = "tinycrawl"
        contents = new WorldView(w)
      }

      frame.pack()
      frame.visible = true
    }
  }
}

package tinycrawl {
  import swing._
  import event._
  import collection.mutable.Map
  import models._
  import views._


  object Program extends GUIApplication {
    def main(args: Array[String]): Unit = run {
      val frame = new MainFrame {
        title = "T E S T   W I N D O W"
        contents = new GraphView(Graph.randomGraph(500))
      }
      frame.pack()
      frame.visible = true
    }
  }
}

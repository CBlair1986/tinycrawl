package tinycrawl {
  import swing._
  import event._
  /**
  a test to see how I can do something like curses with swing...
  */
  object Program extends GUIApplication {
    def main(args: Array[String]): Unit = run {
      val textarea = new TextArea(25,25) {
        charWrap = true
        wordWrap = true
        lineWrap = true
        editable = false
        font = new java.awt.Font(java.awt.Font.MONOSPACED,java.awt.Font.PLAIN,12)
      }
      val button = new Button(Action("Test") {
          Game.randomizeScreen()
          textarea.text = Game.toString
        })
      val frame = new MainFrame {
        title = "Text test"
        contents = new BoxPanel(Orientation.Vertical) {
          contents += textarea
          contents += button
        }
      }
      frame.pack()
      frame.visible = true
    }
  }

  object Game {
    val screen = new Array[Array[Char]](25,25)
      def randomizeScreen(): Unit = {
      import util.Random
      val r = new Random
      for (l <- 0 until screen.length) {
        for (i <- 0 until screen(0).length) {
          val c = (r.nextInt(52) + 32).toChar
          screen(l)(i) = c
        }
      }
    }
    override def toString: String = {
      (screen map (_.foldLeft("")(_+_))).mkString("\n")
    }
  }
}

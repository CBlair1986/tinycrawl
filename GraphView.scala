package tinycrawl.views {
  import swing.{Component,Swing}
  import java.awt.{Graphics,Graphics2D}
  import java.awt.geom.Line2D
  import models.{Graph}
  
  class GraphView(graph: Graph) extends Component {
    border = Swing.LineBorder(java.awt.Color.black, 1)
    preferredSize = (400,400)
    override def paintComponent(g: Graphics): Unit = {
      def width = size.width
      def height = size.height
      //TODO: Do the painting stuff here, y'know...
      g match {
        case g2: Graphics2D => {
          for (l <- graph.getLines) {
            g2.draw(new Line2D.Double(l.start.x * width,
              l.start.y * height,
              l.end.x * width,
              l.end.y * height))
          }
        }
        case g1 => {
        }
      }
    }
  }
}

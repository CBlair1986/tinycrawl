package tinycrawl.view {
  import model._
  import swing._
  import event._
  import java.awt.{Graphics,Graphics2D}
  import java.awt.geom.{Line2D,Ellipse2D}

  class WorldView(world: World) extends Component {
    def width = size.width
    def height = size.height
    override def paintComponent(g: Graphics): Unit = {
      g match {
        case g2: Graphics2D => {
          for (e <- world.edges) {
            g2.draw(new Line2D.Double(
              e.start.x * width,
              e.start.y * height,
              e.end.x * width,
              e.end.y * height
            ))
          }
          for (n <- world.nodes) {
            g2.draw(new Ellipse2D.Double(
              (n.x * width) - 5,
              (n.y * height) - 5,
              10,
              10
            ))
          }
        }
        case g1 => {
        }
      }
    }
  }
}

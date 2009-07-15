package tinycrawl.models {
  object Graph {
    /**
      Convenience method so that I can do something like Graph(a,b,c,d,e) like
      it is possible to do with List and Array and such...
      */
    def apply(pairs: Pair[Node,Node]*) = {
      val p = pairs.toArray
      new Graph(p)
    }

    /**
      Generates a random graph, by making a List of <param>numNodes</param>
      nodes and then zipping it up with its tail
      */
    def randomGraph(numNodes: Int) = {
      def randomNodes(num: Int): List[Node] = {
        import util.Random
        val r = new Random
        val l = for {i <- 1 to num} yield {
          val x = r.nextInt(100)
          val y = r.nextInt(100)
          val i = r.nextInt(3)
          val name = r.nextInt(10000).toString
          PositionedNode(name,TerrainTypes(i),Position(x,y))
        }
        l.toList
      }
      val l = randomNodes(numNodes)
      val l2 = l.zip(l.tail)
      apply(l2: _*)
    }
  }

  /**
    A class representing a group of linked nodes. Currently the nodes are
    considered valueless, but that might change.
    */
  class Graph(pairs: Array[Pair[Node,Node]]) {
    val connections = pairs.toList

    /**
      tests for connectivity between two given nodes
      */
    def hasConnection(a: Node,b: Node): Boolean = {
      connections.exists {
        case (`a`,`b`) => true
        case (`b`,`a`) => true
        case _ => false
      }
    }

    /**
      returns a list of lines within the given Rectangle
      */
    def getLinesWithin(bounds: Rectangle): List[Line] = {
      connections.filter {
        case (n1,n2) => {
          (n1.position within bounds) || (n2.position within bounds)
        }
      } map { case (n1,n2) => new Line(n1.position, n2.position) }
    }
  }

  /**
    Something to name a point in space
    */
  case class PositionedNode(node: Node, position: Position) {
    def this(name: String, terrainType: Symbol, x: Int, y: Int) {
      this(Node(name, terrainType), x,y)
    }
    def this(name: String, terrainType: Symbol, position: Position) {
      this(Node(name, terrainType), position)
    }
    def this(aNode: Node, x: Int, y: Int) {
      this(aNode, Position(x,y))
    }
  }

  /**
    A unique identifier for an unspecified point in space
    */
  case class Node(name: String, terrainType: Symbol) { }
  
  /**
    defines a rectangle, given the coordinates of the top and left, and a width
    and height
    */
  case class Rectangle(top: Int, left: Int, width: Int, height: Int) {
    val right = left + width
    val bottom = top + height
  }

  /**
    defines a point in space
    */
  case class Position(x: Int, y: Int) {
    /**
      test to see if the point lies within the given Rectangle
      */
    def within(bounds: Rectangle): Boolean = {
      ((x <= bounds.right) && (x >= bounds.left)) &&
      ((y <= bounds.bottom) && (y >= bounds.top))
    }
  }

  /**
    placeholder for now, I will end up using the scala.swing Line or something
    */
  case class Line(start: Position, end: Position) {
    /**
      TODO: I need to get something going here where the line has a list
      of Agents as content. Then I need to implement collision and
      non-colliding objects.  This should be fun, when I get around to
      it.
      */
  }
}

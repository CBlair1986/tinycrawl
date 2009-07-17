package tinycrawl.model {
  class World {
    import collection.mutable.Set

    var nodes: Set[Node] = Set()
    var edges: Set[Edge] = Set()

    def addNode(terrainType: Symbol, position: Position): Unit = {
      nodes += new Node(terrainType, position, ID.next)
    }

    def removeNode(node: Node): Node = {
      nodes -= node
      node
    }

    def findNodeByID(id: Int): Option[Node] = {
      nodes find { case Node(_, _, anID) => id == anID }
    }

    def connect(startNode: Node, endNode: Node): Unit = {
      if ((nodes contains startNode) && (nodes contains endNode)) {
        println("Contains")
      } else {
        println("Doesn't Contain")
      }
    }
  }
}
    

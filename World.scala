package tinycrawl.model {
  /**
    Contains conveniences, such as world generation
    */
  object World {
    /**
      Generates a randomized world, with <param>num</param> nodes.
      */
    // TODO
    def random(num: Int): World = {
      new World
    }
  }

  /**
    Represents a world that agents can move around in
    */
  class World {
    import collection.mutable.Set

    var nodes: Set[Node] = Set()
    var edges: Set[Edge] = Set()

    /**
      Adds a node of the <param>terrainType</param> type at
      <param>position</param> position
      */
    def addNode(terrainType: Symbol, position: Position): Unit = {
      nodes += new Node(terrainType, position, ID.next)
    }

    /**
      Removes the specified node from the world
      */
    def removeNode(node: Node): Node = {
      nodes -= node
      node
    }

    /**
      Finds a node, given an id
      */
    def findNodeByID(id: Int): Option[Node] = {
      nodes find { case Node(_, _, anID) => id == anID }
    }

    /**
      Creates a connection between two nodes, checking first to see if the
      nodes actually exist
      */
    // TODO
    def connect(startNode: Node, endNode: Node): Unit = {
      if ((nodes contains startNode) && (nodes contains endNode)) {
        println("Contains")
      } else {
        println("Doesn't Contain")
      }
    }
  }
}
    

package tinycrawl.models {
  class Map {
    var nodes: List[PositionedNode] = List()
    var edges: List[Line] = List()

    def addNode(terrainType: Symbol, position: Position): Unit = {
      nodes += new PositionedNode(terrainType, position)
    }

    def removeNode(node: PositionedNode): PositionedNode = {
      nodes -= node
      node
    }

    def connect(startNode: PositionedNode, endNode: PositionedNode): Unit = {
      if ((nodes contains startNode) && (nodes contains endNode)) {
        println("Contains")
      } else {
        println("Doesn't Contain")
      }
    }
  }
}
    

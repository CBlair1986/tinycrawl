package tinycrawl.model {
  case class Node(terrainType: Symbol, position: Position) {
    val id = ID.next

    def x = {
      position.x
    }

    def y = {
      position.y
    }
  }
}

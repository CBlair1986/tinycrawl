package tinycrawl.model {
  case class Edge(start: Node, end: Node) {
    def mid(address: Double): Node = {
      error("Unimplemented: Edge.mid(Double)")
    }
  }
}

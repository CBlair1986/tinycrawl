package tinycrawl.model {
  case class Edge(val start: Node, val end: Node) {
    def mid(address: Double): Node = {
      error("Unimplemented: Edge.mid(Double)")
    }
  }
}

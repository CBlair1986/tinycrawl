package tinycrawl.model {
  object ID {
    var idNext = 0

    def next = {
      val n = idNext
      idNext += 1
      n
    }
  }
}

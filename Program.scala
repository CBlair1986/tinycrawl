import swing._
import event._
import collection.mutable.Map

package tinyCrawl
{

  object Program extends GUIApplication {
    def main(args: Array[String]): Unit = run {
      val frame = new MainFrame {
        title = "T E S T   W I N D O W"
        contents = new Label("whaddup?!")
      }
      frame.pack()
      frame.visible = true
    }
  }

  class Person(name: String) {
    val getName = name
    def getMentality = m
    val m = Map[Person,Int]()
      override def toString() = { "Person: " + name }
    def love(another: Person) { m += Pair(another, 1) }
    def hate(another: Person) { m += Pair(another, -1) }
    def forget(another:Person) { m -= another }
  }

}

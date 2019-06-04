trait Printable extends Any{
  def print(): Unit = println(this)
}
class Wrapper(val underlying: Int) extends AnyVal with Printable
object TestTrait extends App{
  val w = new Wrapper(3)
  w.print()
}

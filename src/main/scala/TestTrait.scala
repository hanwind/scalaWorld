trait Printable extends Any{
  def print(): Unit = println(this)
}
class Wrapper(val underlying: Int) extends AnyVal with Printable
object TestTrait extends App{
  val w = new Wrapper(3)
  w.print()
  w.getClass()
  //定义一个函数
  val f = (x: Int) => x + 3
  println(f(1))
  //闭包
  val factor = 3
  val multiplier = (i: Int) => i * factor
  println(multiplier(1))
  println(multiplier(2))
}

object Q1 extends App {
  val i = scala.io.StdIn.readLine.toDouble
  def interest(i: Double):Double = {
    if (i <= 20000) i/100*2
    else if(i <= 200000) i/100*4
    else if(i <= 2000000) i/100*3.5
    else i/100*6.5
  }

  println(interest(i))
  
}
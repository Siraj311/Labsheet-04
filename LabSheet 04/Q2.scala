object Q2 extends App {
    val input = scala.io.StdIn.readLine.toInt

    if (input <= 0)  println("Negative/Zero")
    else if (input % 2 == 0)  println("Even")
    else if (input % 2 != 0)  println("Odd")
}
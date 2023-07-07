object Q3 extends App {
  def toUpper(s: String): String = {
    s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }

  def formatNames(name: String)(f: String => String): String = {
    f(name)
  }


  println(formatNames("Benny")(toUpper(_)))
  println(formatNames("Saman")(toLower(_)))
  println(formatNames("Kumara")(toUpper(_)))

}
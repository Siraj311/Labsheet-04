object Question03 extends App {

    def sum(n:Int):Int = {
        if (n==1)   { return 1 }
        else        { return n + sum(n-1) }
    }

    print("Enter the number : ")
    val number = scala.io.StdIn.readInt()
    print(sum(number))

}
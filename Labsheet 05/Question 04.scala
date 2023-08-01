object Question04 extends App {

    def isEven(n:Int):Boolean = {
        if (n==0) { return true }
        else { !(isEven(n-1)) }
    }

    print("Enter the number : ")
    var number = scala.io.StdIn.readInt()
    
    if (isEven(number))    {println("Givern number is Even")}
    else                {println("Given number is Odd")}

}
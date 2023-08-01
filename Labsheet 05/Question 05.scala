object Question05 extends App {

    def sumOfEven(n:Int):Int = {
        if (n>0) {
            if (isEven(n)) { n + sumOfEven(n-1) }
            else { sumOfEven(n-1) }
        }
        else return 0
    } 

    def isEven(n:Int):Boolean = {
        if(n==0) { return true }
        else { return !(isEven(n-1)) }
    }

    print("Enter the number : ")
    var number = scala.io.StdIn.readInt()
    print(sumOfEven(number))
}
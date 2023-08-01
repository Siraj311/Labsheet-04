object Question02 extends App {

    def gcd(p:Int, q:Int):Int = {
                if (q==0)   { return p }
        else    if (q>p)    { gcd(q,p) }
        else                { gcd(q, p%q) }
    }

    def prime(n:Int, m:Int=2):Boolean = {
                if (n==m)           { return true  }
        else    if ( gcd(n,m) > 1 ) { return false }
        else                        { prime(n, m+1)}
    }

    def primeSequence(n:Int):Unit = {
        if (n<1) {
            println("-1")
        }
        else if (n==1)  { 
            println("") 
        }
        else {
            if (prime(n)) { print(n + "  ") }
            primeSequence(n-1)
        }
    }

    print("Enter a number : ")
    val number = scala.io.StdIn.readInt()
    primeSequence(number)
    
}
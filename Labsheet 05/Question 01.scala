object Question1 extends App {

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

    print("Enter the number : ")
    val number = scala.io.StdIn.readInt()
    println("Is it a Prime number : " + prime(number))
    
}
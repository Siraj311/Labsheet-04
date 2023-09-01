object Question01 extends App {
    
    def calculateAverage(temps: List[Int]): Float = {
        val tempsF = temps.map(temp => ((temp*9/5)+32))

        val sumT = tempsF.reduce(_ + _) 
        val averageT = sumT.toFloat / temps.length

        return averageT
    }

    val temps = List(0, 10, 20, 30)
    val averageTemp = calculateAverage(temps)
    println(s"Average Fahrenheit temperature: $averageTemp")

}
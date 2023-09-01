object Question02 extends App {
    
    def countLetterOccurrences(words: List[String]): Int = {
        val num = words.map(word => word.filter(_.isLetter).length )

        val totalCount = num.reduce(_ + _)
        return totalCount
    }

    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")

}
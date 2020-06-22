fun main() {
    val text = "Kotlin".getFirstAndLast(first = "first",last = "last")

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for second letter")

}

// TODO 1
fun String.getFirstAndLast(first:String,last:String)= mapOf(
        "$first" to "${this[0]}",
        "$last" to "${this[this.length - 1]}"
)
infix fun Int.isMultiple(n: Int): Boolean = this % n == 0

fun toFizzBuzz(n: Int): String {
    return when {
        n isMultiple 15 -> "FizzBuzz"
        n isMultiple 3  -> "Fizz"
        n isMultiple 5  -> "Buzz"
        else            -> "$n"
    }
}

fun main(args: Array<String>) = (1..100).map(::toFizzBuzz).forEach(::println)
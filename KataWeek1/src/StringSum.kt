fun String.toInt(): Int = try { Integer.parseInt(this) } catch (e: NumberFormatException) { 0 }

fun sum(num1: String, num2: String): Int = num1.toInt() + num2.toInt()

fun main(args: Array<String>) {
    assert(sum("", "") == 0)
    assert(sum("", "1") == 1)
    assert(sum("2", "1") == 3)
    assert(sum("coucou", "5") == 5)
    assert(sum("tutu", "tata") == 0)
    assert(sum("4", "titi") == 4)
}
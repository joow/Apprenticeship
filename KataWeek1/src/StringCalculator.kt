fun String.isDigit(): Boolean = this.matches(Regex("[0-9]"))

fun add(numbers: String): Int = numbers.split(Regex(",|\n")).filter(String::isDigit).map(String::toInt).sum()

fun main(args: Array<String>) {
    assert(add("") == 0)
    assert(add("1") == 1)
    assert(add("1,2") == 3)
    assert(add("1,h,5") == 6)
    assert(add("1\n2,5") == 8)
}
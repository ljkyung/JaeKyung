// 오버로딩

class Sum {
    fun sum(): Int {
        return 10
    }
    fun sum(number1: Int): Int {
        return number1 + 10
    }
    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2 + 10
    }
}
val sum = Sum()
println(sum.sum())
println(sum.sum(10))
println(sum.sum(10, 10))
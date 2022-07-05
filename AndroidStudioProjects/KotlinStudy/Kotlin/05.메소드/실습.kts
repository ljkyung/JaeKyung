fun plusNumbers(first_num: Int, second_num: Int): Int {
    val result: Int = first_num + second_num
    return result
}

plusNumbers(first_num = 10, second_num = 20)
plusNumbers(10, 20)

val result: Int = plusNumbers(first_num = 5, second_num = 7)
println(result)

fun plusNumbersWithDefault(first_num: Int, second_num: Int = 10): Int {
    return first_num + second_num
}

val result2: Int = plusNumbersWithDefault(first_num = 10)
println(result2)
val result3: Int = plusNumbersWithDefault(first_num = 10, second_num = 20)
println(result3)

fun plusNumberWithNoReturn2(firstNum: Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
}
plusNumberWithNoReturn2(100,200)
// 함수선언을 간단하게 하는법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10: Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(result10)

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    for (number in numbers)
    println(number)
}
plusMultipleNumbers( 1, 2, 3, 4, 5)
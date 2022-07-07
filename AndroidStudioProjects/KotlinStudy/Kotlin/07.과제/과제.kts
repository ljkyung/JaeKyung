// 1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다
// 단, 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다

val A: Int = 1
val B: Int = 1
var C: Boolean = if (A == B) true else false
println(C)


// 2. 정수형 변수 A를 선언하고, 변수 B를 선언한다 이때 변수 B는 A의 두배가 되어야 한다
var A1: Int = 2
var B1: Int = A1 * 2
println(B1)


// 3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//  90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학정, 그렇지 않으면 F학점
fun examScore(score: Int): String {
//    when(score){
//        in 90..100 -> return "A학점"
//        in 80..89 -> return "B학점"
//        in 70..79 -> return "C학점"
//        else -> return "F학점"
//    }
    if (score >= 90) return "A학점"
    else if (score >= 80) return "B학점"
    else if (score >= 70) return "C학점"
    else return "F학점"
}

val result: String = examScore(12)
println(result)

// 4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오
//  (시험 문제는 총 20문제이고 만점은 100점)
fun examScoreChecker(num: Int) : Int {
    return num * 5
}
println(examScoreChecker(12))


// nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다
//  이때 인수중에 null이 있으면 0으로 취급하여 합을 구한다.

fun plusTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
//    if (firstNum == null){
//        firstNum = 0
//    } if (secondNum == null) {
//        secondNum = 0
//    }
//    return firstNum + secondNum

    val first : Int = if(firstNum == null) 0 else firstNum
    val second : Int = if(secondNum == null) 0 else secondNum
    return first + second
}
println(plusTwoNumbers(null, 2))
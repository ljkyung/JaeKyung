//계산기1
//- 사칙연산에 대응하는 4개의 함수 구현
//        - 연산이 한번 이루어 질 때 마다 출력을 해야 한다
//(사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다)
class Culculater {
    var result: Int = 0
        set(value) {
            field = value
            println("중간 계산값 : " + field)
        }

    fun sum(inputNumber: Int) {
        result += inputNumber
    }
    fun minus(inputNumber: Int) {
        result -= inputNumber
    }
    fun multiply(inputNumber: Int) {
        result *= inputNumber
    }
    fun devide(inputNumber: Int) {
        result /= inputNumber
    }
}
//val calculater1 = Culculater()
//calculater1.sum(19)
//calculater1.minus(1)
//calculater1.multiply(19)
//calculater1.devide(19)


//계산기2
//- 사칙연산을 할 수 있는 1개의 함수 구현
// ex) calculater.calculate('+', 10)
// ex) calculater.calculate('-', 50)
//- 초기값을 할당 할 수 있어야 하며 초기 값을 할당 하지 않은 경우에는 0 을 기본값으로 사용한다
//        - 불가능한 연산을 요청한 경우 "잘못된 연산 입니다"를 출력 한다

class Calculater2 constructor(val initialValue: Int = 0) {
    var result: Int

    init {
        this.result = initialValue
    }
    fun calculater(function: Char, inputNumber: Int) {
        when (function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다.")
        }
}

// class Calculater3 constructor(val result: Int = 0) {

}
//val calculater4 = Calculater2(10)
//calculater4.calculater('*', 10)
//println(calculater4.result)


// 계산기3
//- 사칙연산을 할 수 있는 1개의 함수 구현
//        - 한번에 여러가지의 연산을 입력 받을 수 있어야 한다
//        - ex> 더하기3 더하기5 나누기10 곱하기2지
//        - ex> calculater.calculate(더하기3, 더하기5, 빼기2, 나누기5)

class Calculater3 {
    var result : Int = 0
    fun calculate(operaters : List<Char>, inputNumbers : List<Int>) {
        operaters.forEachIndexed { index, operater ->
            this._calculate(operater, inputNumbers[index])
        }
    }

    fun _calculate(function: Char, inputNumber: Int) {
        when (function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다.")
        }
    }
}

val calculater3 = Calculater3()
calculater3.calculate(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculater3.result)
// [('+', 50) ('-', 60]
// [(Any, Any) (Any, Any)] --> 실제
// [(Char, Int) (Char, Int)] --> 기대
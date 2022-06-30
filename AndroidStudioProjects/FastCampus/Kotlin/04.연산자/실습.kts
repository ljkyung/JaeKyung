// 산술연산자
val number1 : Int = 1 + 10
val number2 : Int = 2 - 10
val number3 : Int = 2 + 40
val number4 : Int = 40 / 2
val number5 : Int = 45 % 7
println(number5)
val number6 = 10 * 427 % 73 + 108 // 할당하려는 값의 타입을 알기 어려운 경우에는 코틀린에게 맡겨도 된다.

// 대입연산자
var number7 : Int = 22
println(number7)
number7 = 100
println(number7)

// 복합대입연산자
// A+=B -> A = A + B
var number8 : Int = 12
number8 += 8
number8 -= 10
number8 *= 2
number8 /= 5
println(number8)

// 증감연산자 (++, --)
var number9 : Int = 10
println(++number9)
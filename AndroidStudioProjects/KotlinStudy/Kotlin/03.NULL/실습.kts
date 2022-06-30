val number : Int? = null // null이 들어갈 수 있는 변수 -> nullable 한다.
//val number2 : Int = null // null이 들어갈 수 없는 변수 -> non-null
val number2 : Int? = 2 + 5
val number3 : Int? = 10
val number4 : Int? = number2!! + number3!! // 불가능
println(number4)
// !!로 null이 아님은 개발자가 보장할 수 있다.
// 하지만 실제로 null인 경우에는 NPE (NullPointException이 발생할 수 있다.)
// - 결론 : 정말 100% 확신이 있는 경우가 아니면 사용 하지 말자.

if(null == 5) { // == 비교연산은 가능
    println("same")
} else {
    println("not same")
}


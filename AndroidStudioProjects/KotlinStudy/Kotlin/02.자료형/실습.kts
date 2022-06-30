// 변수를 자료형과 함께 선언하는 방법
// -> val/var 변수명 : 타입 = 값
val byteInt : Byte = 10
val shortInt : Short = 10
val integerInt : Int = 10
val longInt : Long = 10

// val worngByte : Byte = 10000 -> Byte가 표현할 수 있는 수의 범위보다 큰 수를 넣은 경우 에러발생
// val worngByte : Byte = "Hi" -> 타입 미스매치 에러 발생

val floatNumber : Float = 10.0f // Float의 경우에는 할당하려는 값 뒤에 f를 붙여야한다.
val doubleNumber : Double = 10.0 // Double의 경우에는 할당하려는 값 뒤에 아무것도 붙이지 않아도 된다.


// 타입추론
val number1 = 10 // Int
val number2 = 10.0 // Double

val yes : Boolean = true
val no : Boolean = false

// 문자형
val text1 : Char = 'A' // -> Char형은 문자가 반드시 하나만 들어가야한다.
val text2 : Char = "A"

// 문자열형
val text3 : String = "안녕하세요"
val text4 : String = "안"

// 팁
// - 타입을 선택할때는 가장 작은 타입을 선택하는 것이 좋다.
// - 실제로는 대부분 그냥 Int, Double을 사용한다.




import java.util.*

//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
fun repeatStr(str : String, num : Int) {
    for (repeat in 0..num) {
        println(str)
    }
}
// repeatStr("good", 10)

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
//fun culculate (getNum : Int) {
//    var culNum : Int = 0
//    for (i in 1..getNum) culNum += i
//    return culNum
//}
//culculate(10)

//3. 1부터 100까지의 수 중에서 7의 배수의 합을 구하는 함수를 만드시오
fun sum7 () {
    var result : Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) result += i
    }
    println("value: " + result)
}
//sum7()

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오
fun increaseOne(numberUnder100 : Int) {
    var givenNum : Int = numberUnder100
    while (givenNum < 100) {
        givenNum++
    }
    return
}
//increaseOne(99)

//5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//(80점 이상 부터 합격, 정답 예시 (False,False,...))
fun examChecker(examScores: List<Int>) : BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}
val result = examChecker(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
result.forEach {
    println(it)
}
//
//
//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//-> [[3,3],[1,5],...]
fun findSumIsSixFromDice(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) resultList.add(listOf<Int>(i, j))
            }
        }
    return resultList
    }
//println(findSumIsSixFromDice())

//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//        함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//배가 부를 때까지 밥을 먹여야 한다
//        배가 부를 경우에는 "배가 부르다" 를 출력한다
//배가 아무리 불러도 최소 한번은 무조건 먹는다
//fun eat(3,2):{}
//->"밥을 먹었다"
//->"배가 부르다"

fun eatUntilNothugry(totalCount : Int, currentCount : Int) {
    var currentCountCopy = currentCount

    do {
        println("밥을 먹었다")
        currentCountCopy++

    } while (currentCountCopy < totalCount)
    println("배가 부르다")
}
//eatUntilNothugry(16, 11)


//
//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//        그룹을 합쳐주는 함수를 만드시오
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//-> [["A", "B", "D", "E"], ["A", "B"]]
//
//(합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//-> null
fun killArmy(
    firstArmy: List<String>,
    secondArmy: List<String>,
    killNth: Int
): List<List<String>>? {
    if(firstArmy.size < killNth || secondArmy.size < killNth) return null

    val firstArmyTemp = mutableListOf<String>()
    val secondArmyTemp = mutableListOf<String>()

    for ((index, army) in firstArmy.withIndex()){
        if (index != killNth) firstArmyTemp.add(army)
    }

    for ((index, army) in secondArmy.withIndex()){
        if (index != killNth) secondArmyTemp.add(army)
    }
    val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
    return result
}

println(
    killArmy(
        firstArmy = listOf<String>("A", "B", "C", "D", "E"),
        secondArmy = listOf<String>("A", "B", "C"),
        killNth = 2
    )
)



//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//fun abc(3)
//->[3,6,9,12,15,18,21,24,27]
fun guguDan(dan: Int) {
    val numbers = mutableListOf<Int>()
    for(i in 1..9) numbers.add(dan * i)
    println(numbers)
    }
guguDan(9)

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//(Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)
fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}
println(
    splitNumbers(listOf<Int>(1,2,3,4,5), listOf<Int>(6,7,8,9,10))
)


//땡땡땡.기능()
//-> 을 사용해 하는 경우가 있을수 있습니다
//-> 기능을 사용하는 방법은 이전 강의에서 알려드렸지만, .문법은 클래스 강의 이후에 이해가 가능합니다.
//-> 과제에서는 이해는 미뤄두고 우선 사용해주세요ㅠ
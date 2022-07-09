// While문 실습

var i = 0
while (i < 5) {
    println(i)
    if(i%2 == 0) {
        println("짝수")
    }else {
        println("홀수")
    }
    i++ // 이 부분을 제거하면 무한루프에 빠진다
}

var z = 10
do{
    println("시작")
    z++
}while (z<20)
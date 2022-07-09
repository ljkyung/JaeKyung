// break
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if(j == 2) break
        else println("j : " + j)
    }
}

println("------------")
// break + label
loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if(j == 2) break@loop
        else println("j : " + j)
    }
}

println("----------")
// Continue
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if(j == 2) continue
        else println("j : " + j)
    }
}

println("-----------")

loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if(j == 2) continue@loop
        else println("j : " + j)
    }
}

println("-----------")
// return
fun returnFunction() : Unit {
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) return
        else println("j : " + j)
        }
    }
}
returnFunction()

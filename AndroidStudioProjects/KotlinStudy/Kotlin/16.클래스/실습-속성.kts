// getter/setter
class Book() {
    var title : String = "모름"
        get() {
            println("getter")
            return "책 제목"

        }
        set(value) {
            println(value)
            field = value
        }
    }
var book = Book()
    println(book.title)
book.title = "제목 변경"
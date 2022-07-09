class ClassB {
    private val j = 0
    inner class C : ClassA() {
       fun printMember() {
           println("i is $i")
           println("j is $j")
       }
    }
}

fun main() {
    val c = ClassB().C()
    c.printMember()
    "a" show 5
}

infix fun String.show(b : Int) {
    println("b")
}


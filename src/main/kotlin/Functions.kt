fun main() {
    println(add(3,4))
    //printTable(4)

    var fnAdd: (a:Int,b:Int) -> Int = ::add    // first class citizen   as we can do same work as we do with vars
    println(fnAdd(4,5))

    val lam = { printTable()}
    lam()   // controlling execution of lam



}

fun add(num1:Int,num2:Int) = (num1 + num2) // inline function
fun printTable(a:Int= 2) {
    for(i in 1..10) {
        println("$a * $i = "+(a*i))
    }
}
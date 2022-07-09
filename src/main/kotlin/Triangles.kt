import java.lang.Math.pow

fun main() {
//   printTriangle(5,'c')
    printShape(5,'c',2)
}

fun printTriangle(input:Int,c:Char) {
    var coll = ""
    for(i in 1 .. input) {
        coll += c
        println(coll)
    }
}

fun printSquare(v:Int,c:Char) {
    for(i in 1..v) {
        for(j in 1..v) {
            print("${c}")
        }
        println()
    }
}
// 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1
fun printPascal(v:Int,c:Char) {
    for(i in 0..v) {
        for(j in i-1..i) {
            var p = pow(2.0, i.toDouble())
            print(" "+p)
        }
        println()
    }
}




fun printShape(input:Int,c:Char,shapeInt:Int) {
    when(shapeInt) {
        0 -> printTriangle(input,c)
        1 -> printSquare(input,c)
        2 -> printPascal(input,c)
        else -> printTriangle(input,c)
    }
}

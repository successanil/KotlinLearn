import kotlin.jvm.JvmStatic //Given two numbers A and B, find Kth digit from right of A to the powerB.

object PrintKthDigit {
    fun kthDigit(A: Int, B: Int, K: Int): Long {
        val pow = Math.pow(A.toDouble(), B.toDouble())
        println(""+pow)
        var xN = pow
        var i = 1
        var lastDigit = -1.0
        while (true) {
            lastDigit = xN % 10
            xN /= 10
            i++
            if (i > K) {
                break
            }
        }
        return lastDigit.toLong()
    }


}

fun main(){
    println(PrintKthDigit.kthDigit(12,11,4))
}
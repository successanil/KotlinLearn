/*
  Given the first 2 terms A1 and A2 of an Arithmetic Series.
  Find the Nth term of the series.
 */

// a_{n}=a_{1}+(n-1)d


class AritmeticProgressionDemo {
    companion object {
        fun nthTermOfAP(A1: Int, A2: Int, N: Int): Int {
            // an = a1 + (n-1)d
            var nextterm = 0
            for (i in 1..N) {
                nextterm = A1 + (i - 1) * (A2 - A1)
            }
            return nextterm
        }
    }

}

fun main() {

    println(AritmeticProgressionDemo.nthTermOfAP(100,7,3))
}
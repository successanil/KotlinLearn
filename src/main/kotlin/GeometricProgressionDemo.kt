import java.lang.Math.pow

/*
Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.
 */

// a_{n} = a*((r) to power n-1)

class GeometricProgressionDemo {
    companion object {

        fun Nth_term(a: Int, r: Int, n: Int): Int {
            var nextterm = 0
            for(i in 1 .. n){
                nextterm = a * pow(r.toDouble(), ((i-1).toDouble())).toInt()
            }
            return nextterm
        }

    }

}

fun main() {
    print(GeometricProgressionDemo.Nth_term(2,2,4))
}
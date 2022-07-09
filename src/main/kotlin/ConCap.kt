import java.lang.Exception
import java.lang.Math.pow
import java.math.BigDecimal
import kotlin.math.pow

fun main() {
    val N = readLine()!!.toInt()
    if(1 < N && N < 10.0.pow(5.0)) {
        val arrStr = readLine()!!
        val arrTemp = arrStr.split(" ")

        var arrG = arrTemp.map { a -> a.toInt() }
        var arr = arrG.map{ a -> a % 10}

        var selectedNo = ""
        for (i in 0..(arr.size.minus(1))) {
            if(0 < arr[i] && arr[i] < 10.0.pow(5.0)) {
                selectedNo += arr[i]

            }
        }
        try {
            val selectedNoT = selectedNo.toBigDecimal()

            if ((selectedNoT % BigDecimal(10)).compareTo(BigDecimal.ZERO) == 0) {
                print("Yes")
            } else {
                print("No")
            }
        }catch(e:Exception) {
            e.printStackTrace()
            print("No")
        }
    }



}
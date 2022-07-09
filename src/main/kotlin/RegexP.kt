import java.io.*
import java.util.*
import java.util.regex.Pattern

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    var n = 1
    var arrList = mutableListOf<String?>()

    if(n != null) {
        for (i in 1..n) {
            arrList.add(readLine())
        }
    }


    var rejex = Regex("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}.\\d{1,3})")

    for (j in 0..arrList.size - 1) {

        if (arrList.get(j) == null) {
            println(false)
        } else {
            if (rejex.containsMatchIn(arrList.get(j)!!)) {
                println(true)
            } else {
                println(false)
            }
        }

    }


}
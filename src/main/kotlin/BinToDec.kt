import java.lang.Math.pow

/*
Write a program to convert binary no to decimal
 */

class BinToDec {
    companion object {
        fun convertBinToDec(binaryNo : String) : Int {
            var arr: CharArray = binaryNo.toCharArray()
            var decimalNo = 0
            var j = 0
            var sum=0
            for(i in arr.size - 1 downTo 0) {   // n
                decimalNo =  (pow(2.0, (j).toDouble())).toInt()
                var p = (decimalNo * (arr[i].toInt() - '0'.toInt()))
                sum += p
                j ++
            }
            return sum
        }

    }
}

fun main() {
    print(BinToDec.convertBinToDec(""+110011))
}
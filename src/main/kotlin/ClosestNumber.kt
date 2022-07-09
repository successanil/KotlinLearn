/*
Given non-zero two integers N and M.
The problem is to find the number closest to N and divisible by M.
If there are more than one such number, then output the one having maximum absolute value.
 */

class ClosestNumber {
    companion object {
        fun closestNumber(n:Int,m:Int) : Int {
            var res = -1;
            for(i in n downTo 1) {
                if(i % m == 0) {
                    res = i   // this is closest
                    break;
                } else {
                    continue
                }
            }

            var d = m

            if(res == -1) {
                if(m<0){
                    d = -m
                }
                for(i in n..(n+d)){
                    if(i % d == 0) {
                        res = i   // this is closest
                        break;
                    } else {
                        continue
                    }
                }
            }

            return res;
        }
    }
}

fun main() {
    var res = ClosestNumber.closestNumber(26368,-4424)
    println(res)
}
import java.lang.Math.pow

class ArmStrongNoDemo {

    companion object {
        fun findArmStrongNo(n:Int) : Boolean{
            var xN = n
            var count = 0
            while(xN != 0) {
                xN = xN / 10
                count ++
            }
            println(count)
            var mN = n
            var maxI = count
            var i = 1
            var sum = 0
            while(i <= maxI) {
                var lastDigit = mN % 10
                mN = mN / 10
                sum += pow(lastDigit.toDouble(),count.toDouble()).toInt()
                i ++
            }
            return sum == n
        }
    }

}

fun main() {
    var res = ArmStrongNoDemo.findArmStrongNo(54348)
    if(res){
        println("yes")
    } else {
        println("no")
    }
}
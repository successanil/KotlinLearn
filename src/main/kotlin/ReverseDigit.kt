class ReverseDigit {
    companion object {
        fun reverse_digit(n: Long): Long {
            var xN = n
            var reverseS =""
            while(xN != 0L) {
                reverseS += xN % 10
                xN /= 10
            }

            return reverseS.toLong()
        }
    }
}

fun main() {
    println(ReverseDigit.reverse_digit(122))
}
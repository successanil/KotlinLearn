class SumOfDigitIsPanlindrome {
    companion object {
        fun isDigitSumPalindrome(N: Int): Int {
            var sumOfD = 0
            var xN = N
            while (xN != 0) {
                sumOfD += xN % 10
                xN = xN / 10
            }
            val res = checkIfPalindrome("" + sumOfD)
            return if (res) 1 else 0
        }

        fun checkIfPalindrome(input: String): Boolean {
            val arr = input.toCharArray()
            var res = false
            var j = arr.size - 1
            var i = 0
            while (i < arr.size) {
                if (arr[i] == arr[j]) {
                    res = true
                } else {
                    res = false
                    break
                }
                i++
                j--
            }
            return res
        }
    }

}

fun main() {
    println(SumOfDigitIsPanlindrome.isDigitSumPalindrome(57))
}
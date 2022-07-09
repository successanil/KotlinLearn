fun main() {
    println(checkPalindrome("taco cat"))
}

fun checkPalindrome(input : String) : Boolean {
    var cArr = input.replace(" ","").toCharArray()
    println(cArr)
    var cStr1 = ""
    var cStr2 = ""
    var halfLength = cArr.size / 2
    for(i in 0..(cArr.size - 1)){
        if(i < halfLength) {
            cStr1+=cArr[i]
        } else if(i > halfLength){
            cStr2 +=cArr[i]
        }
    }
    println(cStr1)
    println(cStr2)
    return cStr1 == cStr2.reversed()
}
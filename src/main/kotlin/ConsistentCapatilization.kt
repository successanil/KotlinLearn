fun main() {
    println(consiCap("this is anil","upper"))
    println(consiCap("this is anil","lower"))
    println(findLongestWord("I love you India"))
}

fun consiCap(incomingstt:String,behavString:String) : String? {
    if(behavString == "upper") {
        return incomingstt.toUpperCase()
    } else if(behavString == "lower") {
        return incomingstt.toLowerCase()
    }
    return null
}

fun findLongestWord(inputPhrase:String) : String {
    var arr = inputPhrase.split(" ")
    var largestStrIndex = 0
    for(i in 0..arr.size - 1) {
       if(arr[i].length > largestStrIndex) {
           largestStrIndex = i
       }
    }

    return arr[largestStrIndex]
}


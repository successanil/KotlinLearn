class RemoveVowels {
    fun removeVowel(b:String):String {
        var retValue = ""
        val vowelArr = arrayOf('a','e','i','o','u')
        val cArr: CharArray = b.toCharArray()


        val mCharArr = cArr.filter {
                    a -> !vowelArr.contains(a)
            }

        for(i in 0 .. mCharArr.size - 1) {
            retValue+=mCharArr[i]
        }

        return retValue

    }

    fun remoteWhiteSpaces(input:String) : String {
        return input.replace("\\s".toRegex(),"")
    }


}

fun main() {
    var rem = RemoveVowels()
    println(rem.removeVowel("I love my vowel"))
    println(rem.remoteWhiteSpaces("Hello brother"))
}
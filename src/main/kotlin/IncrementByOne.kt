fun main(){
    println(encryptStr("anil",2))
    println(decryptStr("cpkn",2))
}

fun encryptStr(input:String, key:Int) : String {
    var c : CharArray = input.toCharArray()
    println(c)
    var retStr = ""
    for(i in 0..c.size - 1) {
        var k = c[i]
        retStr += (k + key).toString()
    }
    return retStr
}

fun decryptStr(input:String,key:Int):String {
    val charArray : CharArray = input.toCharArray()
    var retStr = ""
    for(i in 0..charArray.size - 1) {
        val k = charArray[i]
        retStr += (k-key)
    }
    return retStr
}

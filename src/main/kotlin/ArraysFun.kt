fun main() {

    var strArray = arrayOf("one","two","three")
    var arr2 = arrayOf(1,3,5)

    println(findSecondLargest(arrayOf(122,3,4,11,222,33)))

    println(improveString("this_is_my_input"))


    for(i in strArray) {
        println(i)
    }

    for((i,str) in strArray.withIndex()) {
        println("$str at index $i")
    }
}

fun findSecondLargest(input:Array<Int>) : Int {

    input.sort()
    var j = input.size - 1
    if(input[input.size -2 ] < input[input.size - 1]) {
        return input[input.size - 2 ]
    } else {
        while(input[j-1] == input[j]) {
            j--
        }
        return input[j]
    }


}

fun improveString(input:String) : String
{
    var s = input.split("_")
    var res = s.get(0)
    for(i in 1 .. s.size - 1){
        var firstCharStr = s[i].substring(0,1)
        var remainingStr = s[i].substring(1)
        var capStr = firstCharStr.toUpperCase()
        res += capStr+remainingStr
    }
    return res
}
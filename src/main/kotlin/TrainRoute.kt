fun main() {
    println(printTrainRoute("NY Penn","Woodside"))
    println(secondChallenge(Triple(234,"10.00","Montauk"),"NY Penn","Woodside","Sayville"))
}

fun printTrainRoute(vararg input:String) : String{
    var retStr = ""

    for(i in 0..input.size - 1) {
        retStr+=input[i]
        if(i < input.size - 1) {
            retStr += ","
        }
    }

    return retStr

}

fun secondChallenge(triplet:Triple<Int,String,String>,vararg input:String):String {
    return "${triplet.second} train number ${triplet.first} to ${triplet.third} is stopping at ${printTrainRoute(*input)}"
}

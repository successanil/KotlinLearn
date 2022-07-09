fun main () {

    val aContainer = AContainer(100)
    aContainer.printData()

// val iCon = Container<Int>(3)
  //  println(iCon.getValue())
}

class AContainer<T> (var data:T) {
    fun printData() {
        println(data)
    }
}



//class Container<T>(var data:T) {
//    fun setValue(value:T) {
//        data = value
//    }
//
//    fun getValue() : T {
//        return data
//    }
//}
//
//fun add(vararg  values: Int) {
//    var sum = 0
//    for(i in values) {
//        sum += i
//    }
//
//    println(sum)
//}
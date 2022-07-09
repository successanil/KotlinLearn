fun main () {
    val students = mutableMapOf<Int,String>()


    for((k,v) in students) {
        println("$k - $v")
    }

    val imStudents = mapOf<Int,String>(1 to "Anil",2 to "sunil",3 to "xyz")
    println(imStudents)

}
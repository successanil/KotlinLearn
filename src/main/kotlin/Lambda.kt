fun main() {
    val lamba = { x: Int, y: Int -> x + y }
    println(lamba(5, 6))

    var nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var list2 = nums.filter { 0 != it % 2 }
    println(list2)

    var list3 = nums.map { it * it }
    println(list3)

    var userList = listOf(
        Users(1, "A"),
        Users(2, "b"),
        Users(3, "c")
    )

    var paidList = userList.map {
        PaidUsers(it.a,it.name,"Paid")
    }

    println(paidList)

    nums.forEach{ print("$it ") }

}

data class Users(val a: Int, val name: String)
data class PaidUsers(val a: Int, val name: String, val type: String)

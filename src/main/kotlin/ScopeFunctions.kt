fun main() {
    var e = Employee(name="anil")
    var j = e.apply {
        age = 50
    }

    print(j)

    var x:Int = e.let {
        2
    }

    var c = with(e) {
        age = 30
    }
    println(c)


    // apply , let , with , run





}

data class Employee(var name: String,var age:Int = 10)
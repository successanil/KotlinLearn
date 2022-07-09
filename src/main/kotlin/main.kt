interface delegation {
    fun mymessage()
    fun mymessageLine()
}

class delegationimplementation(val y: String) : delegation {
    override fun mymessage() {
        println(y)
    }

    override fun mymessageLine() {
        println(y)
    }

}

class Newfeature(m:delegation) : delegation by m {
    override fun mymessage() {
        println("GeeksforGeeks")
    }
}

fun main(args: Array<String>) {
    var b = delegationimplementation("Welcome RG")
    Newfeature(b).mymessage()
    Newfeature(b).mymessageLine()
}
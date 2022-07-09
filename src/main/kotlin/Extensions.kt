fun main() {
    println("Hello RG".formattedString())
}

// extension function
fun String.formattedString():String {
    return "--------$this---------"
}
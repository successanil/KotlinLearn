fun main() {
    val n = 10   // no of terms to be printed
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

// fn = fn -1 + fn -2   fibonacci

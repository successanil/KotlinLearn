fun main() {
    printFizzBuzz(17)

}

fun printFizzBuzz(input:Int) {
    for(i in 1..input) {
        if(i % 3 == 0) {
            print("Fizz")
        } else if(i % 5 == 0) {
            print("Buzz")
        } else {
            print(i)
        }
        print(" ")
    }
}
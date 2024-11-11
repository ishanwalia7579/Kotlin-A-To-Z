		// If statement
fun main() {
    val number = 10

    if (number > 0) {
        println("The number is positive.") //positive
    } else if (number < 0) {
        println("The number is negative.") //negative
    } else {
        println("The number is zero.")  
    }
}


	// When Statement
fun main() {
    val x = 2

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3 -> println("x is 3")
        else -> println("x is not 1, 2, or 3")
    }
}

	//For Loop
fun main() {
    for (i in 1..5) {
        println("Iteration $i")
    }
}

 //While Loop                      
fun main() {
    var i = 1
    while (i <= 5) {
        println("Iteration $i")
        i++
    }
}

//Do-While Loop   
 fun main() {
    var i = 1
    do {
        println("Iteration $i")
        i++
    } while (i <= 5)
}

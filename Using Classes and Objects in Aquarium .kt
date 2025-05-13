// This is a simple Kotlin program that defines an Aquarium class and prints its dimensions.
// The Aquarium class has properties for width, height, and length
class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}
output = Width: 20 cm  Length: 100 cm Height: 40 cm 

In buildAquarium(), add code to set the height to 60 and print the changed dimension properties.
class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()      // prints default size
    myAquarium.height = 60      // changes the height
    myAquarium.printSize()      // prints updated size
}

fun main() {
    buildAquarium()
}

output :
Width: 20 cm Length: 100 cm Height: 40 cm 
Width: 20 cm Length: 100 cm Height: 60 cm 

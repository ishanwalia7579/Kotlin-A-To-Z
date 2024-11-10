				//  User Defined Data Type
                data class User(
                    val id: Int, //id
                    val name: String, //name
                     val email: String, //email
                ) {
                    fun displayInfo() {
                        println("User ID: $id")
                        println("Name: $name")
                        println("Email: $email")
                    }
                }
                
                fun main() {
                    val user = User(1, "John Doe", "john.doe@example.com")
                    user.displayInfo()
                }
                
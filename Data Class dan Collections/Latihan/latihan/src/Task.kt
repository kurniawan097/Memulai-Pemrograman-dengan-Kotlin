data class DataUser(val name : String, val age : Int, val address : String)
fun main() {

    // TODO 1

    val dataUser = DataUser("John", 23, address = "St. Petersburg")



    // TODO 2
    val name = dataUser.component1()
    val age = dataUser.component2()
    val address = dataUser.component3()

    // TODO 3
    println("User")
    println("Name: $name")
    println("Age: $age")
    println("Address: $address")

}
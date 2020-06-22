

// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
    var kucing: String = "Gippy"
        get(){
            println("Fungsi getter dipanggil")
            return field
        }
        set(value){
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if(sleep){
            println("$kucing, sleep!")
        }
        else{
            println("$kucing, let's play!")
        }
    }

}

fun main() {

    // TODO 2
    val gippy = Cat("")


    gippy.toSleep()
    gippy.sleep = true
    gippy.kucing = "Gippy"
    gippy.toSleep()




}
import java.util.*

fun main() {

    var likes: Int = 0
    val chel = "Человеку"
    val lud = "Людям"

    println("Ведите количество лайков")

    val scan = Scanner(System.`in`)

    likes = scan.nextLine().toInt()


    if ((likes > 1) && (likes % 10 != 1))
        println("Понравилось $likes $lud")
    else println("Понравилось $likes $chel")
}



fun main() {

    var likes: Int = 0
    val chel = "Человеку"
    val lud = "Людям"

    println("Ведите количество лайков")

    likes = readln().toInt()

    val reducedLikes = likes % 100

    if ((likes % 10 != 1) || (likes % 100 == 11))
        println("Понравилось $likes $lud")
    else println("Понравилось $likes $chel")
    println(reducedLikes)
}
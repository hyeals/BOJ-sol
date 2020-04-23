import java.util.*

fun main (args: Array<String>) {
    var src = Scanner(System.`in`)
    var people: Int = src.nextInt()
    var kim: Int = src.nextInt()
    var lim: Int = src.nextInt()
    var round: Int = 0

    while(kim != lim){
        kim = kim / 2 + kim % 2
        lim = lim / 2 + lim % 2

        round ++
    }

    println(round)
}

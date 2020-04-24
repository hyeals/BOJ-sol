import java.util.*

fun main(args: Array<String>){
    var src = Scanner(System.`in`)
    var people: Int = src.nextInt()
    var time: ArrayList<Int> = ArrayList<Int>(people)
    var sum: Int = 0

    for(i in 0 until people){
        time.add(src.nextInt())
    }

    time.sort()

    for(i in 1..people){
        for(j in 0 until i){
            sum += time[j]
        }
    }

    println(sum)
}

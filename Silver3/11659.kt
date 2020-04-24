import java.util.*
import kotlin.collections.ArrayList

fun main (args: Array<String>){
    var src = Scanner(System.`in`)
    var N: Int = src.nextInt()
    var M: Int = src.nextInt()
    var list: ArrayList<Int> = ArrayList<Int>(N+1)
    var start: Int = 0
    var end: Int = 0

    list.add(0)

    for(i in 1..N){
        list.add(list[i-1] + src.nextInt())
    }

    for(i in 0 until M){
        start = src.nextInt()
        end = src.nextInt()

        println(list[end] - list[start-1])
    }
}

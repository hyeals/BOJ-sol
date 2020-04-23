import java.util.*
import kotlin.collections.ArrayList

fun main (args: Array<String>){
    var src = Scanner(System.`in`)
    var count: Int = src.nextInt()
    var numbers: ArrayList<String> = ArrayList<String>(count)
    var list: List<String>

    for(i in 0 until count){
       numbers.add(src.next())
    }

    list = numbers.sortedWith(Comparator<String> { a,b ->

        when {
            a.length > b.length -> 1

            a.length < b.length -> -1

            else -> when{
                findNum(a) > findNum(b) -> 1

                findNum(a) < findNum(b) -> -1

                else -> when {
                    a > b -> 1
                    a < b -> -1
                    else -> 0
                }
            }
        }

    })

    for(i in 0 until count){
        println(list[i])
    }

}

fun findNum(str: String): Int{
    var sum: Int = 0
    var range: Int = str.length-1

    for(i in 0..range){
        if(str[i].toChar() >= '0' && str[i] <= '9' ){
            sum += str[i] - '0'
        }
    }
    return sum
}

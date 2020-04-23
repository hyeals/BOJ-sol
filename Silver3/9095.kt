import java.util.*

fun main(args: Array<String>){
    var src = Scanner(System.`in`)
    var case: Int = src.nextInt()
    var input: Int
    var com: ArrayList<Int> = ArrayList<Int>(11)

    for(i in 0 until 11){
        com.add(0)
    }

    com[0] = 1
    com[1] = 2
    com[2] = 4

    for(i in 3 until com.size){
        com[i] = com[i-1] + com[i-2] + com[i-3]
    }

    for(i in 0 until case){
        input = src.nextInt()
        println(com[input-1])
    }

}

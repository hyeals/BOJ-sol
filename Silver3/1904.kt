import java.util.*

fun main (args : Array<String>){
    var src = Scanner(System.`in`)
    var input: Int = src.nextInt()
    var list: ArrayList<Int> = ArrayList<Int>(input+1)

    list.add(0)
    list.add(1)
    list.add(2)

    for(i in 3..input){
        list.add((list[i-2] + list[i-1]) % 15746)
    }

    println(list[input])

}

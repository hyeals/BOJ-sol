import java.util.*
import kotlin.collections.ArrayList


fun main(args: Array<String>){
    var src = Scanner(System.`in`)
    var input = src.nextLine()
    var arr: List<String> = ArrayList<String>(input.length)
    var plus: List<String> = ArrayList<String>(input.length)
    var result: Int = 0
    var count: Int = 0

    arr = input.split('-').toMutableList()

    for(a in arr){
        if(a.contains('+')){
            plus = a.split('+')

            for(b in plus.indices){
                result += plus[b].toInt()
            }

            arr[count] = result.toString()
        }

        count ++
        result = 0
    }

    for(a in arr.indices){
        if(a == 0){
            result += arr[a].toInt()
        } else{
            result -= arr[a].toInt()
        }
    }

    println(result)

}

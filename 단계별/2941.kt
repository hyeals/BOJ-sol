import java.util.*

// c=, c-, dz=, d-, lj, nj, s=, z=

fun main(args: Array<String>){
    var word: List<String> = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var src = Scanner(System.`in`)
    var input : String = src.nextLine().trim()

    for(i in 0..7){
           input = input.replace(word[i],"*")
    }

    println(input.length)
}


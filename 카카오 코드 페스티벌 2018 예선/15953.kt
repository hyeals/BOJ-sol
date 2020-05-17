import java.util.*

fun main(args:Array<String>){
    var src = Scanner(System.`in`)
    var case: Int = src.nextInt()
    var result: Int = 0

    for(i in 0 until case){
        var a: Int = src.nextInt()
        var b: Int = src.nextInt()

        if(a == 1){
            result += 5000000
        }else if(2<=a && a<=3){
            result += 3000000
        }else if(4<=a && a<=6){
            result += 2000000
        }else if(7<=a && a<=10){
            result += 500000
        }else if(11<=a && a<=15){
            result += 300000
        }else if(16<=a && a<=21){
            result += 100000
        }

        if(b == 1){
            result += 5120000
        }else if(2<=b && b<=3){
            result += 2560000
        }else if(4<=b && b<=7){
            result += 1280000
        }else if(8<=b && b<=15){
            result += 640000
        }else if(16<=b && b<=31){
            result += 320000
        }
        
        println(result)
        result = 0
        
    }
}

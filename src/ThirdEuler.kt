var num = 600851475143
var i = 2
var zero : Long = 0
fun doThis(){
    while(i * i < num){
        while(num % i == zero){
            num = num / i
        }
        i = i + 1
    }

    println(num)
}

fun main(args : Array<String>){
    doThis()
}
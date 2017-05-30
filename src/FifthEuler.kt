/**
 * Created by root on 5/30/17.
 */
fun getDivisors(){
    for(i in 1..535285527){
        if(i%16 ==0 &&i%9==0&&i%5==0&&i%6==0&&i%7==0&&i%10==0&&i%11==0&&i%12==0&&i%13==0&&i%14==0
                &&i%15==0&&i%17==0&&i%18==0&&i%19==0&&i%20==0){
            println(i)
            break
        }
    }
}

fun main(args : Array<String>){
    getDivisors()
}

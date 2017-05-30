/**
 * Created by root on 5/30/17.
 */
import EulerThree
fun main(args : Array<String>){
    var two : Int = 2
    var infinity : Int = 150000
    var primes = ArrayList<Int>()
    primes.add(2)
    for(i : Int in two..infinity){
        if(EulerThree.isPrime(i)){
            primes.add(i)
        }
    }
    println(primes)
    println(primes[10000])
}

/**
 * Created by root on 5/30/17.
 */
fun getSquares(n: Int){
    var sumOfSquares : Int = 0
    var squareOfSum : Int = 0
    var sum : Int = 0
    for(i in 1..n){
        sumOfSquares += i*i
        sum +=i
    }
    squareOfSum = sum * sum
    print(squareOfSum-sumOfSquares)
}
fun main(args : Array<String>){
    getSquares(100)
}
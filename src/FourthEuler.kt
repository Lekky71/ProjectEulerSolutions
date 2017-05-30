import java.util.*
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashSet

/**
 * Created by root on 5/29/17.
 */
fun getAllPals(){
    val pals = LinkedHashSet<Int>()
    for(i in 111..999){
        for(j in 111..999){
            var num = i * j
            if(num.toString() == num.toString().reversed()){
                pals.add(num)
            }
        }
    }

    println(pals)
    println(Collections.max(pals))
}

fun main(args : Array<String>){
    getAllPals()
}

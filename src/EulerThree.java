import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by root on 5/29/17.
 */
class EulerThree {

    public static boolean isPrime(int number){
        boolean prime = false;
        for(int i = 2;i<number;i++){
            if(number == 2){
                prime = true;
            }
            else if(number%i == 0){
                prime = false;
                break;
            }else{
                prime = true;
            }
        }
        return prime;
    }
    public static ArrayList<Integer> getFactors(int number){
        ArrayList<Integer> factors = new ArrayList<>() ;
        for(int i = 1;i<=number;i++){
            if(number%i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static void main(String[] args){
        int number = 13195;
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for(int i=1;i<number;i++){
            if(isPrime(i) && getFactors(number).contains(i)){
                primeFactors.add(i);
            }
        }
        Collections.sort(primeFactors);
        System.out.println(primeFactors);
        System.out.println(primeFactors.indexOf(primeFactors.size()-1));
    }
}

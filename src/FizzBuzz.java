/**
 * Created by Pondd on 5/3/2016 AD.
 */
public class FizzBuzz {
    public String getResult(int s){
        if (((s%3)==0)&&((s%5)==0))
            return  "FizzBuzz";
        else if ((s%3)==0)
            return "Fizz";
        else if ((s%5)==0)
            return "Buzz";
        else
            return ""+s;
    }
}

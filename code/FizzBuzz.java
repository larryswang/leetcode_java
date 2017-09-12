import java.util.*;
public class FizzBuzz{
    public List<String> FizzBuzz (int n){
        List <String> list=new ArrayList();
        int i=1;
        while(i<=n){
        if ((i%3==0)&&(i%5!=0)){
                list.add("Fizz");
                i++;
        }
        else if((i%5==0)&&(i%3!=0)){
                list.add("Buzz");
                i++;
        }
        else if((i%5==0)&&(i%3==0)){
                list.add("FizzBuzz");
                i++;
        }
        else{
                list.add(i+"");
                i++;
        }

        }
                return list;
    }
}

public class Palindrome{
    public boolean isPalindrome (int x){
        int result=0;
        int origin=x;
        while(x!=0){
        int tail= x%10;
        int temp=tail+result*10;
        
        result=temp;
        x=x/10;
        }
        if(result==origin){
            return true;
        }
        else{
            return false;
        }
    }
}
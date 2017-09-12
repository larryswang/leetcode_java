public class ConvertToBase7 {
    public String convertToBase7(int num) {
        int reminder=0;
        int sevens=7;
        int result=0;
        while(num>sevens){
            reminder=num%sevens;
            sevens=sevens*7;
            result=result*10+reminder;
        }
    }
}
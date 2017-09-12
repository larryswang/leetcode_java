public class GetSum {
    public int getSum(int a, int b) {
        if (a == 0) return b;
        while(b!=0){
            a=a^b;
            b=(a&b)<<1;
        }
        return a;
    }
}
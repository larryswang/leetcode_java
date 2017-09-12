public class ComplementNumber{
    public int findCompliment(int num){
        return ~num & (Integer.highestOneBit(num) - 1); 
    }
}
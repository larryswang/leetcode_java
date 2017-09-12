public class HammingDistance{
    public int HammingDistance(int x,int y){
        int result=0;
        int i=0;
        String binaryX = java.lang.Integer.toBinaryString(x);
        String binaryY = java.lang.Integer.toBinaryString(y);
        while(i<binaryX.length()&&i<binaryY.length()){
            if(binaryX.charAt(i)!=binaryY.charAt(i)){
                result++;
            }
            i++;
        }
        if(binaryX.length()<binaryY.length()){
            for(int j=binaryX.length();j<binaryY.length();j++){
                while (binaryY.charAt(j)=='1'){
                    result++;}  
        }
        }
        else{
            for(int j=binaryY.length();j<binaryX.length();j++){
                while (binaryX.charAt(j)=='1'){
                    result++;}  
        }
        }
        return result;
    }
}
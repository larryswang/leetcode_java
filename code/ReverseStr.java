public class ReverseStr {
    public String reverseStr(String s, int k) {
        String result="";
        for(int i=0;i<s.length();i+=k){
            if((i%(2*k))==0){
                result+=reverse(s.substring(i,Math.min(i+k,s.length()-1)));
            }
            if((i%(2*k))==k){
                result+=s.substring(i,Math.min(i+k,s.length()-1));
            }
        }
        return result;
    }
    public String reverse(String str){
        char[] array=str.toCharArray();
        char temp;
        for(int i=0;i<(array.length/2);i++){
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        return new String(array);
    }
    }

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] array= new int[52];
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'a'>=0)&&(s.charAt(i)-'a'<=25))
                array[s.charAt(i)- 'a']++;
            else
                array[s.charAt(i)- 'A'+ 26]++;
        }
        int result=0;
        int index=0;
        for(int i=0;i<52;i++){
            if(array[i]%2==0)
            result+=array[i];
            if(array[i]%2==1){
            result+=array[i]-1;
                index=1;
            }
        
    }
    return result+index;
    }
    }
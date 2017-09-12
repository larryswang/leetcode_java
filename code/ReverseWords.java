public class ReverseWords{
    public String reverseWorlds (String s){
        String [] words = s.split("[ ]",0);
        String result="";
        for(String word: words)
        {
            char[] wordArray= word.toCharArray();
            for(int j=0;j<wordArray.length/2;j++){
                char temp=wordArray[j];
                wordArray[j]=wordArray[wordArray.length-j-1];
                wordArray[wordArray.length-j-1]=temp;
            }
            String newWord=String.copyValueOf(wordArray);
            result= result+newWord+" ";
        }
       return result.trim();
    }
}
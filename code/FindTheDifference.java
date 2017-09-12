//Solution one
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char result=0;
        for(int i=0;i<s.length();i++) result^=s.charAt(i);
        for(int i=0;i<t.length();i++) result^=t.charAt(i);
        return result;
    }
}

//Solution two
public class FindTheDifference{
    public char findTheDifference(String s, String t){
        int result=0;
        for(int i=0;i<t.length();i++) result +=(int)t.charAt(i);
        for(int i=0;i<s.length();i++) result -=(int)s.charAt(i);
        return (char)result;
    }
}
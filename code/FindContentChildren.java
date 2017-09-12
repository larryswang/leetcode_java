import java.util.*;
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
                Stack<Integer>stack=new Stack<Integer>();
        int result=0;
        for(int sElement:s) stack.push(sElement);
        for(int gElement:g){
            while(!stack.isEmpty()){
                if(gElement<=stack.peek()){
                    stack.pop();
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
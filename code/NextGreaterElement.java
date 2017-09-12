import java.util.*;
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findnums, int[] nums){
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        Stack<Integer>stack= new Stack<Integer>();
        for(int num:nums){
            if(!stack.isEmpty()&&stack.peek()<num){
                map.put(stack.pop(),num);
            }
        stack.push(num);
        }
        for(int i=0;i<findnums.length;i++){
            findnums[i]=map.getOrDefault(findnums[i],-1);
        }
        return findnums;
    }
}
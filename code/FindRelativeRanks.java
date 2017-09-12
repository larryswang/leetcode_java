import java.util.*;
public class FindRelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        String[] result=new String[nums.length];
        int[] copy=new int[nums.length];
        copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],nums.length-i);
        for(int i=0;i<nums.length;i++){
            result[i]=map.get(copy[i])+"";
            if(result[i].equals("1")) result[i]="Gold Medal";
            if(result[i].equals("2")) result[i]="Silver Medal";
            if(result[i].equals("3")) result[i]="Bronze Medal";
        }
        return result;
    }
}
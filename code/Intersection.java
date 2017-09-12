public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set=new Hashset<Integer>();
        Set <Integer> intersect=new Hashset<Integer>();
        for(int num:nums1){
        set.add(num);
        }
        for(int num:nums2){
            if(set.containsKey(num));
            intersect.add(num);
        }
        int[] result=new int[intersect.size()];
        int i=0;
        for(Integer num:intersect){
            result[i++]=num;
        }
        return result;
    }
}
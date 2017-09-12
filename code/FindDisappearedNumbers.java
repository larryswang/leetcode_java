public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedList<Integer>list=new LinkedList <Integer>();
        for(int i=0;i<nums.length;i++) list.add(i+1);
        for(int num:nums){
            if(list.indexOf(num)!=-1){
                list.remove(list.indexOf(num));
            }
        }
        return list;
    }
}
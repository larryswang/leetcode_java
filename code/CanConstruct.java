public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char[] ransomNoteArray=ransomNote.toCharArray();
        char[] magazineArray=magazine.toCharArray();
        for(char c:magazineArray) map.put(c,0);
        for(char c:magazineArray) map.put(c,map.get(c)+1);
        for(char c:ransomNoteArray) {
            if(!map.containsKey(c)) return false;
            else{
                map.put(c,map.get(c)-1);
                if(map.get(c)<0) return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        for(int i:map.keySet())
        {
            if(!list.contains(map.get(i)))
                list.add(map.get(i));
            else
                return false;
        }
        return true;
    }
}
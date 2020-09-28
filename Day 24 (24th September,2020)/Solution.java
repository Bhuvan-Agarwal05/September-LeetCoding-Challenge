class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";
        PriorityQueue<String> pQ = new PriorityQueue<>((a,b) -> Long.valueOf(b+a).compareTo(Long.valueOf(a+b)));
        for (int num : nums) {
            pQ.add(String.valueOf(num));
        }
        StringBuffer sb = new StringBuffer();

        while(!pQ.isEmpty()) {
            sb.append(pQ.remove());
        }
        return sb.toString().startsWith("0")? "0" : sb.toString();
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> map = new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
             String s1 = strs[i];
             char[] s1Array= s1.toCharArray();
             Arrays.sort(s1Array);
             String sortedString = String.valueOf(s1Array);

             if(map.containsKey(sortedString))
             {
                map.get(sortedString).add(s1);
             }
             else
             {
                 List<String> list = new ArrayList<>();
                list.add(s1);

                map.put(sortedString, list);
             }
            
       }
        return new ArrayList<>(map.values());
    }
}
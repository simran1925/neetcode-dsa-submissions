class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] visited = new int[s.length()];
     for(int i=0;i<s.length();i++)
     {
        int j;
        for(j=0;j<t.length();j++)
        {
            if(s.charAt(i)==t.charAt(j) && visited[j]!=1)
            {
                visited[j]=1;
                break;
            }
        }
        if(j==t.length())
        {
            return false;
        }
     }
     return true;
    }
}

class Solution {
    public int partitionString(String s) {
      int i=0;
        int j=0;
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }
            else{
                ans++;
                map.clear();
                map.put(s.charAt(j),1);
            }
            j++;
        }
    return ans+1;
    }
}

// if a repeated value comes make a partition clear the map and start again
// abacaba
/*
add a
add b
add a? no repeated value therefore make partition ab | acaba
clear map and add the next 'a' the ab | Acba the capital A to the map

now,
if u make 4 partitions u have 5 substrings
----|---|----
two partitions = 3 substrings
*/
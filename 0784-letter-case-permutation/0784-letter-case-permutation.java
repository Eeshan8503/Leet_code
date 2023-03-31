class Solution {
    public List<String> letterCasePermutation(String s) {
         char[] arr =s.toCharArray();
         List<String> ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        func(ans,0,arr,set);
        return ans;
    }
   public void func(List<String> ans, int count, char[] s,HashSet<String> set){
//        System.out.println("count is "+count);
        // if(set.contains(String.valueOf(s))){
        //     return;
        // }
        if(s.length==count){
//            System.out.println("here");
            ans.add(String.valueOf(s));
            set.add(String.valueOf(s));
//            System.out.println(String.valueOf(s));
            return;
        }
        if(Character.isDigit(s[count])){
//            System.out.println("Digit encounterd "+s[count]);
            func(ans,count+1,s,set);
            return;
        }
        
           func(ans,count+1,s,set);
            inverter(s,count);
            func(ans,count+1,s,set);
            // inverter(s,i);

        
    }
    public void inverter(char arr[],int i){
        if(Character.isUpperCase(arr[i])){
            arr[i]=Character.toLowerCase(arr[i]);
        }
        else{
            arr[i]=Character.toUpperCase(arr[i]);
        }
    }
}
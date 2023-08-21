class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String>ds=new ArrayList<>();
        func(0,res,ds,s);
        return res;
    }
    public void func(int ind,List<List<String>> res,List<String>ds,String s){
        if(ind==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(ispalen(s.substring(ind,i+1))){
                ds.add(s.substring(ind,i+1));
                func(i+1,res,ds,s);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean ispalen(String a){
        StringBuffer buf=new StringBuffer(a);
        buf.reverse();
        return a.equals(buf.toString());
    }
}
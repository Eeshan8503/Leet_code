class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // int i=0,j=0;
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        String ans;
        for(int i=0;i<str2.length();i++){
            String candidate=str2.substring(i);
            // System.out.println("candidate is "+candidate);
            if(concatenator(str1,candidate) && concatenator(str2,candidate))
                return candidate;
        }
        return "";
    }

    public boolean concatenator(String s1,String s2){
        // System.out.println("Checking for "+s1+" and "+s2);
        if(s1.length()%s2.length()!=0)
        return false;

        int n=s1.length()/s2.length();
        String answer="";
        for(int i=0;i<n;i++){
            answer+=s2;
        }

        // System.out.println("answer "+answer);
        if(s1.equals(answer)){
            // System.out.println("true");
            return true;
        }
        // System.out.println("false");
        return false;
    }
}
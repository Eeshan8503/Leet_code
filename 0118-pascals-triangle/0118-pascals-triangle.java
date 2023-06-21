class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> tempp=new ArrayList<Integer>();
        tempp.add(1);
        ans.add(tempp);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add((ans.get(i-1).get(j-1))+(ans.get(i-1).get(j)));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
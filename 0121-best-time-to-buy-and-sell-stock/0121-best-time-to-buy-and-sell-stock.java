class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
          for(int i=0;i<prices.length-1;i++){
            prices[i]=prices[i+1]-prices[i];
        }
        int new_length=prices.length-1;

        int global_max=prices[0],max=prices[0];
        for(int i=1;i<new_length;i++){

            max=Math.max(max+prices[i],prices[i]);
            if(max>global_max){
                global_max=max;

            }
        }
        if(global_max<0){
            return 0;
        }
        return global_max;
        
    }
}
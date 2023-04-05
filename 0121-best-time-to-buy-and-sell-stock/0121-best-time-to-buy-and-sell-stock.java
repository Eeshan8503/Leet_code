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
/*
WITH INDEXES TO SELL AND BUY
int buy_ind=0;
int sell_ind=0;
for(int i=1;i<new_length;i++){
            max=Math.max(max+prices[i],prices[i]);
            if(max>global_max){
                global_max=max;
                if(max+prices[i]>prices[i]){
                    sell_ind=i;
                }
                else{
                    buy_ind=i;
                }

            }
        }
        buy_ind+=1;
        sell_ind+=1;
*/
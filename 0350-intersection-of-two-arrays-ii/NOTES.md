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
​
}
}
buy_ind+=1;
sell_ind+=1;
System.out.println(Arrays.toString(prices));
System.out.println(global_max);
System.out.println(buy_ind+"\t"+sell_ind);
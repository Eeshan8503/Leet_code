public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones=0;
        while(n!=0){
            ones+=n&1;//ones+=n%10;
            n=n>>>1;//n=n/10
        }
        
        return ones;
    }
}

//the otherlogic works only without leading 0's as java takes numbers as binary if leading zeros exist
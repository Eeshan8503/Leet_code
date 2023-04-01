class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if((n & (n-1))==0)
        return true;

        return false;
    }
}
/*
the and of a power of two say n and n-1 is always 0

00....10    2
00...100    4

00....11    3

therefore 3 & 4 is always 0 
but non power of 2 gurantees an extra one that makes atleast one bit computaion not '0' hence not 0
*/

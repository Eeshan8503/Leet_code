class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int num_boats=0;
        while(i<=j){
            num_boats++;
            if(people[j]+people[i]<=limit){
                i++;
            }
            j--;
        }
        return num_boats;
    }
}
class Solution {
    public int[] rearrangeArray(int[] arr) {
        int res[]=new int[arr.length];
        int pi=0;
        int ni=1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<0){
                res[ni]=arr[i];
                ni=ni+2;


            }
            else{
                res[pi]=arr[i];
                pi=pi+2;
            }
        }
        return res;
       
    }
}

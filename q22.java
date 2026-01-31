class Solution {
    public int maxProfit(int[] arr) {
        int buyPrice=arr[0];
        int profit=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }
            else{
                int currentProfit=arr[i]-buyPrice;
                profit=Math.max(profit,currentProfit);
            }
        }
        return profit;
       
    }
}

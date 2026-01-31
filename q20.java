import java.util.*;
class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int majorityElement=-1;
        int n=arr.length;
        int val=(int) Math.floor((double)n/2);


        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>val){
                majorityElement=num;
                break;
            }
        }
        return majorityElement;




       
       
    }
}

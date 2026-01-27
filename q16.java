import java.util.HashMap;

class Main{
  public static void main(String[] args) {
    int arr[]={4,1,2,1,2};
    HashMap<Integer,Integer>result=new HashMap<>();
    for(int i=0;i<=arr.length-1;i++){
      if(result.containsKey(arr[i])){
        result.put(arr[i],result.get(arr[i])+1);
      }
      else{
        result.put(arr[i],1);
      }
    }
   
   
    for(int key:result.keySet()){
      if(result.get(key)==1){
        System.out.println(key);
        break;
      }
     
    }
  }
}

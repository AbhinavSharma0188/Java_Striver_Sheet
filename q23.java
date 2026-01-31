import java.util.ArrayList;
import java.util.Collections;


class Main{
  public static void main(String[] args) {
    int arr[]={16,17,4,3,5,2};
    ArrayList<Integer>list=new ArrayList<>();
    int maxFromRight=arr[arr.length-1];
    list.add(maxFromRight);
    for(int i=arr.length-2;i>=0;i--){
      int currentVal=arr[i];
    if(currentVal >= maxFromRight)
 {
        maxFromRight=currentVal;
        list.add(maxFromRight);
      }
    }
    Collections.reverse(list);
    System.out.println(list);
   
  }
}

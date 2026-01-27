import java.util.HashSet;


class Main{
  public static void main(String[] args) {
    HashSet<Integer>set=new HashSet<>();
    HashSet<Integer>intersection=new HashSet<>();
    int arr1[]={1,2,2,1};
    int arr2[]={2,2};
    for(int num:arr1){
      set.add(num);


   
     
    }
    for(int num:arr2){
      if(set.contains(num)){
      intersection.add(num);
     


      }
    }
    System.out.println(intersection);


  }
}

class Main{
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    Boolean isSorted=true;
   
   
   
   for(int i=0;i<=arr.length-2;i++){
    int j=i+1;
    if(arr[i]>arr[j]){
      isSorted=false;
      break;


    }
   
   
   
   }
System.out.println(isSorted);
   
  }
}

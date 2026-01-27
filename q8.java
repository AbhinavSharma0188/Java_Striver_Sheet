class Main{
  public static void main(String[] args) {
    int arr[]={2,3,89,4,5};
    int smallest=Integer.MAX_VALUE;
   
   for(int i=0;i<=arr.length-1;i++){
    if(smallest>arr[i]){
      smallest=arr[i];
    }
   }
System.out.println(smallest);
   
  }
}

class q7{
  public static void main(String[] args) {
    int arr[]={2,3,89,4,5};
    int largest=Integer.MIN_VALUE;
   
   for(int i=0;i<=arr.length-1;i++){
    if(largest<arr[i]){
      largest=arr[i];
    }
   }
System.out.println(largest);
   
  }
}

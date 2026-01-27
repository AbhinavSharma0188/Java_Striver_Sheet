class Main{
  public static void main(String[] args) {
    int arr[]={9,6,4,2,3,5,7,0,1};
    int n=arr.length;
    int total=n*(n+1)/2;
    int sum=0;
    for(int i=0;i<=arr.length-1;i++){
       sum=sum+arr[i];
    }
    int missing=total-sum;
    System.out.println(missing);


  }
}

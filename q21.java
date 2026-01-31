class Main {
  public static void main(String[] args) {
    int arr[]={-2,1,-3,4,-1,2,1,-5,4};
    int cs = arr[0];
    int ms = arr[0];


    for(int i=1;i<arr.length;i++){
      cs = Math.max(arr[i], cs + arr[i]); // either extend subarray or start new
      ms = Math.max(ms, cs);             // update max sum
    }


    System.out.println(ms); // Output: 6
  }
}

import java.util.HashSet;


class Main {
  public static void main(String[] args) {
    int arr[] = {1,2,3,3,3,3,4,4,4,4,5};
    HashSet<Integer> set = new HashSet<>();


    for (int num : arr) {
      set.add(num);  // duplicates are ignored automatically
    }


    System.out.println(set);  // Output: [1, 2, 3, 4, 5]
  }
}



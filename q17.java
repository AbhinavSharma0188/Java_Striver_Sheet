import java.util.TreeSet;


class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(); // TreeSet keeps elements sorted


        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3};


        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);


        System.out.println("Union (sorted): " + set);
        System.out.println("Count: " + set.size());
    }
}



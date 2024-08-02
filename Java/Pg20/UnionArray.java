import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args){
        int[] arr1 = {2, 3, 5, 8, 9};
        int[] arr2 = {2, 4, 6, 8, 13};
        ArrayList<Integer> update = new ArrayList<>();

        for(int i : arr1){
            if(!update.contains(i)){
                update.add(i);
            }
        }

        for(int i : arr2){
            if(!update.contains(i)){
                update.add(i);
            }
        }

        System.out.println("The new union list is : " +update);
    }
    
}

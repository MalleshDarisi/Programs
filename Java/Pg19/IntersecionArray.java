import java.util.ArrayList;

public class IntersecionArray {
    public static void main(String[] args){
        int[] arr1 = {2, 4, 5, 8, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        ArrayList<Integer> update = new ArrayList<>();

        for(int i = 0 ; i < arr1.length; i++){
            for(int j = 0; j < arr2.length;  j++){
                if(arr1[i] == arr2[j]){
                    update.add(arr1[i]);
                    if(!update.contains(arr1[i])){
                        update.add(arr1[1]);
                    }
                }
            }
        }
        System.out.println("The new list is : " + update);
    }
}

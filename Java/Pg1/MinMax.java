public class MinMax{
    public static void main(String[] args){
        int[] arr = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The min number is :" +min);
        System.out.println("The max number is :" +max);

    }
}
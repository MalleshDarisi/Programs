public class EvenArr {
    public static void main(String[] args){
        int[] num = {34, 67, 81, 97, 45, 54, 90, 83};

        for(int i = 1; i <= num.length; i += 2){
            System.out.print(num[i]+" ");
        }
    }
}

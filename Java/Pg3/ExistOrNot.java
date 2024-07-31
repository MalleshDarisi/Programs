public class ExistOrNot {
    
    public static void main(String[] args){
        int[] num = {34, 67, 81, 97, 45, 54, 90, 83};
        int find = 4;
        boolean flag = false;

        for (int i = 0; i < num.length; i++){
            if (num[i] == find){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(find +" is present in the list");
        }
        else{
            System.out.println(find + "is not in the list");
        }
    }
}

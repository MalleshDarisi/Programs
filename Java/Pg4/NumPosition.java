public class NumPosition {
    public static void main(String[] args){
        int[] num = {34, 67, 81, 97, 45, 54, 90, 83};
        int find = 45;
        int position = 0;
        boolean flag = false;

        for (int i = 0; i < num.length; i++){
            if (num[i] == find){
                flag = true;
                position = i;
                break;
            }
        }
        if(flag){
            System.out.println(find +" is present in this "+ (position + 1));
        }
        else{
            System.out.println(find +" is not in the list");
        }
    }
    
}

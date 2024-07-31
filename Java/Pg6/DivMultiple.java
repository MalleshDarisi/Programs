public class DivMultiple {
    public static void main(String[] args){
        int[] num = {34, 67, 81, 97, 45, 54, 90, 83};
        int two = 0;
        int three = 0; 
        int five = 0;

        for(int i = 0; i < num.length; i ++){
            if(num[i] % 2 == 0){
                two = two + 1 ;
            }
            if(num[i] % 3 == 0){
                three = three + 1 ;
            }
            if(num[i] % 5 == 0){
                five = five + 1 ;
            } 
        }
        System.out.println("Count of numbers divisible by 2:" + two);
        System.out.println("Count of numbers divisible by 3:" + three);
        System.out.println("Count of numbers divisible by 5:" + five);

    }
    
}

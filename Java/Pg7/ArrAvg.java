public class ArrAvg {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6};
        int sum = 0;
        double avg;

        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        avg = (double) sum/(num.length);
        System.out.println("AVERAGE IS: " + avg);
    }
}

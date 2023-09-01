public class Numbers {
    public static void main(String[] args) {
        boolean answer = displaySumIsLessThan100(55, 45);
        System.out.println(answer);
    }
    public static boolean displaySumIsLessThan100(int a,int b){
        boolean result = false;
        if (a + b < 100){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

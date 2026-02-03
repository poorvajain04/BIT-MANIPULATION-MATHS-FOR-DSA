public class Find_No_of_Digits_in_Base_b {
    public static int digits(int n, int b){
        return (int) (Math.log(n)/Math.log(b))+1;
    }
    public static void main(String[] args) {
        int n=34567;
        int b=2;
        System.out.println(digits(n,b));
        System.out.println(Integer.toBinaryString(n));
    }
}

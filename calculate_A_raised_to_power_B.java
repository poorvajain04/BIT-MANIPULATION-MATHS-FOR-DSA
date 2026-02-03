public class calculate_A_raised_to_power_B {
    public static int power(int a,int b){
        int base=a;
        int pow=b;
        int ans=1;
        while(pow>0) {
            if ((pow & 1) == 1) {
                ans *= base;
            }
            base *= base;
            pow >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int base=3;
        int pow=6;
        System.out.println(power(base,pow));
    }
}

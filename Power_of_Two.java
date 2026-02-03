public class Power_of_Two {
    public static boolean powerOfTwo(int n){
        while(n>1){
            if((n&1)==1){
                return false;
            }
            n>>=1;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=4;
        System.out.println(powerOfTwo(num));
    }
}

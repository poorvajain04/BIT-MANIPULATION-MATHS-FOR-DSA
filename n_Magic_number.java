public class n_Magic_number {
    public static int magicNumber(int n){
        int result=0;
        while(n>0){
            for(int i=1;i<=32;i++){
                result+=((n&1)*Math.pow(5,i));
                n>>=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(magicNumber(n));
    }
}

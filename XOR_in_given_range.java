public class XOR_in_given_range {
    public static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(xor(b)^xor(a-1));
    }
}

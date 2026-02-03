public class Find_no_Of_set_Bits {
    public static int setBits(int a){
        int count=0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=16;
        System.out.println(setBits(num));
    }
}

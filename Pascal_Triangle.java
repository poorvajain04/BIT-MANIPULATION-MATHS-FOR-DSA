public class Pascal_Triangle {
    public static int pascalTriangle(int num){
        return (1<<num-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(pascalTriangle(n));
    }
}

public class _2_Boolean {
    public static void main(String[] args) {
        // 예시 1
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if(isTall){
            System.out.println("크다");
        }

        // 예시 2
        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);  // true

    }
}

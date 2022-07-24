public class _1_Number {
    public static void main(String[] args) {
        // 1. 정수. long 타입은 L접미사 필수
        int age = 10;
        long countOfStar = 88888888888888L;

        // 2. 실수. float 사용하기 위해 F 접미사 필수
        float pi = 3.14F;
        double morePi = 3.14111111111111;

        //3. 8진수와 16진수
        // 0으로 시작하면 8진수, 0x로 시작하면 16진수
        int octal = 023;    // 십진수: 19
        int hex = 0xC;     // 십진수: 12


        // 4. 숫자 연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);   // 2
        System.out.println(a%6);   // 4


        // 5. 증감 연산
        // i++: 값이 참조된 후 증가, ++i: 값이 참조되기 전 증가
        int i = 0;
        i++;
        System.out.println(i);  // 1
        System.out.println(i++); // 1
        System.out.println(i);  // 2

    }
}
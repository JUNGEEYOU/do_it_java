public class _4_String {
    public static void main(String[] args) {
        String s = "happy java";    // 해당 방식으로 생성 추천
        String s2 = new String("happy java");
        System.out.println(s);
        System.out.println(s2);
        // 1. equals
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);  //false
        System.out.println(a.equals(b)); // true
        // 2. indexOf: 특정 문자의 인덱스 리턴
        String c = "Hello java";
        System.out.println(c.indexOf("java"));  // 6
        // 3. contains: 해당 문자열이 포함되어 있는지 여부
        System.out.println(c.contains("java")); // true
        // 4. charAt: 문자열에서 특정 위치의 문자 리턴
        System.out.println(c.charAt(3)); // l
        // 5. replaceAll
        System.out.println(c.replaceAll("java", "world"));  //Hello world
        // 6. substring: 특정 부분을 뽑아낼 경우
        System.out.println(c.substring(0, 4));   //Hell
        //7.toUpperCase(): 대문자 표기
        System.out.println(c.toUpperCase());  //HELLO JAVA
        //8. split: 특정 구분자로 분리
        String d = "a:b:c:d";
        String[] result = d.split(":");
        System.out.println(result[0]);


    }
}

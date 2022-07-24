public class _5_StringBuffer {
    public static void main(String[] args) {
        // StringBuffer: 문자열을 추가하거나 변경 시 사용. 문자열 추가나 변경이 많은 경우 사용.멀티 스레드 환경에서 안전
        // StringBuilder:  StringBuffer보다 성능 우수하여 동기화 고려가 필요없는 경우 사용
        //1. append
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        // 2. insert
        sb.insert(0, "hello ");
        System.out.println(sb);

        // 3. substring:  String 자료형의 substring 메소드와 동일
        System.out.println(sb.substring(0, 4));  //hell
    }
}

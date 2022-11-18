package character;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            if(sb.charAt(i)>='a' && sb.charAt(i)<='z') {
                char temp = (char) (sb.charAt(i) + n);
                if (temp > 'z') temp = (char) (temp - ('z' - 'a' + 1));
                sb.setCharAt(i, temp);
            }
            else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') {
                char temp = (char) (sb.charAt(i) + n);
                if (temp > 'Z') temp = (char) (temp - ('Z' - 'A' + 1));
                sb.setCharAt(i, temp);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.solution("AB",1));
        System.out.println(caesarCipher.solution("z",1));
        System.out.println(caesarCipher.solution("a B z",4));


    }
}

package stack;

public class Bracket2 {
    public boolean solution(String s) {
        while(s.contains("()")){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }
}

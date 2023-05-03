package stringRelated.stringBuffer;

// StringBuffer is mutable and thread-safe, because its methods are synchronized.
public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}

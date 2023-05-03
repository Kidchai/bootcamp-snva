package stringRelated.stringBuilder;

// StringBuilder is mutable and not thread-safe, because its methods are not synchronized.
public class Mutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}

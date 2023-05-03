package stringRelated.stringBuilder;

public class Methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.replace(5, 10, " C++");
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}

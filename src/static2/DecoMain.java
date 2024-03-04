package static2;

public class DecoMain {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil.deco(s);
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

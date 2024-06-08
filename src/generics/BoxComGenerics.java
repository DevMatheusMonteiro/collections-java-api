package generics;

public class BoxComGenerics<T> {
    // T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        BoxComGenerics<String> b = new BoxComGenerics();

        BoxComGenerics b2 = new BoxComGenerics();

//        b.set(10);
        b.set("Hello World!");

        b2.set("Hello World 2");
        b2.set(10);

        System.out.println(b.get());
        System.out.println(b2.get());
    }
}
package adapter.sample1;

public class AdapterMain1 {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Adapter");
        p.printWeak();
        p.printStrong();
    }
}

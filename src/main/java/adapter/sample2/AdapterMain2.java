package adapter.sample2;

public class AdapterMain2 {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Adapter");
        p.printWeak();
        p.printStrong();
    }
}

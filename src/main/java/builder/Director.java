package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到中午");
        builder.makeItems(new String[]{"早上好", "中午好"});
    }
}

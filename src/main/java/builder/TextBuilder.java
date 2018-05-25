package builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===============\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String s) {
        buffer.append("*" + s + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append(" ·" + item + "\n");
        }
    }

    public String getResult() {
        return buffer.toString();
    }
}

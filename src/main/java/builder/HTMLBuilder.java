package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String filename;

    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
        }
        writer.println("<html><head><title>" + title + "</title></head></html>");
    }

    @Override
    public void makeString(String s) {

    }

    @Override
    public void makeItems(String[] items) {

    }
}

package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

/**
 * Simple main application.
 */
public class App {
    final int randomNumber = 4;
    final int width = 120;
    final int height = 20;

    public static void main(String[] args) {
        App app = new App();
        app.printBigText("Hello World!");
    }

    public void printBigText(String string) {
        IRender render = new Render();
        render.setPseudoCanvas(true);
        IContextBuilder builder = render.newBuilder();
        builder.width(width).height(height);
        builder.element(new PseudoText(string, false));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }

    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return randomNumber;
    }
}

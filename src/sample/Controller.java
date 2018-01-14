package sample;

import javafx.application.Platform;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Controller {
    String str;
    public void buyCarButtonClicked () {
        System.out.println("Buy car");
    }

    public void displayCarsButtonClicked() {

    }

    public void contactButtonClicked() throws FileNotFoundException, UnsupportedEncodingException {
        str = JOptionPane.showInputDialog("Leave us a message!");
        PrintWriter writer = new PrintWriter("contact.txt", "UTF-8");
        writer.println(str + '\n');
        writer.close();
    }

    public void closeProjectButtonClicked() {
        Platform.exit();
    }
}

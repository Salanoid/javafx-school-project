package sample;

import javafx.application.Platform;

public class Controller {
    public void buyCarButtonClicked () {
        System.out.println("Buy car");
    }

    public void displayCarsButtonClicked() {
        System.out.println("Display cars");
    }

    public void contactButtonClicked() {
        System.out.println("Contact");
    }

    public void closeProjectButtonClicked() {
        Platform.exit();
    }
}

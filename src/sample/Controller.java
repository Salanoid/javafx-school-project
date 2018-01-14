package sample;

import javafx.application.Platform;

public class Controller {
    public void addCarButtonClicked () {
        System.out.println("Buy car");
    }

    public void displayCarsButtonClicked() {
        System.out.println("There are all the cars");
    }

    public void deleteCarButtonClicked() {
        System.out.println("Car Parts");
    }

    public void closeProjectButtonClicked() {
        Platform.exit();
    }
}

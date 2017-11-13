package sample;

import javafx.application.Platform;

public class Controller {
    public void addCarButtonClicked () {
        System.out.println("Add new Car!");
    }

    public void displayCarsButtonClicked() {
        System.out.println("There are all the cars!");
    }

    public void deleteCarButtonClicked() {
        System.out.println("Delete Car!");
    }

    public void closeProjectButtonClicked() {
        Platform.exit();
    }
}

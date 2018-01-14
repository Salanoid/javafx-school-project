package sample;

import javafx.application.Platform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Controller {
    String msg;
    String[] cars = new String[] {"BMW", "Audi", "Dacia"};
    String orderName;
    Object orderCar;

    public void buyCarButtonClicked () {
        JFrame buyCarFrame = new JFrame("Buy Car");
        buyCarFrame.setVisible(true);
        JPanel buyCar = new JPanel();
        buyCarFrame.getContentPane().add(buyCar);
        JComboBox carsList = new JComboBox(cars);
        JLabel fullName = new JLabel("Full Name");
        JTextField buyerName = new JTextField(20);
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderName = buyerName.getText();
                orderCar = carsList.getSelectedItem();

                PrintWriter order = null;
                try {
                    Random r = new Random();
                    int Low = 1;
                    int High = 10000;
                    int Result = r.nextInt(High-Low) + Low;


                    order = new PrintWriter(orderName + Result, "UTF-8");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (UnsupportedEncodingException e1) {
                    e1.printStackTrace();
                }

                String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                order.println(orderName + " " + orderCar + " " + timeStamp);
                JOptionPane.showMessageDialog(null, "We recived your order!", "Done!", JOptionPane.PLAIN_MESSAGE);
                order.close();
                System.exit(0);
            }
        });

        buyCarFrame.setLocation(600,400);
        buyCar.add(carsList);
        buyCar.add(fullName);
        buyCar.add(buyerName);
        buyCar.add(submit);
        buyCarFrame.pack();
        Platform.exit();
    }

    public void displayCarsButtonClicked() {
        JFrame displayCarsFrame = new JFrame("Display Cars");
        displayCarsFrame.setVisible(true);
        JPanel displayCars = new JPanel();
        displayCarsFrame.getContentPane().add(new JScrollPane(displayCars));

        displayCars.add(new JLabel(new ImageIcon("image/bmw.jpeg")));
        displayCars.add(new JLabel("BMW X5, Pret: 65.569 euro"));

        displayCars.add(new JLabel(new ImageIcon("image/audi.jpg")));
        displayCars.add(new JLabel("Audi A5, Pret: 37.794 euro"));

        displayCars.add(new JLabel(new ImageIcon("image/dacia.jpg")));
        displayCars.add(new JLabel("Dacia Logan, Pret: 6.950 euro"));


        displayCarsFrame.setLocation(600, 400);
        displayCarsFrame.pack();
        Platform.exit();
    }

    public void contactButtonClicked() throws IOException {
        msg = JOptionPane.showInputDialog("Leave us a message!");
        PrintWriter writer = new PrintWriter("contact.txt", "UTF-8");
        writer.println(msg);
        writer.close();
    }

    public void closeProjectButtonClicked() {
        Platform.exit();
    }
}

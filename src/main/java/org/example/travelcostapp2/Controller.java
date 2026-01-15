package org.example.travelcostapp2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField milesToDriveTextField;

    @FXML
    public TextField milePerGallonTextField;

    @FXML
    public TextField gasolinePriceTextField;

    @FXML
    public TextField parkingCostTextField;

    @FXML
    public TextField tollsCostTextField;

    @FXML
    public TextField resultTextField;

    @FXML
    public Button calculateButton;

    @FXML
    public Label errorLabel;

    @FXML
    public void onCalculateButtonClick() {

        try {
            // Convert mileToDriveTextField to mileToDriveDouble
            String mileToDriveText = milesToDriveTextField.getText();
            double mileToDriveDouble = Double.parseDouble(mileToDriveText);

            // Convert milePerGallonTextField to milePerGallonDouble
            String milePerGallonText = milePerGallonTextField.getText();
            double milePerGallonDouble = Double.parseDouble(milePerGallonText);

            // Convert gasolinePriceTextField to gasolinePriceDouble
            String gasolinePriceText = gasolinePriceTextField.getText();
            double gasolinePriceDouble = Double.parseDouble(gasolinePriceText);

            // Convert parkingCostTextField to parkingCostDouble
            String parkingCostText = parkingCostTextField.getText();
            double parkingCostDouble = Double.parseDouble(parkingCostText);

            // Convert tollsCostTextField to tollsCostDouble
            String tollsCostText = tollsCostTextField.getText();
            double tollsCostDouble = Double.parseDouble(tollsCostText);

            // Calculate total gas price
            double totalGasPrice = (mileToDriveDouble/milePerGallonDouble) * gasolinePriceDouble;

            // Calculate total cost
            double totalCost = totalGasPrice + parkingCostDouble + tollsCostDouble;

            resultTextField.setText(totalCost + "");
        } catch (NumberFormatException e) {
            System.out.println("User type in a letter");
            errorLabel.setText("Number Only Please ");
        }

    }

    @FXML
    public void onClearActionButtonClick(){
        milesToDriveTextField.clear();
        milePerGallonTextField.clear();
        gasolinePriceTextField.clear();
        parkingCostTextField.clear();
        tollsCostTextField.clear();
        resultTextField.clear();
        errorLabel.setText(" ");
    }


}

package sample.contoller;

import com.sun.glass.ui.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.awt.*;
import javafx.scene.image.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;

public class Dash_Controller implements Initializable {
    @FXML
    private Button btnCustomers;
    @FXML
    private Button btnMenus;
    @FXML
    private Button btnPackages;
    @FXML
    private Button btnSettings;
    @FXML
    private Button btnSignout;
    @FXML
    private Button btnOrders;
    @FXML
    private Button btnOverview;

    @FXML
    private Circle myCircle;
    @FXML
    private VBox pnlItems = null;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myPicture();

      /*  Node[] nodes = new Node[10];
        for (int i  = 0; i<nodes.length; i++){
            try{
                final int j = 1;
                nodes[i] = FXMLLoader.load(getClass().getResource("/sample/dashboard/item"));

                //items effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color: #0a0e3f");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color: #02030a");
                });
                //add the items to pnlItems
                pnlItems.getChildren().add(nodes[i]);

                //Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("/application/fxml2.fxml"));
                //secPane.getChildren().add(newLoadedPane);
            }
            catch (IOException e){
                e.printStackTrace();
            }*/
        //}

    }

    private void myPicture(){
        myCircle.setStroke(Color.DODGERBLUE);
        Image img = new Image("/sample/pics/mwah.png",false);
        myCircle.setFill(new ImagePattern(img));
        myCircle.setEffect(new DropShadow(+25d,0d,+2d,Color.BLUEVIOLET));
    }
}

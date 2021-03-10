package sample.contoller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    VBox itemHolder = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //create nodes
        Node[] nodes = new Node[10];
        for(int i = 0; i<nodes.length; i++){
            try{
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("fxml/item.fxml"));

                //add some effects
                nodes[i].setOnMouseEntered(mouseEvent -> {
                    nodes[j].setStyle("-fx-background-color: #b3b1b1");
                });
                nodes[i].setOnMouseEntered(mouseEvent -> {
                    nodes[j].setStyle("-fx-background-color: #d9d8d8");
                });
                nodes[i].setOnMousePressed(event -> {
                    nodes[j].setStyle("-fx-background-color: #777676");
                });

                //add the items
                itemHolder.getChildren().add(nodes[i]);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

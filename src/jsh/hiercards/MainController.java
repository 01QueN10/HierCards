package jsh.hiercards;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public JFXButton save;
    @FXML
    public JFXButton load;
    @FXML
    public Label pending;
    @FXML
    public Label completed;
    @FXML
    public Label incompleted;
    @FXML
    public JFXButton start;
    @FXML
    public JFXButton viewerMode;
    @FXML
    public JFXTreeView<Content> treeView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TreeItem<String> root = new TreeItem<>("AASDF");
        TreeItem<Content> root = new TreeItem<>(new Concept("TESTROOT", null));
        root.getChildren().add(new TreeItem<>(new Concept("ASDF", (Concept) root.getValue())));
        treeView.setRoot(root);
        treeView.setCellFactory(new CellF);
    }

    @FXML
    public void startEdit(TreeView.EditEvent e) {
        System.out.println("sTART");
    }

    @FXML
    public void commitEdit(TreeView.EditEvent e) {
        System.out.println("COLMMIT");
    }

    @FXML
    public void cancelEdit(TreeView.EditEvent e) {
        System.out.println("edit    cancel");
    }

    @FXML
    public void typeHandle(KeyEvent e) {
        System.out.println("TYPE");
    }

    @FXML
    public void save() {

    }

    @FXML
    public void load() {
    }

    @FXML
    public void viewerMode() {

    }

    @FXML
    public void start() {

    }
}

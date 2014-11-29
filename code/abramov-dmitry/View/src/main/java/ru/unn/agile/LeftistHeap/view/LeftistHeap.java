package ru.unn.agile.LeftistHeap.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.unn.agile.LeftistHeap.viewmodel.ViewModel;

public class LeftistHeap {
    @FXML
    private ViewModel viewModel;
    @FXML
    private TextField key1;
    @FXML
    private TextField value1;
    @FXML
    private TextField newKey1;

    @FXML
    private TextField key2;
    @FXML
    private TextField value2;
    @FXML
    private TextField newKey2;

    @FXML
    private Button add1;
    @FXML
    private Button getMinimum1;
    @FXML
    private Button delete1;
    @FXML
    private Button decrease1;
    @FXML
    private Button merge1;

    @FXML
    private Button add2;
    @FXML
    private Button getMinimum2;
    @FXML
    private Button delete2;
    @FXML
    private Button decrease2;
    @FXML
    private Button merge2;

    @FXML
    void initialize() {
        key1.textProperty().bindBidirectional(viewModel.key1Property());
        value1.textProperty().bindBidirectional(viewModel.value1Property());
        newKey1.textProperty().bindBidirectional(viewModel.newKey1Property());

        key2.textProperty().bindBidirectional(viewModel.key2Property());
        value2.textProperty().bindBidirectional(viewModel.value2Property());
        newKey2.textProperty().bindBidirectional(viewModel.newKey2Property());

        add1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.add1();
            }
        });

        getMinimum1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.getMinimum1();
            }
        });

        delete1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.delete1();
            }
        });

        merge1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.merge1();
            }
        });

        decrease1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.decreaseKey1();
            }
        });

        add2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.add2();
            }
        });

        getMinimum2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.getMinimum2();
            }
        });

        delete2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.delete2();
            }
        });

        merge2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.merge2();
            }
        });

        decrease2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.decreaseKey2();
            }
        });
    }
}

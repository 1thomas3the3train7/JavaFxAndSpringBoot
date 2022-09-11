package com.example.testapp.Controller;

import com.example.testapp.Model.Contract;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

import static com.example.testapp.Http.RestPost.httpPostGetContract;
import static com.example.testapp.Utils.ContractUtils.JsonToContract;
import static com.example.testapp.Utils.ContractUtils.DateFormat;

public class TableController {
    private final ObservableList<Contract> usersData = FXCollections.observableArrayList();
    @FXML
    private TableView<Contract> tableUsers;
    @FXML
    private TableColumn<Contract, Integer> idColumn;
    @FXML
    private TableColumn<Contract, Integer> numberColumn;
    @FXML
    private TableColumn<Contract, String> dateFormatCreateColumn;
    @FXML
    private TableColumn<Contract, String> dateFormatUpdateColumn;
    @FXML
    private TableColumn<Contract,Boolean> activeColumn;
    @FXML
    private Label label;
    @FXML
    private Button buttonRight;
    @FXML
    private Button buttonLeft;
    private int page;

    public TableController() {
    }

    @FXML
    private void initialize() throws IOException,MalformedURLException {
        page = 1;
        initData();

        idColumn.setCellValueFactory(new PropertyValueFactory<Contract, Integer>("id"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<Contract, Integer>("number"));
        dateFormatCreateColumn.setCellValueFactory(new PropertyValueFactory<Contract, String>("dateFormatCreate"));
        dateFormatUpdateColumn.setCellValueFactory(new PropertyValueFactory<Contract, String>("dateFormatUpdate"));
        activeColumn.setCellValueFactory(new PropertyValueFactory<Contract,Boolean>("active"));
        buttonLeft.setText("Last page");
        buttonRight.setText("Next page");

        tableUsers.setItems(usersData);
    }

    private void initData() throws IOException, MalformedURLException {
        final Contract[] contracts = JsonToContract(httpPostGetContract("http://localhost:8080/getcontract?page=" + page));
        Date date = new Date();
        usersData.clear();
        for(Contract c : contracts){
            usersData.add(DateFormat(c,date));
        }

        label.setText("Page : " + page);
    }

    public void nextPage() throws IOException, MalformedURLException{
        page++;
        initData();
    }

    public void lastPage() throws IOException, MalformedURLException{
        if(page > 1){
            page--;
            initData();
        }
    }

}
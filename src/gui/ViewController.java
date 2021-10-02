package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

    private int valor = 0;

    @FXML
    private Button btBotao;

    @FXML
    private Label lbTexto;

    @FXML
    public void btBotaoAction() {
        valor++;
        String msg = "Olá mundo: " + valor;
        System.out.println(msg);
        lbTexto.setText(msg);
    }
}

package app.web.pavelk.native3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController implements Initializable {

    @FXML
    private Label timeOne;

    @FXML
    private Label welcomeText;

    static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        scheduledExecutorService.scheduleAtFixedRate(() ->
                Platform.runLater(() -> timeOne.setText("Time " + LocalTime.now().getSecond())),
                2, 1, TimeUnit.SECONDS);
    }

    @FXML
    protected void onHelloButtonClick() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        welcomeText.setText(
                "Welcome to JavaFX Application! " +
                        "\nJavaFX " + javaVersion +
                        "\n Running on Java" + javafxVersion
        );
    }

    @FXML
    protected void buttonTwo() {
        welcomeText.setText("");
    }


}
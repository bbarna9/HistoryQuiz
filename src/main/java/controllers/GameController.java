package controllers;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
//import rollingcubes.results.GameResult;
//import rollingcubes.results.GameResultDao;
//import rollingcubes.state.RollingCubesState;

import java.io.IOException;
import java.sql.Time;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class GameController {

    private String userName1;
    private String userName2;
    private int questionCount;
    private List<Image> cubeImages;
    private Instant beginGame;
    private final int startingTime = 15;
    private int seconds = startingTime;

    @FXML
    public Label question;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label questionNumberDisplay;

    @FXML
    private Label timeDisplay;

    @FXML
    private Button doneButton;

    public void newQuestion(){
        questionCount++;
        int temp = (int)(Math.random()*(70-1)+1);
        question = new Label();
        question.setText("kerdes"); //questionList[temp] -> betöltjük a kérdés mezőbe
    }

    public void initdata(String userName) {
        this.userName1 = userName1;
        this.userName2 = userName2;
        usernameLabel.setText("Current users: " + this.userName1 + " and " + this.userName2);
    }

    public void timer(){
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
            if(time!=null)
                time.stop();
        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timeDisplay.setText("Time remaining: " + String.valueOf(seconds));
                    if (seconds<=0)
                        time.stop();
                seconds--;
            }
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();
    }

    @FXML
    public void initialize() {

        //gameResultDao = GameResultDao.getInstance();

        //gameState = new RollingCubesState();

        questionCount = 0;

        beginGame = Instant.now();

        timer();

        //ha a timer 0, az answer opacityjét 0-ról 0-re állítani, amint újrakezdődik vissza 0ra

    }


    /*
    public void finishGame(ActionEvent actionEvent) throws IOException {
        if (!gameState.isSolved()) {
            gameResultDao.persist(getResult());
        }

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/topten.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("Finished game, loading Top Ten scene.");
    }*/
}

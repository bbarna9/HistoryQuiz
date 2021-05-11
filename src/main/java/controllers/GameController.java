package controllers;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Random;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;


@Slf4j
public class GameController {

    private String userName1;
    private String userName2;
    private int questionCount;
    private Instant beginGame;
    private final int startingTime = 5;
    private int seconds = startingTime;

    @FXML
    public Label questionDisplay;

    @FXML
    public Label answerBlock;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label questionNumberDisplay;

    @FXML
    private Label timeDisplay;

    @FXML
    private Button doneButton;
    private Object ReadXMLFile;

    public String[] XmlReader(int temp){
        String tempQ = "nm";
        String tempA = "nm";

        try {

            File fXmlFile = new File("/home/barna/Szoftverfejelsztes/HistoryQuiz/questions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("element");
            System.out.println("----------------------------");

            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("Question id : "
                        + eElement.getAttribute("id"));
                tempQ = eElement.getElementsByTagName("text")
                        .item(0).getTextContent();
                tempA = eElement.getElementsByTagName("answer")
                        .item(0).getTextContent();

                System.out.println("Question Text : "
                        + eElement.getElementsByTagName("text")
                        .item(0).getTextContent());
                System.out.println("Answer : "
                        + eElement.getElementsByTagName("answer")
                        .item(0).getTextContent());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] selectedQuestion = new String[] {tempQ, tempA};
        return selectedQuestion;
    }

    public void newQuestion(){
        int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        questionNumberDisplay.setText(Integer.toString(temp));
        Random random = new Random();
        int rand = random.nextInt(70);
        XmlReader(3);
        questionDisplay.setText(XmlReader(rand)[0]);
        answerBlock.setText(XmlReader(rand)[1]);
    }

    public void initdata(String userName) {
        this.userName1 = userName1;
        this.userName2 = userName2;
        usernameLabel.setText("Current users: " + this.userName1 + " and " + this.userName2);
    }

    public void timer(){
        answerBlock.setVisible(false);
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
                if(seconds==-1)
                    answerBlock.setVisible(true);

            }
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();
    }

    @FXML
    public void initialize() {
        /*
        for (int i = 0; i<5; i++){
            newQuestion();
            timer();
        }
        */
        /*File file = new File("data.json");

        if (!file.exists())
            return;
*/
        questionCount = 0;

        beginGame = Instant.now();

        timer();

        newQuestion();


    }


}

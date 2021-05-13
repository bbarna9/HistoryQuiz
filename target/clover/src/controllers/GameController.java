/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

import javafx.scene.control.TextField;
import models.personalXmlReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Random;
import java.time.Instant;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameController {public static class __CLR4_4_16g46g4kon7oo0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1620929688151L,8589935092L,8407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String userName1;
    private String userName2;
    private Instant beginGame;
    private final int startingTime = 5;
    private int seconds = startingTime;
    public personalXmlReader personalxmlreader = new personalXmlReader();

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
    private TextField useranswer1;

    @FXML
    private TextField useranswer2;

    @FXML
    private Button nextQuestionButton;

    public void newQuestion(){try{__CLR4_4_16g46g4kon7oo0s.R.inc(8356);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8357);int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        __CLR4_4_16g46g4kon7oo0s.R.inc(8358);questionNumberDisplay.setText(Integer.toString(temp));

        __CLR4_4_16g46g4kon7oo0s.R.inc(8359);Random random = new Random();
        __CLR4_4_16g46g4kon7oo0s.R.inc(8360);int rand = random.nextInt(70);



        __CLR4_4_16g46g4kon7oo0s.R.inc(8361);String[] data = personalxmlreader.XmlReader(rand);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8362);questionDisplay.setText(data[0]);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8363);answerBlock.setText(data[1]);

        __CLR4_4_16g46g4kon7oo0s.R.inc(8364);timer();
    }finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}

    public void nextQuestionAsked(){try{__CLR4_4_16g46g4kon7oo0s.R.inc(8365);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8366);newQuestion();
        __CLR4_4_16g46g4kon7oo0s.R.inc(8367);seconds = startingTime;
        __CLR4_4_16g46g4kon7oo0s.R.inc(8368);int num = Integer.parseInt(questionNumberDisplay.getText());
        __CLR4_4_16g46g4kon7oo0s.R.inc(8369);if((((num == 3)&&(__CLR4_4_16g46g4kon7oo0s.R.iget(8370)!=0|true))||(__CLR4_4_16g46g4kon7oo0s.R.iget(8371)==0&false)))
            {__CLR4_4_16g46g4kon7oo0s.R.inc(8372);nextQuestionButton.setVisible(false);
    }}finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}

    public void initdata(String userName1, String userName2) {try{__CLR4_4_16g46g4kon7oo0s.R.inc(8373);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8374);this.userName1 = userName1;
        __CLR4_4_16g46g4kon7oo0s.R.inc(8375);this.userName2 = userName2;
        __CLR4_4_16g46g4kon7oo0s.R.inc(8376);usernameLabel.setText("Current users: " + this.userName1 + " and " + this.userName2);

    }finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}

    public void timer(){try{__CLR4_4_16g46g4kon7oo0s.R.inc(8377);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8378);answerBlock.setVisible(false);

        __CLR4_4_16g46g4kon7oo0s.R.inc(8379);useranswer1.setEditable(true);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8380);useranswer2.setEditable(true);

        __CLR4_4_16g46g4kon7oo0s.R.inc(8381);Timeline time = new Timeline();
        __CLR4_4_16g46g4kon7oo0s.R.inc(8382);time.setCycleCount(Timeline.INDEFINITE);
            __CLR4_4_16g46g4kon7oo0s.R.inc(8383);if((((time!=null)&&(__CLR4_4_16g46g4kon7oo0s.R.iget(8384)!=0|true))||(__CLR4_4_16g46g4kon7oo0s.R.iget(8385)==0&false)))
                {__CLR4_4_16g46g4kon7oo0s.R.inc(8386);time.stop();
        }__CLR4_4_16g46g4kon7oo0s.R.inc(8387);KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {try{__CLR4_4_16g46g4kon7oo0s.R.inc(8388);
                __CLR4_4_16g46g4kon7oo0s.R.inc(8389);timeDisplay.setText(String.valueOf(seconds));
                    __CLR4_4_16g46g4kon7oo0s.R.inc(8390);if ((((seconds<=0)&&(__CLR4_4_16g46g4kon7oo0s.R.iget(8391)!=0|true))||(__CLR4_4_16g46g4kon7oo0s.R.iget(8392)==0&false)))
                        {__CLR4_4_16g46g4kon7oo0s.R.inc(8393);time.stop();
                }__CLR4_4_16g46g4kon7oo0s.R.inc(8394);seconds--;
                __CLR4_4_16g46g4kon7oo0s.R.inc(8395);if((((seconds==-1)&&(__CLR4_4_16g46g4kon7oo0s.R.iget(8396)!=0|true))||(__CLR4_4_16g46g4kon7oo0s.R.iget(8397)==0&false))) {{
                    __CLR4_4_16g46g4kon7oo0s.R.inc(8398);answerBlock.setVisible(true);
                    __CLR4_4_16g46g4kon7oo0s.R.inc(8399);useranswer1.setEditable(false);
                    __CLR4_4_16g46g4kon7oo0s.R.inc(8400);useranswer2.setEditable(false);
                }
            }}finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}
        });
        __CLR4_4_16g46g4kon7oo0s.R.inc(8401);time.getKeyFrames().add(frame);
        __CLR4_4_16g46g4kon7oo0s.R.inc(8402);time.playFromStart();

        __CLR4_4_16g46g4kon7oo0s.R.inc(8403);seconds = startingTime;
    }finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}

    @FXML
    public void initialize() {try{__CLR4_4_16g46g4kon7oo0s.R.inc(8404);

        __CLR4_4_16g46g4kon7oo0s.R.inc(8405);newQuestion();

        __CLR4_4_16g46g4kon7oo0s.R.inc(8406);beginGame = Instant.now();

        //timer();

        //newQuestion();
    }finally{__CLR4_4_16g46g4kon7oo0s.R.flushNeeded();}}


}

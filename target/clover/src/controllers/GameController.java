/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

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
public class GameController {public static class __CLR4_4_11r81r8kokd36jl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1620757364881L,8589935092L,2341,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public String[] XmlReader(int temp){try{__CLR4_4_11r81r8kokd36jl.R.inc(2276);
        __CLR4_4_11r81r8kokd36jl.R.inc(2277);String tempQ = "nm";
        __CLR4_4_11r81r8kokd36jl.R.inc(2278);String tempA = "nm";

        __CLR4_4_11r81r8kokd36jl.R.inc(2279);try {

            __CLR4_4_11r81r8kokd36jl.R.inc(2280);File fXmlFile = new File("/home/barna/Szoftverfejelsztes/HistoryQuiz/questions.xml");
            __CLR4_4_11r81r8kokd36jl.R.inc(2281);DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            __CLR4_4_11r81r8kokd36jl.R.inc(2282);DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            __CLR4_4_11r81r8kokd36jl.R.inc(2283);Document doc = dBuilder.parse(fXmlFile);
            __CLR4_4_11r81r8kokd36jl.R.inc(2284);doc.getDocumentElement().normalize();

            __CLR4_4_11r81r8kokd36jl.R.inc(2285);System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            __CLR4_4_11r81r8kokd36jl.R.inc(2286);NodeList nList = doc.getElementsByTagName("element");
            __CLR4_4_11r81r8kokd36jl.R.inc(2287);System.out.println("----------------------------");

            __CLR4_4_11r81r8kokd36jl.R.inc(2288);Node nNode = nList.item(temp);
            __CLR4_4_11r81r8kokd36jl.R.inc(2289);System.out.println("\nCurrent Element :" + nNode.getNodeName());
            __CLR4_4_11r81r8kokd36jl.R.inc(2290);if ((((nNode.getNodeType() == Node.ELEMENT_NODE)&&(__CLR4_4_11r81r8kokd36jl.R.iget(2291)!=0|true))||(__CLR4_4_11r81r8kokd36jl.R.iget(2292)==0&false))) {{
                __CLR4_4_11r81r8kokd36jl.R.inc(2293);Element eElement = (Element) nNode;
                __CLR4_4_11r81r8kokd36jl.R.inc(2294);System.out.println("Question id : "
                        + eElement.getAttribute("id"));
                __CLR4_4_11r81r8kokd36jl.R.inc(2295);tempQ = eElement.getElementsByTagName("text")
                        .item(0).getTextContent();
                __CLR4_4_11r81r8kokd36jl.R.inc(2296);tempA = eElement.getElementsByTagName("answer")
                        .item(0).getTextContent();

                __CLR4_4_11r81r8kokd36jl.R.inc(2297);System.out.println("Question Text : "
                        + eElement.getElementsByTagName("text")
                        .item(0).getTextContent());
                __CLR4_4_11r81r8kokd36jl.R.inc(2298);System.out.println("Answer : "
                        + eElement.getElementsByTagName("answer")
                        .item(0).getTextContent());
            }

        }} catch (Exception e) {
            __CLR4_4_11r81r8kokd36jl.R.inc(2299);e.printStackTrace();
        }
        __CLR4_4_11r81r8kokd36jl.R.inc(2300);String[] selectedQuestion = new String[] {tempQ, tempA};
        __CLR4_4_11r81r8kokd36jl.R.inc(2301);return selectedQuestion;
    }finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}

    public void newQuestion(){try{__CLR4_4_11r81r8kokd36jl.R.inc(2302);
        __CLR4_4_11r81r8kokd36jl.R.inc(2303);int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        __CLR4_4_11r81r8kokd36jl.R.inc(2304);questionNumberDisplay.setText(Integer.toString(temp));
        __CLR4_4_11r81r8kokd36jl.R.inc(2305);Random random = new Random();
        __CLR4_4_11r81r8kokd36jl.R.inc(2306);int rand = random.nextInt(70);
        __CLR4_4_11r81r8kokd36jl.R.inc(2307);XmlReader(3);
        __CLR4_4_11r81r8kokd36jl.R.inc(2308);questionDisplay.setText(XmlReader(rand)[0]);
        __CLR4_4_11r81r8kokd36jl.R.inc(2309);answerBlock.setText(XmlReader(rand)[1]);
    }finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}

    public void initdata(String userName) {try{__CLR4_4_11r81r8kokd36jl.R.inc(2310);
        __CLR4_4_11r81r8kokd36jl.R.inc(2311);this.userName1 = userName1;
        __CLR4_4_11r81r8kokd36jl.R.inc(2312);this.userName2 = userName2;
        __CLR4_4_11r81r8kokd36jl.R.inc(2313);usernameLabel.setText("Current users: " + this.userName1 + " and " + this.userName2);
    }finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}

    public void timer(){try{__CLR4_4_11r81r8kokd36jl.R.inc(2314);
        __CLR4_4_11r81r8kokd36jl.R.inc(2315);answerBlock.setVisible(false);
        __CLR4_4_11r81r8kokd36jl.R.inc(2316);Timeline time = new Timeline();
        __CLR4_4_11r81r8kokd36jl.R.inc(2317);time.setCycleCount(Timeline.INDEFINITE);
            __CLR4_4_11r81r8kokd36jl.R.inc(2318);if((((time!=null)&&(__CLR4_4_11r81r8kokd36jl.R.iget(2319)!=0|true))||(__CLR4_4_11r81r8kokd36jl.R.iget(2320)==0&false)))
                {__CLR4_4_11r81r8kokd36jl.R.inc(2321);time.stop();
        }__CLR4_4_11r81r8kokd36jl.R.inc(2322);KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {try{__CLR4_4_11r81r8kokd36jl.R.inc(2323);
                __CLR4_4_11r81r8kokd36jl.R.inc(2324);timeDisplay.setText("Time remaining: " + String.valueOf(seconds));
                    __CLR4_4_11r81r8kokd36jl.R.inc(2325);if ((((seconds<=0)&&(__CLR4_4_11r81r8kokd36jl.R.iget(2326)!=0|true))||(__CLR4_4_11r81r8kokd36jl.R.iget(2327)==0&false)))
                        {__CLR4_4_11r81r8kokd36jl.R.inc(2328);time.stop();
                }__CLR4_4_11r81r8kokd36jl.R.inc(2329);seconds--;
                __CLR4_4_11r81r8kokd36jl.R.inc(2330);if((((seconds==-1)&&(__CLR4_4_11r81r8kokd36jl.R.iget(2331)!=0|true))||(__CLR4_4_11r81r8kokd36jl.R.iget(2332)==0&false)))
                    {__CLR4_4_11r81r8kokd36jl.R.inc(2333);answerBlock.setVisible(true);

            }}finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}
        });
        __CLR4_4_11r81r8kokd36jl.R.inc(2334);time.getKeyFrames().add(frame);
        __CLR4_4_11r81r8kokd36jl.R.inc(2335);time.playFromStart();
    }finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}

    @FXML
    public void initialize() {try{__CLR4_4_11r81r8kokd36jl.R.inc(2336);
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
        __CLR4_4_11r81r8kokd36jl.R.inc(2337);questionCount = 0;

        __CLR4_4_11r81r8kokd36jl.R.inc(2338);beginGame = Instant.now();

        __CLR4_4_11r81r8kokd36jl.R.inc(2339);timer();

        __CLR4_4_11r81r8kokd36jl.R.inc(2340);newQuestion();


    }finally{__CLR4_4_11r81r8kokd36jl.R.flushNeeded();}}


}

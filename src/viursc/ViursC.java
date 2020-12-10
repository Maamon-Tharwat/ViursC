package viursc;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class ViursC extends Application {

    String[] answers = {null, null, null, null, null, null};

    @Override
    public void start(Stage primaryStage) {
        showWelcome(primaryStage);

    }

    public void showWelcome(Stage primaryStage) {
        Label welcome = new Label("Welcome to Viurs C check");
        Button start = new Button("Start");
        VBox root = new VBox(welcome, start);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        start.setOnAction(e -> {
            showPain(primaryStage);
        }
        );
    }

    public void showPain(Stage primaryStage) {
        Label question = new Label("Do you feel any pain ? ");
        ToggleGroup group = new ToggleGroup();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        Button next = new Button("Next");
        HBox choices = new HBox(yes, no);
        choices.setSpacing(20);
        choices.setAlignment(Pos.CENTER);
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        yes.setToggleGroup(group);
        no.setToggleGroup(group);

        next.setOnAction(e -> {
            if (yes.isSelected()) {
                answers[0] = "true";
                showFever(primaryStage);
            } else if (no.isSelected()) {
                answers[0] = "false";
                showSituations(primaryStage);
            } else {
                JOptionPane.showMessageDialog(null, "PLease Select one option");
            }
        }
        );
    }

    public void showSituations(Stage primaryStage) {
        String[] casesStrings = {"you are a nurse, you may have a dirty needle"
                ,"you are a drug user", "HIV infection"
                ,"Dealing with non-sterile equipment"
                ,"She was subjected to a blood or organ transfusion from one of the injured before 1992"
                , "your mother was a carrier of the virus during pregnancy"};
        Label question = new Label("PLease check any of the following if it's true ");
        CheckBox[] casesCheckBoxs = new CheckBox[6];
        GridPane choices = new GridPane();
        choices.setAlignment(Pos.CENTER);
        for (int x = 0; x < 6; ++x) {
            casesCheckBoxs[x] = new CheckBox(casesStrings[x]);
            choices.add(casesCheckBoxs[x], x / 2, x % 3);
        }
        Button next = new Button("Next");
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        next.setOnAction(e -> {
            boolean selected = false;
            for (int x = 0; x < 6; ++x) {
                selected = selected || casesCheckBoxs[x].isSelected();
                if (selected) {
                    break;
                }
            }
            if (selected) {
                answers[1] = "true";
                //TODO check
            } else {
                answers[1] = "false";
                //TODO good
            }
        }
        );
    }

    public void showFever(Stage primaryStage) {
        Label question = new Label("Do you feel any Fever or headache ? ");
        ToggleGroup group = new ToggleGroup();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        Button next = new Button("Next");
        HBox choices = new HBox(yes, no);
        choices.setAlignment(Pos.CENTER);
        choices.setSpacing(20);
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        yes.setToggleGroup(group);
        no.setToggleGroup(group);

        next.setOnAction(e -> {
            if (yes.isSelected()) {
                answers[1] = "true";
                showStomachPain(primaryStage);
            } else if (no.isSelected()) {
                answers[1] = "false";
                //TODO
            } else {
                JOptionPane.showMessageDialog(null, "PLease Select one option");
            }
        }
        );

    }

    public void showStomachPain(Stage primaryStage) {
        Label question = new Label("Do you feel any pain in the upper right part of the abdomen ? ");
        ToggleGroup group = new ToggleGroup();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        Button next = new Button("Next");
        HBox choices = new HBox(yes, no);
        choices.setAlignment(Pos.CENTER);
        choices.setSpacing(20);
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        yes.setToggleGroup(group);
        no.setToggleGroup(group);

        next.setOnAction(e -> {
            if (yes.isSelected()) {
                answers[2] = "true";
                showMusclePain(primaryStage);
            } else if (no.isSelected()) {
                answers[2] = "false";
                //TODO
            } else {
                JOptionPane.showMessageDialog(null, "PLease Select one option");
            }
        }
        );
    }

    public void showMusclePain(Stage primaryStage) {
        Label question = new Label("Do you feel any  Pain in muscles and joints ? ");
        ToggleGroup group = new ToggleGroup();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        Button next = new Button("Next");
        HBox choices = new HBox(yes, no);
        choices.setAlignment(Pos.CENTER);
        choices.setSpacing(20);
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        yes.setToggleGroup(group);
        no.setToggleGroup(group);

        next.setOnAction(e -> {
            if (yes.isSelected()) {
                answers[3] = "true";
                showYellow(primaryStage);
            } else if (no.isSelected()) {
                answers[3] = "false";
                //TODO
            } else {
                JOptionPane.showMessageDialog(null, "PLease Select one option");
            }
        }
        );
    }

    public void showYellow(Stage primaryStage) {
        Label question = new Label("Do you feel any Yellowing of the skin and the whites of the eyes ? ");
        ToggleGroup group = new ToggleGroup();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        Button next = new Button("Next");
        HBox choices = new HBox(yes, no);
        choices.setAlignment(Pos.CENTER);
        choices.setSpacing(20);
        VBox root = new VBox(question, choices, next);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Viurs C Check");
        primaryStage.setScene(scene);
        primaryStage.show();

        yes.setToggleGroup(group);
        no.setToggleGroup(group);

        next.setOnAction(e -> {
            if (yes.isSelected()) {
                answers[4] = "true";
                //TODO
            } else if (no.isSelected()) {
                answers[4] = "false";
                //TODO
            } else {
                JOptionPane.showMessageDialog(null, "PLease Select one option");
            }
        }
        );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

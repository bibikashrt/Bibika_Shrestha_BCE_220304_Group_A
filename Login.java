
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Login {

    public static void main(String[] args) {
        Frame frame = new Frame("Login Form");

        Label lbUserID = new Label("User ID");
        lbUserID.setBounds(10, 15, 100, 100);
        frame.add(lbUserID);

        TextField txt = new TextField();
        txt.setBounds(110, 50, 200, 20);
        frame.add(txt);

        Label lbPass = new Label("Passcode");
        lbPass.setBounds(10, 105, 100, 100);
        frame.add(lbPass);

        TextField txt1 = new TextField();
        txt1.setBounds(110, 140, 200, 20);
        frame.add(txt1);

        Button btn = new Button("Reset");
        btn.setBounds(10, 250, 100, 40);
        frame.add(btn);

        Button btn1 = new Button("Submit");
        btn1.setBounds(150, 250, 100, 40);
        frame.add(btn1);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}

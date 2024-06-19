import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class Formsection {
    Formsection(){
          Frame frame = new Frame();
        Panel panel = new Panel();
        Label lbl = new Label("email dui na");
        panel.add(lbl);

        TextField txt = new TextField();
        panel.add(txt);

        Button btn = new Button("Submit");
        panel.add(btn);
        panel.setBackground(Color.DARK_GRAY);
        panel.setPreferredSize(new Dimension(250, 500));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        frame.add(panel, BorderLayout.WEST);

        Panel panel1 = new Panel();
        Label result = new Label("User ko email");
        result.setAlignment(1);
        panel1.add(result);
        panel1.setBackground(Color.BLUE);

        Label res = new Label();
        panel1.add(res);
        res.setBackground(Color.WHITE);
        res.setAlignment(1);

        
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        frame.add(panel1, BorderLayout.EAST);
        panel1.setPreferredSize(new Dimension(250, 500));

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = txt.getText();
                res.setText(email);


            }
        });

    }

    public static void main(String[] args) {
        new Formsection();
    }

}
    




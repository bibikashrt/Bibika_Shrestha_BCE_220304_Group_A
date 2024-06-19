
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Twosection1 {

    Twosection1() {
        Frame frame = new Frame();
        Panel panel = new Panel();

        Button btn = new Button("Left");
        panel.add(btn);
        panel.setBackground(Color.DARK_GRAY);
        panel.setPreferredSize(new Dimension(250, 500));
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.WEST);

        Panel panel1 = new Panel();
        Label result = new Label("Hello World");
        panel1.add(result);
        panel1.setBackground(Color.BLUE);

        
        panel1.setLayout(new FlowLayout());
        frame.add(panel1, BorderLayout.EAST);
        panel1.setPreferredSize(new Dimension(250, 500));

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(Color.CYAN);
                result.setText("Hello");
                result.setBackground(Color.CYAN);
                panel.setBackground(Color.RED);


            }
        });
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowClosing(WindowEvent e) {
               frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            
        });

    }

    public static void main(String[] args) {
        new Twosection1();
    }

}

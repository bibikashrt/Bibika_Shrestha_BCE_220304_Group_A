
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestGUI {

    TestGUI() {
        Frame frame = new Frame();

        Button btn = new Button("North");
        frame.add(btn, BorderLayout.NORTH);

        Button btn1 = new Button("SOUTH");
        frame.add(btn1, BorderLayout.SOUTH);

        Button btn2 = new Button("EAST");
        frame.add(btn2, BorderLayout.EAST);

        Button btn3 = new Button("WEST");
        frame.add(btn3, BorderLayout.WEST);

        Button btn4 = new Button("Center");
        frame.add(btn4, BorderLayout.CENTER);

        frame.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();

            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
            }
        });

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        new TestGUI();

    }

}

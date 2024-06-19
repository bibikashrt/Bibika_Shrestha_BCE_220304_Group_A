
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Twosectionmenu {

    public Twosectionmenu() {

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

        MenuBar mb = new MenuBar();

        Menu menu = new Menu("File");
        Menu subMenu = new Menu("More");
        Menu editMenu = new Menu("Edit");
        Menu search = new Menu("Search");
        Menu referenceSub = new Menu("Reference");

        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Save As");
        MenuItem item5 = new MenuItem("Clear Cache");
        MenuItem item6 = new MenuItem("Restore Deafault");

        MenuItem item7 = new MenuItem("Undo");
        MenuItem item8 = new MenuItem("Redo Typing");

        MenuItem item9 = new MenuItem("Search...");
        MenuItem item10 = new MenuItem("File...");
        MenuItem item11 = new MenuItem("Java...");
        MenuItem item12 = new MenuItem("Text...");
        MenuItem item13 = new MenuItem("Reference 1");

        MenuItem item14 = new MenuItem("Reference 2");
        MenuItem item15 = new MenuItem("Reference 3");

        MenuItem item16 = new MenuItem("Exit");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        menu.addSeparator();
        menu.add(subMenu);
        subMenu.add(item5);
        subMenu.add(item6);

        editMenu.add(item7);
        editMenu.add(item8);

        search.add(item9);
        search.add(item10);
        search.add(item11);
        search.add(item12);

        menu.addSeparator();
        menu.add(item16);
        search.add(referenceSub);
        referenceSub.add(item13);
        referenceSub.add(item14);
        referenceSub.add(item15);
        mb.add(menu);
        mb.add(editMenu);
        mb.add(search);


        frame.setMenuBar(mb);

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

        item16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Twosectionmenu();
    }

}

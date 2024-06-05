import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements WindowListener, ActionListener {
private TextField f = new TextField();
private JButton b0 = new JButton ("0");
private JButton b1 = new JButton ("1");
private JButton b2 = new JButton ("2");
private JButton b3 = new JButton ("3");
private JButton b4 = new JButton ("4");
private JButton b5 = new JButton ("5");
private JButton b6 = new JButton ("6");
private JButton b7 = new JButton("7");
private JButton b8 = new JButton ("8");
private JButton b9 = new JButton("9");
private JButton add = new JButton ("+");
private JButton sub = new JButton ("-");
private JButton multi = new JButton ("*");
private JButton div = new JButton ("/");
private JButton res = new JButton ("=");
private JButton c = new JButton("C");
private String text="";
private int a = 0;
private int b = 0;
private int l = 75;
private int m = 75;
private char z;

    public window(){
        Font ex = new Font("Impact", Font.BOLD,40);

setLayout(null);
setSize(400,600);
setVisible(true);
setLocation(700,250);
f.setSize(330,60);
f.setLocation(25,25);
f.setVisible(true);
add(f);
b9.setFont(ex);
b9.setSize(l,m);
b9.setLocation(205,200);
b9.setVisible(true);
add(b9);
b8.setFont(ex);
b8.setSize(l,m);
b8.setLocation(115,200);
b8.setVisible(true);
add(b8);
b7.setFont(ex);
b7.setSize(l,m);
b7.setLocation(25,200);
b7.setVisible(true);
add(b7);
b6.setFont(ex);
b6.setSize(l,m);
b6.setLocation(205,290);
b6.setVisible(true);
add(b6);
b5.setFont(ex);
b5.setSize(l,m);
b5.setLocation(115,290);
b5.setVisible(true);
add(b5);
b4.setFont(ex);
b4.setSize(l,m);
b4.setLocation(25,290);
b4.setVisible(true);
add(b4);
b3.setFont(ex);
b3.setSize(l,m);
b3.setLocation(205,380);
b3.setVisible(true);
add(b3);
b2.setFont(ex);
b2.setSize(l,m);
b2.setLocation(115,380);
b2.setVisible(true);
add(b2);
b1.setFont(ex);
b1.setSize(l,m);
b1.setLocation(25,380);
b1.setVisible(true);
add(b1);
b0.setFont(ex);
b0.setSize(l,m);
b0.setLocation(25,470);
b0.setVisible(true);
add(b0);
res.setFont(ex);
res.setSize(l,m);
res.setLocation(115,470);
res.setVisible(true);
add(res);
add.setFont(ex);
add.setSize(l,m);
add.setLocation(205,470);
add.setVisible(true);
add(add);
sub.setFont(ex);
sub.setSize(l,m);
sub.setLocation(295,470);
sub.setVisible(true);
add(sub);
div.setFont(ex);
div.setSize(l,m);
div.setLocation(295,380);
div.setVisible(true);
add(div);
multi.setFont(ex);
multi.setSize(l,m);
multi.setLocation(295,290);
multi.setVisible(true);
add(multi);
c.setFont(ex);
c.setSize(l,m);
c.setLocation(295,200);
c.setVisible(true);
add(c);
b9.addActionListener(this);
b8.addActionListener(this);
b7.addActionListener(this);
b6.addActionListener(this);
b5.addActionListener(this);
b4.addActionListener(this);
b3.addActionListener(this);
b2.addActionListener(this);
b1.addActionListener(this);
b0.addActionListener(this);
res.addActionListener(this);
div.addActionListener(this);
multi.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);

c.addActionListener(this);




}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b9) {
            text = text + b9.getText();
            f.setText(text);
        }
            if (e.getSource()==b8) {
                text = text +b8.getText();
                f.setText(text);
        }
        if (e.getSource()==b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource()==b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource()==b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource()==b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource()==b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource()==b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource()==b1) {
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource()==b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource()==add) {
            a = Integer.parseInt(text);
            f.setText(text+add.getText());
            text = "";
            z = '+';
        }
        if (e.getSource()==multi) {
            a = Integer.parseInt(text);
            f.setText(text+add.getText());
            text = "";
            z = '*';
        }

        if (e.getSource()==sub) {
            a = Integer.parseInt(text);
            f.setText(text+sub.getText());
            text = "";
            z = '-';
        }
        if (e.getSource()==div) {
            a = Integer.parseInt(text);
            f.setText(text+div.getText());
            text = "";
            z = '/';
        }
        if (e.getSource() == res) {
            if (z=='+'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a+b));
            }
            if (z == '-') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a-b));

            }
            if (z=='*'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a*b));
            }
            if (z=='/'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a/b));
            }

        }
            if (e.getSource()==c) {
            text = "";
            f.setText(text);
        }
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}

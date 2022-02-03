import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class DigiClock {
  JFrame frame1 = new JFrame("   \t\t         DIGITAL CLOCK");
  JTextField text1 = new JTextField();
  JTextField text2 = new JTextField();
  JTextField text3 = new JTextField();
  JTextField text4 = new JTextField();
  JButton button1 = new JButton("Open");
  JLabel label1 = new JLabel(":");
  JLabel label2 = new JLabel(":");
  JLabel label3 = new JLabel(":");
  int h, m, s,Day;

  public void takeInput() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Set hour");
    h =sc.nextInt();
     System.out.println("Set minute");
    m =sc.nextInt();
     System.out.println("Enter second");
    s =sc.nextInt();
  }

  public void clock() {

    text1.setBounds(10, 10, 100, 100);
    label1.setBounds(110, 10, 20, 100);
    text2.setBounds(130, 10, 100, 100);
    label2.setBounds(230, 10, 20, 100);
    text3.setBounds(250, 10, 100, 100);
    label3.setBounds(350, 10, 20, 100);
    text4.setBounds(370, 10, 100, 100);
    button1.setBounds(180, 120, 120, 40);

    frame1.add(text1);
    frame1.add(text2);
    frame1.add(text3);
    frame1.add(text4);
    frame1.add(label1);
    frame1.add(label2);
    frame1.add(label3);
    frame1.add(button1);

    Font font1 = new Font("Lucidia Console", Font.BOLD, 50);
    Font font2 = new Font("Lucidia Console", Font.BOLD, 50);

    text1.setFont(font1);
    text2.setFont(font1);
    text3.setFont(font1);
    text4.setFont(font1);
    label1.setFont(font2);
    label2.setFont(font2);
    label3.setFont(font2);
    button1.setFont(new Font("Lucidia Console", Font.BOLD, 20));

    text1.setBackground(Color.BLACK);
    text2.setBackground(Color.BLACK);
    text3.setBackground(Color.BLACK);
    text4.setBackground(Color.BLACK);
    button1.setBackground(Color.RED);

    text1.setForeground(Color.GREEN);
    text2.setForeground(Color.GREEN);
    text3.setForeground(Color.GREEN);
    text4.setForeground(Color.GREEN);
    button1.setForeground(Color.BLACK);

    button1.addActionListener(A1);

    frame1.setSize(500, 200);
    frame1.setLayout(null);
    frame1.setVisible(true);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void run() {
    for (Day = 1; Day < 30; Day++) {

      for (h = h; h <= 24; h++) {

        for (m = m; m < 60; m++) {

          for (s = s; s <= 60; s++) {

            text1.setText(String.valueOf(h));
            text2.setText(String.valueOf(m));
            text3.setText(String.valueOf(s));

            if (h < 12) {
              text4.setText("AM");
            } else {
              text4.setText("PM");
            }
            try {

              Thread.sleep(1000);

            } catch (Exception e) {
              System.out.println(e);
            }

          }
          s = 1;

        }
        m = 0;
      }
      h = 1;

    }

  }

  public static void main(String[] args) {

    DigiClock3 C1 = new DigiClock3();
    C1.takeInput();
    C1.clock();
    C1.run();
    
  }

ActionListener A1=new ActionListener()
{
public void actionPerformed(ActionEvent ae1)
{
  
}
};

}
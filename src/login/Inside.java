package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ultrabook on 05.10.2017.
 */
public class Inside 
{
    public void showWin(boolean visible, String username)
    {
        JFrame frame= new JFrame("Dude u r inside");
        frame.setVisible(visible);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Hello,\n" + username), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Файл");
        JMenuItem exit = new JMenuItem("Выход");

        file.add(exit);
        menuBar.add(file);

        exit.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                frame.setVisible(false);

                LogIn in = new LogIn();
                in.showWin();
            }
        });

        frame.setJMenuBar(menuBar);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
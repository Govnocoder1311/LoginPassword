package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn 
{
    public static void main(String[] args)
    {
        LogIn log = new LogIn();
        log.showWin();
    }

    
    public void showWin()
    {
        JFrame frame = new JFrame("Dude");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        JLabel login = new JLabel("Логин");
        JTextField log = new JTextField();
        JLabel pass = new JLabel("Введите пароль");
        JPasswordField password = new JPasswordField();
        JButton in = new JButton("Войти");
        JButton exit = new JButton("Выйти");

        in.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (log.getText().equals("demo") && password.getText().equals("demo"))
                {
                    Inside in = new Inside();
                    in.showWin(true, log.getText());
                    frame.setVisible(false);
                    System.out.println("Окей");
                } 
                else 
                {
                    System.out.println("ошибка");
                }
            }
        });

        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        panel.add(login);
        panel.add(log);
        panel.add(pass);
        panel.add(password);
        panel.add(in);
        panel.add(exit);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
}

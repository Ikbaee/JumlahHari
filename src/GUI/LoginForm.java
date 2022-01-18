package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JTextField userTF;
    private JTextField passwordTF;
    private JButton loginButton;
    private JPanel login;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((userTF.getText().equals("admin")) &&
                        (String.valueOf(passwordTF.getText()).equals("admin"))){

                    JFrame pjh = new JFrame();
                    pjh.pack();
                    pjh.setVisible(true);

                }else{
            JOptionPane.showMessageDialog(
                    null,userTF.getText() + ", Password anda salah", "Pesan Kesalahan",JOptionPane.ERROR_MESSAGE);
            userTF.setText("");
            passwordTF.setText("");
            userTF.requestFocus();
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginForm");
        frame.setContentPane(new LoginForm().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}

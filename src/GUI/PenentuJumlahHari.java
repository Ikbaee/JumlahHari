package GUI;

import javax.swing.*;

public class PenentuJumlahHari {
    private JTextField textTahun;
    private JTextField textBulan;
    private JButton hitungButton;
    private JButton hapusButton;
    private JButton simpanButton;
    private JButton keluarButton;
    private JPanel jumlah;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PenentuJumlahHari");
        frame.setContentPane(new PenentuJumlahHari().jumlah);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

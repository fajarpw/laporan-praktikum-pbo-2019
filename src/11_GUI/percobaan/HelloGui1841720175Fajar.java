package percobaan;

import javax.swing.*;

public class HelloGui1841720175Fajar {

    public static void main(String[] args) {
       JFrame frame;
       frame = new JFrame("ini percobaan HelloGui Frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berhenti jika ditutup
       frame.setSize(600, 300);//lebar, tinggi windows
//       frame.setLocation(200, 200);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);//untuk menampilkan frame
    }
}

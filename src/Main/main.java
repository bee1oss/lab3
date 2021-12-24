package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
class Main extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 400;

    public Main() throws Exception {
        super("Вычисление значения функции");
        setSize(WIDTH, HEIGHT);

        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH)/2,
                (kit.getScreenSize().height - HEIGHT)/2);

        JTextField textPar = new JTextField("0", 5);

        textPar.setMaximumSize(
                new Dimension(2 * textPar.getPreferredSize().width,
                        textPar.getPreferredSize().height));
                


    }
        public static void main(String[] args)  {

        }



}


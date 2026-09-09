import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RelatorioGerado {
    public JPanel base;
    private JPanel top;
    private JPanel bottom;
    private JLabel relatorioGeradoLabel;
    private JButton fecharButton;

    public RelatorioGerado() {
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window janela = SwingUtilities.getWindowAncestor(fecharButton);
                if (janela != null) {
                    janela.dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RelatorioGerado");
        frame.setContentPane(new RelatorioGerado().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

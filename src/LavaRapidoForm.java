import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class LavaRapidoForm {
    private JPanel base;
    private JPanel top;
    private JPanel body;
    private JPanel bottom;
    private JLabel Titulo;
    private JPanel baseVeiculo;
    private JTextField textNome;
    private JLabel nome;
    private JTextField textModelo;
    private JTextField textCor;
    private JTextField textPlaca;
    private JLabel modelo;
    private JLabel cor;
    private JLabel placa;
    private JLabel cadastroVeiculo;
    private JLabel servico;
    private JRadioButton radioButtonCarro;
    private JRadioButton radioButtonMoto;
    private JComboBox comboBoxServicos;
    private JLabel valorTotalLabel;
    private JButton cadastrar;
    private JButton cancelar;
    private JButton gerarRelatorio;
    private JLabel valorReaisLabel;

    private ArrayList<Cliente> listaClientes = new ArrayList<>();


    public LavaRapidoForm() {
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNome.setText("");
                textCor.setText("");
                textModelo.setText("");
                textPlaca.setText("");
                valorReaisLabel.setText("R$");

            }
        });
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String modelo = textModelo.getText();
                String placa = textPlaca.getText();
                String cor = textCor.getText();
                String tipoVeiculo;
                String valor;
                String servico = (String) comboBoxServicos.getSelectedItem();

                if (radioButtonCarro.isSelected()){
                    tipoVeiculo = "Carro";
                    if (comboBoxServicos.getSelectedIndex()==0){
                        valor = "R$ 50.0";
                    }
                    else if (comboBoxServicos.getSelectedIndex()==1){
                        valor = "R$ 80.0";
                    }
                    else {
                        valor = "R$ 100.0";
                    }
                }
                else {
                    tipoVeiculo = "Moto";
                    if (comboBoxServicos.getSelectedIndex()==0){
                        valor = "R$ 20.0";
                    }
                    else if (comboBoxServicos.getSelectedIndex()==1){
                        valor = "R$ 45.0";
                    }
                    else {
                        valor = "R$ 70.0";
                    }
                }

                Cliente cliente = new Cliente(nome, modelo, cor, placa, servico, tipoVeiculo, valor);
                listaClientes.add(cliente);

                textNome.setText("");
                textCor.setText("");
                textModelo.setText("");
                textPlaca.setText("");
                valorReaisLabel.setText("R$");
                radioButtonCarro.setSelected(false);
                radioButtonMoto.setSelected(false);
            }
        });
        radioButtonCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxServicos.getSelectedIndex() == 0){
                    valorReaisLabel.setText("R$ 50.0");
                }
                else if (comboBoxServicos.getSelectedIndex() == 1){
                    valorReaisLabel.setText("R$ 80.0");
                }
                else {
                    valorReaisLabel.setText("R$ 110.0");
                }
            }
        });
        radioButtonMoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxServicos.getSelectedIndex() == 0){
                    valorReaisLabel.setText("R$ 20.0");
                }
                else if (comboBoxServicos.getSelectedIndex() == 1){
                    valorReaisLabel.setText("R$ 45.0");
                }
                else {
                    valorReaisLabel.setText("R$ 70.0");
                }
            }
        });
        comboBoxServicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonMoto.isSelected()){
                    if (comboBoxServicos.getSelectedIndex() == 0){
                        valorReaisLabel.setText("R$ 20.0");
                    }
                    else if (comboBoxServicos.getSelectedIndex() == 1){
                        valorReaisLabel.setText("R$ 45.0");
                    }
                    else {
                        valorReaisLabel.setText("R$ 70.0");
                    }
                } else {
                    if (comboBoxServicos.getSelectedIndex() == 0){
                        valorReaisLabel.setText("R$ 50.0");
                    }
                    else if (comboBoxServicos.getSelectedIndex() == 1){
                        valorReaisLabel.setText("R$ 80.0");
                    }
                    else {
                        valorReaisLabel.setText("R$ 110.0");
                    }
                }
            }
        });
        gerarRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arquivo novoAqrv = new Arquivo();

                try {
                    novoAqrv.gerarRelatorio(listaClientes);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                // abre a segunda janela
                JFrame frameRelatorio = new JFrame("Relatório Gerado");
                frameRelatorio.setContentPane(new RelatorioGerado().base);
                // IMPORTANTE: DISPOSE_ON_CLOSE fecha apenas esta janela
                frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameRelatorio.pack();
                frameRelatorio.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LavaRapidoForm");
        frame.setContentPane(new LavaRapidoForm().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

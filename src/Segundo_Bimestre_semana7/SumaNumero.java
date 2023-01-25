package Segundo_Bimestre_semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_resta;
    private JButton btn_multiplicar;
    private JButton btn_dividir;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma =Integer.parseInt(txt_n1.getText()) + Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta =Integer.parseInt(txt_n1.getText()) - Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        btn_multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion =Integer.parseInt(txt_n1.getText()) * Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multiplicacion));
            }
        });
        btn_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=0;
                double n2=0;
                double division=0;
                try{
                    n1=Double.parseDouble(txt_n1.getText());
                    n2=Double.parseDouble(txt_n2.getText());
                    division=n1/n2;
                lbl_resultado.setText(String.valueOf(division));
                }catch(Exception error){
                  String pantalla = "Operación Inválida";
                    lbl_resultado.setText(String.valueOf(pantalla));
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}

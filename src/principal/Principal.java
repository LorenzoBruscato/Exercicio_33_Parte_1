/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.*;
import model.Fisica;
import model.Juridica;
import model.Empresa;

public class Principal {

    public static void main(String args[]) {
    Empresa e = new Empresa();
    Fisica pf = new Fisica();
    Juridica pj = new Juridica();
    int op = -1;
    while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
            1 - Preencher Pessoa Fisica
            2 - Imprimir Pessoa Fisica
            3 - Preencher Pessoa Juridica
            4 - Imprimir Pessoa Juridica
            5 - Maior rendimento
            0 - Sair"""));
            switch (op) {
                case 1 -> pf.leitura();
                case 2 -> pf.imprimir();
                case 3 -> pj.leitura();
                case 4 -> pj.imprimir();
                case 5 -> e.Maior(pf, pj);
                case 0 -> System.exit(0);
            }
        }
    }
}
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Juridica extends Empresa {

    private int cnpj;
    private int ie;
    private Double faturamento;

    public Juridica() {
    }

    public Juridica(int cnpj, int ie, Double faturamento, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
        this.faturamento = faturamento;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

  

   

    @Override
    public void leitura() {
        super.leitura();
        setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Seu Cnpj: ")));
        setIe(Integer.parseInt(JOptionPane.showInputDialog("Seu ie: ")));
        setFaturamento(Double.parseDouble(JOptionPane.showInputDialog("Faturamento: ")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return (super.paraString() + "\nCnpj: " + getCnpj()
                + "\nIE: " + getIe()
                + "\nFaturamento: " + getFaturamento());
    }
}

package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Fisica extends Empresa {

    private int cpf;
    private int rg;
    private Double salario;

    public Fisica() {
    }

    public Fisica(int cpf, int rg, Double salario, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

   

   

    @Override
    public void leitura() {
        super.leitura();
        setCpf(Integer.parseInt(JOptionPane.showInputDialog("Seu Cpf: ")));
        setRg(Integer.parseInt(JOptionPane.showInputDialog("Seu Rg: ")));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Seu Salário: ")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return (super.paraString() + "\nCpf: " + getCpf()
                + "\nRg: " + getRg()
                + "\nSalario: " + getSalario());
    }
}

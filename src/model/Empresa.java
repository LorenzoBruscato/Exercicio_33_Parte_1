package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Empresa {

    private String nome;
    private String endereco;
    private int telefone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void Maior(Fisica pf, Juridica pj) {
        double salarioPf = pf.getSalario();
        double salarioPj = pj.getFaturamento();
        if (salarioPf == salarioPj) {
            JOptionPane.showMessageDialog(null, "O Redimento é igual");
        } else if (salarioPf > salarioPj) {
            JOptionPane.showMessageDialog(null, "O maior redimento é: " + pf.getNome());
            JOptionPane.showMessageDialog(null, "O menor redimento é: " + pj.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "O maior salário é: " + pj.getNome());
            JOptionPane.showMessageDialog(null, "O menor redimento é: " + pf.getNome());

        }
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Nome: "));
        setEndereco(JOptionPane.showInputDialog("Endereço:"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Telefone: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return ("Nome: " + getNome()
                + "\nEndereço: " + getEndereco()
                + "\nTelefone:" + getTelefone());
    }
}

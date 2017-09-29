package br.com.teste;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String LOGIN = "H";
    private static final Integer SENHA = 123;

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Digite o Login!");
        Integer senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Senha!"));

        if (LOGIN.equals(login) && senha == SENHA) {
            JOptionPane.showMessageDialog(null, "LOGIN efetuado com sucesso!");

        } else {
            JOptionPane.showMessageDialog(null, "LOGIN inválido!");
            return;
        }

        //menu


        //metodo de cadastro de pessoas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma pessoa?") == 0) {

            Pessoa pessoa = new Pessoa();

            pessoa.nome = JOptionPane.showInputDialog("Nome");
            pessoa.numTel = JOptionPane.showInputDialog("Telefone");
            pessoa.logradouro = JOptionPane.showInputDialog("Rua/AV");
            pessoa.complemento = JOptionPane.showInputDialog(("Complemento"));
            pessoa.bairro = JOptionPane.showInputDialog("Bairro");
            pessoa.numCasa = JOptionPane.showInputDialog("Numero");
            pessoas.add(pessoa);
        }

        for (Pessoa pessoa : pessoas) {
            JOptionPane.showMessageDialog(null, " Nome: " + pessoa.nome + " \n Telefone: "
                    + pessoa.numTel + " \n Rua: " + pessoa.logradouro + " \n Complemento: " + pessoa.complemento +
                    " \n Bairro: " + pessoa.bairro + " \n Numero: " + pessoa.numCasa);
        }

        //metodo cadastro de animal
        List<Animal> animais = new ArrayList<Animal>();
        while (JOptionPane.showConfirmDialog(null, "Cadastro de um novo Animal") == 0) {

            Animal animal = new Animal();

            animal.codBrinco = JOptionPane.showInputDialog("Código Brinco");
            animal.nome = JOptionPane.showInputDialog("Nome do Animal");
            animal.raca = JOptionPane.showInputDialog("Raça do Animal");
            animal.cor = JOptionPane.showInputDialog("Cor do Animal");
            animais.add(animal);
        }

        for (Animal animal : animais) {
            JOptionPane.showMessageDialog(null, " Código: " + animal.codBrinco + " \n Nome: "
                    + animal.nome + " \n Raça: " + animal.raca + " \n Cor: " + animal.cor);
        }

        //metodo cadastro de propriedades
        List<Propriedade> propriedades = new ArrayList<Propriedade>();
        while (JOptionPane.showConfirmDialog(null, "Cadastrar nova Proriedade") == 0) {


            Propriedade propriedade = new Propriedade();

            propriedade.codLocal = JOptionPane.showInputDialog("Código Local");
            propriedade.nomeFunc = JOptionPane.showInputDialog("Nome Caseiro");
            propriedade.nomePropriedade = JOptionPane.showInputDialog("Código Fazenda");

        }

        for (Propriedade propriedade : propriedades) {
            JOptionPane.showConfirmDialog(null, "Código: " + propriedade.codLocal + "\n Nome Funcionário: " + propriedade.nomeFunc +
                    "\n Nome Fazenda: " + propriedade.nomePropriedade);


        }

        return;
    }

}


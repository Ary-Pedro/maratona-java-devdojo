package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        double[] salarios = {5000,6000,1500};
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Jorge";
        funcionario1.idade = 55;
        funcionario1.salario = salarios;
        funcionario1.imprime(funcionario1);
        System.out.println("Média: "+funcionario1.mediaSalarios(funcionario1));
    }
}

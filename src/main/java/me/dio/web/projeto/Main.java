package me.dio.web.projeto;

public class Main {

    public static void main(String[] args) {

        Clientes Edvaldo = new Clientes();
        Edvaldo.setNomeCliente("Junior");
        Contas cc = new ContaCorrente(Edvaldo);
        Contas poupanca = new contaPoupanca(Edvaldo);

        cc.imprimirExtrato();

        System.out.println("");

        poupanca.imprimirExtrato();

        poupanca.depositar(100);

        System.out.println("");

        poupanca.imprimirExtrato();

        System.out.println("");

        cc.depositar(500);

        cc.imprimirExtrato();

        System.out.println("");

        cc.comprarDolar(50);

        System.out.println("");

        cc.imprimirExtrato();

        cc.transferir(10,poupanca);
        cc.sacarDolar(3);

        poupanca.imprimirExtrato();
        cc.imprimirExtrato();

    }
}

package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das contas
        Conta contaCorrente = new ContaCorrente(500.0);
        Conta contaPoupanca = new ContaPoupanca(1000.0);
        Conta contaInvestimento = new ContaInvestimento(1500.0);

        // Testando depósitos
        contaCorrente.depositar(200.0);
        contaPoupanca.depositar(300.0);
        contaInvestimento.depositar(400.0);

        // Testando saques
        try {
            contaCorrente.sacar(100.0);
            System.out.println("Saque realizado com sucesso na Conta Corrente");
        } catch (RuntimeException e) {
            System.out.println("Erro ao sacar da Conta Corrente: " + e.getMessage());
        }

        try {
            contaPoupanca.sacar(2000.0);
            System.out.println("Saque realizado com sucesso na Conta Poupança");
        } catch (RuntimeException e) {
            System.out.println("Erro ao sacar da Conta Poupança: " + e.getMessage());
        }

        try {
            contaInvestimento.sacar(500.0);
            System.out.println("Saque realizado com sucesso na Conta Investimento");
        } catch (RuntimeException e) {
            System.out.println("Erro ao sacar da Conta Investimento: " + e.getMessage());
        }

        // Imprimindo os saldos finais
        System.out.println("Saldo final da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo final da Conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo final da Conta Investimento: " + contaInvestimento.getSaldo());
    }
}

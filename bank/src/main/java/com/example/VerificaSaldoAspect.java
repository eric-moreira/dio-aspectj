package com.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class VerificaSaldoAspect {

    @Before("execution(* com.example.Conta.sacar(double)) && this(conta)")
    public void antesDoSaque(JoinPoint joinPoint, Conta conta) {
        double valorASacar = (Double) joinPoint.getArgs()[0];
        double saldoAtual = conta.getSaldo();

        if (saldoAtual < valorASacar) {
            throw new RuntimeException("Saldo insuficiente para saque!");
        }
    }
}

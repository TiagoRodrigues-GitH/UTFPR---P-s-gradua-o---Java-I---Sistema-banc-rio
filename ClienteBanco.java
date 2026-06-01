/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasbancario;

/**
 *
 * @author Tiago Horaguchi Rodrigues
 */
abstract public class ClienteBanco implements Verifica {

    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    abstract void verifDoc();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta < 0) {
            throw new NumException();
        } else {
            this.numeroConta = numeroConta;

        }
    }

    @Override
    public void validar() {
        if (getNumeroConta() % 2 == 0) {
            System.out.println("Numero da Conta é par");
        } else {
            System.out.println("Numero da Conta é impar");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

}

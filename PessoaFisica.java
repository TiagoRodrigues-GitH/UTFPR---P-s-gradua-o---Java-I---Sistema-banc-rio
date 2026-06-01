/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasbancario;

/**
 *
 * @author Tiago Horaguchi Rodrigues
 */
public final class PessoaFisica extends ClienteBanco {

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void verifDoc() {
        if (getCpf() < 10 || getCpf() > 20) {
            System.out.println("CPF  Invalido");
        } else {
            System.out.println("CPF Valido");
        }
    }

}

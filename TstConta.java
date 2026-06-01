/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemasbancario;

/**
 *
 * @author Tiago Horaguchi Rodrigues
 */
public class TstConta {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();

        try{
            pj.setNumeroConta(10);
        }catch(NumException ne){
            ne.impMsg();
        }
        pj.setCnpj(10);
        pj.getEnder().setRua("Rua de Pj");

        pj.getResponsavel().setCpf(5);
        pj.getResponsavel().setNome("Nome do responsável em Pj");

        System.out.println("\n Pj - Número de Conta: "+ pj.getNumeroConta());
        pj.validar();
        System.out.println("\n - CNPJ: " + pj.getCnpj());
        pj.validar();
        System.out.println("\n Pj - Rua: "+ pj.getEnder().getRua());

        System.out.println("\n PF/PJ- CPF: "+ pj.getResponsavel().getCpf());
        pj.getResponsavel().verifDoc();

        System.out.println("\n PF/PJ - Nome: "+ pj.getResponsavel().getNome());
        pj.verifDoc();
    }
    }
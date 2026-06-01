# 🏦 Sistema Bancário em Java - POO    

Este projeto foi desenvolvido como exercício acadêmico para aplicar os pilares da **Programação Orientada a Objetos**: **Herança**, **Polimorfismo**, **Encapsulamento** e **Exceções**.

## 🧱 Estrutura do Projeto

- `ClienteBanco` (abstrata)
- `PessoaFisica` (final)
- `PessoaJuridica` (final)
- `Endereco` (final)
- `NumException` (exceção verificada)
- `Verifica` (interface)
- `TstConta` (classe principal para testes)

## ⚙️ Funcionalidades

- Cadastro de clientes Pessoa Física e Jurídica
- Validação de CPF (faixa entre 10 e 20)
- Validação de nome do responsável (Pessoa Jurídica)
- Impedimento de número de conta negativo com exceção personalizada
- Verificação se o número da conta é par ou ímpar

## ▶️ Como executar

1. Compile todos os arquivos `.java`:
   ```bash
   javac *.java
2. Execute a classe TstConta:
 java TstConta

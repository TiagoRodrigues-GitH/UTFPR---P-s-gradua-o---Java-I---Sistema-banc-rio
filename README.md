
# 🏦 Java Banking System - OOP

This project was developed as an academic exercise to apply the pillars of **Object-Oriented Programming**: **Inheritance**, **Polymorphism**, **Encapsulation**, and **Exception Handling**.

## 🧱 Project Structure

- `ClienteBanco` (abstract)
- `PessoaFisica` (final)
- `PessoaJuridica` (final)
- `Endereco` (final)
- `NumException` (checked exception)
- `Verifica` (interface)
- `TstConta` (main test class)

## ⚙️ Features

- Register Individual and Legal Entity clients
- Validate CPF (range between 10 and 20)
- Validate responsible person's name (Legal Entity)
- Prevent negative account numbers with a custom exception
- Check if the account number is even or odd

## ▶️ How to run

1. Compile all `.java` files:
   ```bash
   javac *.java

2. Run
   ```bash
   java TstConta

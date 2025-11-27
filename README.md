# BankAccount

Java Exercise - Bank Account System

## Table of Contents

- [📋 About the Project](#-about-the-project)
- [🚀 Features](#-features)
- [🛠️ Technologies Used](#️-technologies-used)
- [📂 Project Structure](#-project-structure)
- [▶️ How to Use](#️-how-to-use)
  - [Prerequisites](#prerequisites)
  - [Running the Project](#running-the-project)
  - [Usage Flow](#usage-flow)
- [💡 Practiced Concepts](#-practiced-concepts)
- [👨‍💻 Author](#-author)
- [📝 License](#-license)

## 📋 About the Project

This is an exercise project developed during the Alura course to practice basic Java concepts. The system simulates simple banking operations through an interactive console menu.

## 🚀 Features

The system offers the following operations:

1. **View Balance** - Check the current account balance
2. **Receive** - Register a transfer received from another user
3. **Transfer** - Make a transfer to another user (with balance validation)
4. **Exit** - Close the program

## 🛠️ Technologies Used

- Java
- Scanner (for data input)
- Object-Oriented Programming

## 📂 Project Structure

```
BankAccount/
├── src/
│   ├── Main.java          # Main class with menu and system logic
│   └── user/
│       └── User.java      # Model class representing a user/account
```

## ▶️ How to Use

### Prerequisites
- Java JDK 8 or higher installed
- Terminal or Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Running the Project

1. **Clone the repository:**
   ```bash
   git clone https://github.com/DiegoS-Nunes/BankAccount.git
   cd BankAccount/BankAccount
   ```

2. **Compile the project:**
   ```bash
   javac -d bin src/Main.java src/user/User.java
   ```

3. **Run the program:**
   ```bash
   java -cp bin Main
   ```

### Usage Flow

1. When starting, the system will request:
   - User name
   - Initial account balance

2. After login, you will see a menu with 4 options

3. Choose the desired operation by typing the corresponding number

4. For receive or transfer operations:
   - Enter the sender/recipient name
   - Enter the operation value
   - The system will validate and update the balance automatically

5. The program will continue running until you choose option "4 - Exit"

## 💡 Practiced Concepts

- Data input and output with `Scanner`
- Control structures (loops and conditionals)
- Classes and objects
- Encapsulation (getters and setters)
- Data validation
- String manipulation

## 👨‍💻 Author

Diego S. Nunes

---

# BankAccount

Exercício de Java - Sistema de Conta Bancária

## Sumário

- [📋 Sobre o Projeto](#-sobre-o-projeto)
- [🚀 Funcionalidades](#-funcionalidades)
- [🛠️ Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [📂 Estrutura do Projeto](#-estrutura-do-projeto)
- [▶️ Como Usar](#️-como-usar)
  - [Pré-requisitos](#pré-requisitos)
  - [Executando o Projeto](#executando-o-projeto)
  - [Fluxo de Uso](#fluxo-de-uso)
- [💡 Conceitos Praticados](#-conceitos-praticados)
- [👨‍💻 Autor](#-autor)
- [📝 Licença](#-licença)

## 📋 Sobre o Projeto

Este é um projeto de exercício desenvolvido durante o curso da Alura para praticar conceitos básicos de Java. O sistema simula operações bancárias simples através de um menu interativo no console.

## 🚀 Funcionalidades

O sistema oferece as seguintes operações:

1. **Ver Saldo** - Consulta o saldo atual da conta
2. **Receber** - Registra uma transferência recebida de outro usuário
3. **Transferir** - Realiza uma transferência para outro usuário (com validação de saldo)
4. **Sair** - Encerra o programa

## 🛠️ Tecnologias Utilizadas

- Java
- Scanner (para entrada de dados)
- Programação Orientada a Objetos

## 📂 Estrutura do Projeto

```
BankAccount/
├── src/
│   ├── Main.java          # Classe principal com o menu e lógica do sistema
│   └── user/
│       └── User.java      # Classe modelo representando um usuário/conta
```

## ▶️ Como Usar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal ou IDE Java (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Executando o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/DiegoS-Nunes/BankAccount.git
   cd BankAccount/BankAccount
   ```

2. **Compile o projeto:**
   ```bash
   javac -d bin src/Main.java src/user/User.java
   ```

3. **Execute o programa:**
   ```bash
   java -cp bin Main
   ```

### Fluxo de Uso

1. Ao iniciar, o sistema solicitará:
   - Nome do usuário
   - Saldo inicial da conta

2. Após o login, você verá um menu com 4 opções

3. Escolha a operação desejada digitando o número correspondente

4. Para operações de receber ou transferir:
   - Digite o nome do remetente/destinatário
   - Informe o valor da operação
   - O sistema validará e atualizará o saldo automaticamente

5. O programa continuará em execução até que você escolha a opção "4 - Exit"

## 💡 Conceitos Praticados

- Entrada e saída de dados com `Scanner`
- Estruturas de controle (loops e condicionais)
- Classes e objetos
- Encapsulamento (getters e setters)
- Validação de dados
- Manipulação de Strings

## 👨‍💻 Autor

Diego S. Nunes

## 📝 Licença

Este é um projeto de estudos desenvolvido como exercício do curso Alura.
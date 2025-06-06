# 🏦 Projeto Banco em Java

Este é um projeto simples feito em Java que simula operações básicas de um banco, como:

- Cadastro de cliente (nome, CPF, número da conta)
- Consulta de extrato/saldo
- Depósito em conta
- Saque com verificação de saldo

---

## 📌 Tecnologias usadas

- Java (JDK 17 ou superior recomendado)
- Scanner (`java.util.Scanner`) para entrada de dados via terminal

---

## 🚀 Como executar

1. Certifique-se de ter o Java instalado na sua máquina.
2. Compile o projeto:

```bash
javac Main.java Banco.java
java Main

📂 Estrutura do projeto
📁 ProjetoBanco
├── Banco.java     // Classe com atributos e métodos da conta
└── Main.java      // Classe principal com o menu e a interação com o usuário

✍️ Exemplo de uso
Digite seu nome:
João da Silva
Digite seu CPF:
123.456.789-00
Digite sua conta:
12345

*********************************
*                               *
*   DIGITE A OPERAÇÃO DESEJADA  *
*   1- CONSULTAR O EXTRATO      *
*   2- DEPOSITAR NA CONTA       *
*   3- SACAR DA CONTA           *
*   4- SAIR                     *
*                               *
*********************************

Opção: 2
Digite o valor para depósito:
500

👨‍💻 Autor
Projeto desenvolvido por Davi Porto Dias, aluno de Análise e Desenvolvimento de Sistemas - IFRS Campus Restinga.
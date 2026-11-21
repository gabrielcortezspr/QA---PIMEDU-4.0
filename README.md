# QA: testes automatizados com Java

Exercícios e projeto do curso de QA do **Programa IT Talent** (2024), aplicados ao sistema
PIMEDU. A sequência vai do teste unitário ao BDD, cada pasta é um projeto Maven independente.

| Pasta | O que mostra |
|---|---|
| [`01-junit-basico`](01-junit-basico) | JUnit 4: asserções, pré e pós-condições, testes de uma calculadora |
| [`02-selenium-xpath`](02-selenium-xpath) | Selenium WebDriver com XPath, cadastro e pré-cadastro |
| [`03-selenium-pimedu`](03-selenium-pimedu) | Login e cadastro no PIMEDU: cenários de sucesso, senha em branco, campos inválidos |
| [`04-page-object`](04-page-object) | Os mesmos testes reescritos com o padrão Page Object |
| [`05-bdd-cucumber`](05-bdd-cucumber) | Cenários em Gherkin (`login.feature`) executados com Cucumber sobre os Page Objects |

## Stack

Java 21 · Maven · JUnit 4 · Selenium WebDriver 4 · Cucumber

## Como rodar

```sh
cd 04-page-object
cp src/credentials.example.txt src/credentials.txt   # preencha usuário e senha
mvn test
```

O `credentials.txt` está no `.gitignore`: nenhuma credencial fica no repositório.

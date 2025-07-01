# Projeto de Testes Automatizados - PIMEDU

Este repositório contém estudos e exemplos de automação de testes utilizando **Selenium WebDriver**, **JUnit** e **Cucumber** (BDD) aplicados ao sistema PIMEDU.

## Estrutura do Projeto

- `src/main/java/` - (Opcional) Código principal do sistema (não utilizado neste projeto de testes).
- `src/test/java/pageobj/` - Código dos testes automatizados, organizados em:
  - `pages/` - Page Objects (representação das telas do sistema)
  - `support/` - Utilitários e configuração do WebDriver
  - `resources/` - Definições de steps e runner do Cucumber
- `src/test/resources/` - Arquivos `.feature` do Cucumber (BDD)
- `src/credentials.txt` - Arquivo de credenciais de exemplo (preencha com seu usuário e senha para rodar os testes)
- `pom.xml` - Gerenciador de dependências Maven

## Tecnologias Utilizadas
- **Java 21**
- **JUnit 4**
- **Selenium WebDriver 4**
- **Cucumber Java & JUnit**
- **Maven**

## Estudos Realizados
- Criação de testes automatizados para login e cadastro no sistema PIMEDU
- Uso de Page Object Model para organização dos testes
- Integração de testes com Cucumber (BDD)
- Leitura de credenciais externas para testes seguros
- Execução de testes via linha de comando (Maven)

## Como Executar os Testes
1. **Clone o repositório**
2. **Preencha o arquivo `src/credentials.txt`** com seu usuário e senha:
   ```
   username=seu_email
   password=sua_senha
   ```
3. **Execute os testes com Maven:**
   ```bash
   mvn test
   ```
   Ou, para rodar os testes BDD (Cucumber):
   ```bash
   mvn test -Dcucumber.options="src/test/resources/login.feature"
   ```

## Como o Código Funciona
- Os testes estão em `src/test/java/pageobj/`
  - **Page Objects** (`pages/`): encapsulam as ações e elementos das telas (ex: `LoginPage.java`, `CadastroPage.java`)
  - **Support**: configuração do WebDriver (`Web.java`)
  - **Resources**: steps do Cucumber (`StepDefinitions.java`) e runner (`RunCucumberTest.java`)
- O arquivo `.feature` (`login.feature`) descreve o fluxo de teste em linguagem natural (Gherkin)
- As credenciais são lidas do arquivo `src/credentials.txt` para garantir segurança

## Exemplo de Fluxo BDD
```
Feature: Login
    Scenario: Login com sucesso
    Given O usuario esta na Homepage
    When O usuario abrir a tela de Login
    And Realizar o login
    Then A tela de cursos deve ser exibida
```

## Observações
- Não compartilhe suas credenciais reais em repositórios públicos.
- Para dúvidas, consulte os comentários nos arquivos de teste e page objects. 
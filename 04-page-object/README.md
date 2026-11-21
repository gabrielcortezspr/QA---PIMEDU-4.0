# Projeto de Testes Automatizados - PIMEDU PO

Este repositório contém estudos e exemplos de automação de testes utilizando **Selenium WebDriver** e **JUnit** aplicados ao sistema PIMEDU, utilizando o padrão Page Object Model (PO).

## Estrutura do Projeto

- `src/main/java/` - (Opcional) Código principal do sistema (não utilizado neste projeto de testes).
- `src/test/java/pageobj/` - Código dos testes automatizados, organizados em:
  - `pages/` - Page Objects (representação das telas do sistema)
  - `support/` - Utilitários e configuração do WebDriver
- `src/credentials.example.txt` - Modelo do arquivo de credenciais (copie para `src/credentials.txt`, que fica fora do git)
- `pom.xml` - Gerenciador de dependências Maven

## Tecnologias Utilizadas
- **Java 21**
- **JUnit 4**
- **Selenium WebDriver 4**
- **Maven**

## Estudos Realizados
- Criação de testes automatizados para login e cadastro no sistema PIMEDU
- Uso de Page Object Model para organização dos testes
- Leitura de credenciais externas para testes seguros
- Execução de testes via linha de comando (Maven)

## Como Executar os Testes
1. **Clone o repositório**
2. **Copie `src/credentials.example.txt` para `src/credentials.txt`** e preencha com seu usuário e senha:
   ```
   username=seu_email
   password=sua_senha
   ```
3. **Execute os testes com Maven:**
   ```bash
   mvn test
   ```

## Como o Código Funciona
- Os testes estão em `src/test/java/pageobj/`
  - **Page Objects** (`pages/`): encapsulam as ações e elementos das telas (ex: `LoginPage.java`, `CadastroPage.java`)
  - **Support**: configuração do WebDriver (`Web.java`)
- As credenciais são lidas do arquivo `src/credentials.txt` para garantir segurança

## Observações
- Não compartilhe suas credenciais reais em repositórios públicos.
- Para dúvidas, consulte os comentários nos arquivos de teste e page objects. 
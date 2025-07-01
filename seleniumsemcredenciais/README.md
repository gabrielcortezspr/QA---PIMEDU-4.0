# Projeto de Testes Automatizados - Selenium Sem Credenciais

Este repositório contém estudos e exemplos de automação de testes utilizando **Selenium WebDriver** e **JUnit** aplicados ao sistema PIMEDU, sem uso de arquivos de credenciais externos.

## Estrutura do Projeto

- `src/main/java/` - (Opcional) Código principal do sistema (não utilizado neste projeto de testes).
- `src/test/java/pimedu/` - Código dos testes automatizados.
- `pom.xml` - Gerenciador de dependências Maven

## Tecnologias Utilizadas
- **Java 21**
- **JUnit 4**
- **Selenium WebDriver 4**
- **Maven**

## Estudos Realizados
- Criação de testes automatizados para login e cadastro no sistema PIMEDU
- Testes de diferentes cenários de login (com e sem senha, campos em branco, etc)
- Execução de testes via linha de comando (Maven)

## Como Executar os Testes
1. **Clone o repositório**
2. **Execute os testes com Maven:**
   ```bash
   mvn test
   ```

## Como o Código Funciona
- Os testes estão em `src/test/java/pimedu/`
  - Cada arquivo representa um cenário de teste diferente (ex: `loginTest.java`, `cadastroTest.java`)
- Não há uso de arquivos de credenciais externos neste projeto

## Observações
- Não compartilhe suas credenciais reais em repositórios públicos.
- Para dúvidas, consulte os comentários nos arquivos de teste. 
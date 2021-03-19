# Projeto de Automação de testes
Tecnologias utilizadas: Java, Selenium WebDrive, Cucumber, Junit4, Maven e o padrão de projetos Page objects.

# Funcionalidade Automatizada 
* Entrar no site http://sampleapp.tricentis.com/101/app.php
* Preencher o formulário, aba “Enter Vehicle Data” e pressione next
* Preencher o formulário, aba “Enter Insurant Data” e pressione next
* Preencher o formulário, aba “Enter Product Data” e pressione next
* Preencher o formulário, aba “Select Price Option” e pressione next
* Preencher o formulário, aba “Send Quote” e pressione Send
* Verificar a mensagem “Sending e-mail success!” na tela

# Requisitos para execução 
1 - Possuir o Jdk 8 instalado na máquina

2 - Possuir o Eclipse ou outra Ide para importar o projeto

3 - Possuir o navegador Google Chrome instaldo na máquina (Teste executado na versão 89.0)

# Como executar 
1 - Realizar o clone do projeto

2 - Importar o projeto no Eclipse 

3 - Aguardar que o Maven baixe as dependências 

4 - Executar a classe PreencherFormulario.feature no pacote Feature

![alt text](https://github.com/matheus6874/testeSelenium/blob/main/testeSelenium/src/main/resources/execucao.PNG?raw=true)

5 - Ou executar através da classe RunTest.java no pacote runner

![alt text](https://github.com/matheus6874/testeSelenium/blob/main/testeSelenium/src/main/resources/execucao2.png?raw=true)






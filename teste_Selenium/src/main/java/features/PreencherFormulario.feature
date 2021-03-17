# language: pt

Funcionalidade: Realizar o prenchimento do formulário Automobile Insurance
	
	@CT01
  Cenario: CT01_PreencherFormulario
    Dado que eu acesso o site "http://sampleapp.tricentis.com/101/app.php"
    E preencho o formulario Vehicle Data
    E preencho o formulario Insurant Data
    E preencho o formulario Product Data
    E preencho o formulario Price Option
    E preencho o formulario Send Quote
    Quando submeto o formulario
    Então deve-se ver a mensagem de sucesso "Sending e-mail success!"
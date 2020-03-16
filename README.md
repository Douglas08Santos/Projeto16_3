
Tarefas Realizadas

**** Front-End

	- JSF 2.1.24
	- Primeface 5.0

**** Back-End
	
	- Hibernate 3
	- Hibernate JPA 2.0
	- Banco de Dados MySQL - Ver 14.14 Distrib 5.7.29, for Linux (x86_64)
	- Tomcat v7.0

**** Como executar:

	- Configuração do Banco

	1 - Atualizar, em persistence.xml, os campos user e password, para as
		configurações do seu banco:
		<property name="javax.persistence.jdbc.user" value="(user)"/>
		<property name="javax.persistence.jdbc.password" value="(password)"/>

	2 - Criar um shema(database) no mysql com o Nome que está em:
		<persistence-unit name="tarefas">

		No caso, "tarefas"

	3 - Adicionar o Tomcat v7.0 no eclipse
	4 - Run As -> Run on Server
	5 - O endereço de acesso a pagina, provalvemte seja:
		"http://localhost:8080/Esig/index.xhtml"

Autoria: Douglas Alexandre dos Santos 
	Email: <santosdouglas0808@gmail.com>
	GitHub: Douglas08Santos 


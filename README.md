# REST-API-distancia-cidades

Este é um projeto desenvolvido na plataforma da [Digital Innovation One](https://digitalinnovation.one/)

# Tecnologias

+ Spring Boot
+ Hibernate
+ Postgresql
+ Docker

# Sobre

Esta api oferece apenas rotas get para consultas de paises,
cidades, estados e outras duas rotas para calcular a distancia 
apenas entre cidades.
 
Pode ser poucas as oferecida pela api porém no projeto foi 
abordados diversos assuntos desde :
+ as anotações do hibernate para mapear os objetos com o banco de dados postgres
+ alguns comandos do docker para rodar o postgres e para mandar arquivos para o container do postgres
+ a estruturas de rest api no spring boot
+ utilizar uma biblioteca externa para converte o tipo de dado json do postgres para list no hibernate
+ a como fazer deploy desta aplicação no heroku 

# Rotas
+ para buscar os paises: https://consulta-distancia-cidades.herokuapp.com/countries
+ para buscar os estados: https://consulta-distancia-cidades.herokuapp.com/states
+ para buscar as cidades : https://consulta-distancia-cidades.herokuapp.com/cities
+ Para saber a distancia entre duas cidades usar os parametros From com To na uri example:
  + by-points: https://consulta-distancia-cidades.herokuapp.com/distances/by-points?from=4972&to=5270
  + by-cube: https://consulta-distancia-cidades.herokuapp.com/distances/by-cube?from=4972&to=5270
# Referencias 

+ Foi usado uma base de scripts em postgres ja definida feito por [Chinnon Santos](https://github.com/chinnonsantos) podendo ser acessado pelo seguinte link: [sql-paises-estados-cidades](https://github.com/chinnonsantos/sql-paises-estados-cidades)
+ foi usado também uma biblioteca externa para converter o tipo json do postgres para uma List feito por [Vlad Mihalcea](https://github.com/vladmihalcea) podendo ser acessado pelo seguinte link: [hibernate-types](https://github.com/vladmihalcea/hibernate-types)
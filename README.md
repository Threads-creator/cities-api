# API REST usando Spring no curso da DIO

API usando o padrao REST, banco de dados Postgresql, com Docker e Heroku como containers de teste para o banco de dados.

## Funçoes da API

As entidades retornada tem uma lista de sub entidades, caso exista na tabela. Ex: Estado tem um objeto do tipo País quando chamado.

- **/countries** : retorna todos os países
- **/states**: retorna todos os Estados do Brasil
- **/cities**: retorna todos as cidades do Brasil
- **/distances**: retorna a distancia

Em distances implementei o parametro **unit** para definir metros ou milhas no resultado

## Banco de Dados

Os sqls do banco de dados esta na pasta **db-sqls** 

## Heroku

Criei um container no Heroku no segunte link **https://protected-springs-33005.herokuapp.com** . 
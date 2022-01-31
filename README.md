
<h1 align="center">
    <br>
     API - Validate Password
</h1>

<h4 align="center">
    Uma API para validar o nível de segurança da senha fornecida pelo usuário.
</h4>


<p align="center">
  <a href="#rocket-technologies">Tecnologias </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#install">Como instalar </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#features">Regras </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#comoUtilizar">Como Utilizar </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</p>

##

##  <p align="center">⚠️ ATENÇÃO ⚠️</p>

```
O deploy foi realizado na nuvem utilizando o serviço do Heroku. De primeiro momento as requisições podem demorar 
alguns segundos até que o servidor se inicie, pois o mesmo hiberna após 20 minutos de inatividade.

```


<h2 id="rocket-technologies"> :rocket: Tecnologias</h2>

<p >Este projeto foi desenvolvido com as principais tecnologias:</p>

- [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Regex](https://medium.com/xp-inc/regex-um-guia-pratico-para-express%C3%B5es-regulares-1ac5fa4dd39f)

<h2 id="install"> Como instalar </h2>

### Usando Git (recomendado)

1.  Clone o projeto do github.

```
git clone https://github.com/MarlonSilva21/validate-password.git 
```

### Usando o zip do Download manual

1.  Faça download do repositório
2.  Descompacte para o diretório desejado
3.  Abra-o com uma IDE de sua preferência
 

<h2 id="features"> Descrição das regras </h2>

Será considerada uma senha válida aquela que seguir as regras abaixo.

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
    - Considere como especial os seguintes caracteres: `!@#$%^&*()-+`
- Não possuir caracteres repetidos dentro do conjunto

Exemplo:

```c#
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```

> **_Nota:_**  Espaços em branco não são considerados como caracteres válidos.


<h2 id="comoUtilizar">Como utilizar</h2>

> **_Explicação:_** O seu uso é bem simples, envie uma senha para validação, caso ela atenda as regras será retornado `true`, caso contrário `false`

### Localmente

  Com a aplicação rodando localmente, será necessário realizar uma requisição
  do tipo `POST` no end-point : `http://localhost:8080/`
  <br/>
  
  passando no body um json com o campo obrigatório:
  
  - Password (seguindo as regras pré-estabelecidas para a sua criação)


#### Exemplo JSON

```
{
    "password":"your_password"
}
```
<img align="center" alt="gif" width="100%" height="100%" src="https://i.imgur.com/QNr7snP.gif">

##

### Remotamente - Deploy

  Para acessar remotamente sem precisar da API rodando localmente, será necessário realizar uma requisição
  do tipo `POST` no end-point : `https://passvalidator.herokuapp.com/`
  <br/>
  
  passando no body um json com o campo obrigatório:
  
  - Password (seguindo as regras pré-estabelecidas para a sua criação)


#### Exemplo JSON

```
{
    "password":"your_password"
}
```
<img align="center" alt="gif" width="100%" height="100%" src="https://i.imgur.com/FBr3sKH.gif">


##

#### O swagger da aplicação está disponível no endpoint
```
https://passvalidator.herokuapp.com/swagger-ui/
```

##

Feito por [Marlon Silva](https://www.linkedin.com/in/marlon-silva-43075a184/) :wave: 



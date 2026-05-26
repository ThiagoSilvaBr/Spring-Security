Atividade - Introdução ao Spring Security
Nesta atividade você irá praticar conceitos básicos de configuração do Spring Security em APIs REST utilizando Spring Boot.

Parte 1 - Conceitos
Explique com suas palavras o que é Spring Security.
Spring Security é uma biblioteca do Spring boot que permite a validação de dados e segurança possibilitanto uma melhor segurança para o código.

Para que serve o método csrf().disable()?
Serve para desabilitar a necessidade de utilizar um token de autenticação para realizar requisições API.

Explique o que significa SessionCreationPolicy.STATELESS.
Informa ao Spring Security para nunca criar ou usar uma HttpSession para obter a identidade do usuário

Qual a função do permitAll()?
Libera o acesso a rotas especificas sem a necessidade de validação.

Explique o que faz o requestMatchers().
Serve para definir quais URLs ou requisições HTTP específicas sofrerão ou serão isentas de regras de segurança

Qual a função do anyRequest().authenticated()?
Exigir que o usuário esteja autenticado (logado) para acessar qualquer requisição ou endpoint

O que é uma API Stateless?
é aquela em que o servidor não guarda o contexto ou histórico das requisições anteriores

Explique o que a lambda abaixo faz: session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
Essa instrução configura o Spring Security para não criar e nem utilizar sessões HTTP (como o tradicional JSESSIONID). Isso é o padrão para APIs RESTful modernas, 
onde o servidor é stateless (sem estado) e o cliente deve enviar um token (como o JWT) a cada nova requisição para ser autenticado.

# Spring Boot Experting Security 🔐

Projeto de estudo avançado com foco em autenticação e autorização utilizando Spring Boot, Spring Security e JWT.

## ✨ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- Swagger (SpringDoc OpenAPI)
- JWT (JSON Web Token)
- Maven
- Lombok
- Flyway
- MySQL

## 🎯 Objetivo

Consolidar o conhecimento em segurança com Spring Boot através de:
- Implementação de múltiplos `AuthenticationProvider`s
- Criação de um sistema de autorização baseado em roles
- Autenticação via JWT e via header customizado
- Estruturação de entidades com relacionamento N:N entre usuários e grupos
- Uso de `@PreAuthorize` para controle de acesso a endpoints

## 🧠 Funcionalidades

- Cadastro de **Usuários**, **Grupos** e associação via **UserGroup**
- Autenticação via múltiplas fontes:
    - Banco de dados com JWT
- Controle de acesso por permissões/roles
- Endpoints públicos, privados e com autorização por grupo
- Simulação de acessos a setores (como RH) com regras específicas

## 🔐 Segurança

- Implementação personalizada de `AuthenticationProvider`
- Filtro `JwtAuthenticationFilter` para autenticação via JWT
- Controle de acesso via `@PreAuthorize`, `hasRole`, `hasAuthority`
- Swagger com suporte a autenticação JWT

## 🗄️ Persistência

- Banco de dados **MySQL**
- Migrations gerenciadas com **Flyway**

## 🔍 Endpoints (exemplos)

| Método | Rota             | Acesso                                                    |
|--------|------------------|-----------------------------------------------------------|
| GET    | /api/public      | Livre                                                     |
| POST   | /api/auth/login  | Geração de JWT                                            |
| GET    | /api/private     | Autenticado com token JWT                                 |
| GET    | /api/admin       | Role `ADMIN`                                              |
| GET    | /api/rh/tecnico  | Role `TECNICO_RH` ou `GERENTE_RH` ou `ADMIN`              |
| GET    | /api/rh/gerente  | Role `GERENTE_RH` ou `ADMIN`                              |

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/spring-boot-experting-security.git
   cd spring-boot-experting-security
   ```

2. Compile e rode:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse o Swagger:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

4. Autenticação no Swagger:
    - Clique no cadeado (Authorize)
    - Informe o token JWT para testar os endpoints protegidos

## ✅ Melhorias Futuras
- Operações de update/delete
- Autenticação via OAuth2 e OpenID Connect (Google, GitHub, LinkedIn)
- Testes automatizados com JUnit e Mockito
- Uso de containers (Docker) e CI/CD

## 📚 Aprendizados

- Implementação de segurança baseada em roles com Spring Security
- JWT com filtro customizado no Spring Security
- Estruturação clara e escalável para projetos seguros

## 🧠 Autor

**Elvis Assis**  
Engenheiro de Software em constante aprendizado  
📫 [LinkedIn](https://www.linkedin.com/in/elvis-assis)

# Spring Boot Experting Security 🔐

Projeto de estudo avançado com foco em autenticação e autorização utilizando Spring Boot e Spring Security.

## ✨ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- Swagger
- Maven
- Lombok

## 🎯 Objetivo

Consolidar o conhecimento em segurança com Spring Boot através de:
- Implementação de múltiplos `AuthenticationProvider`s
- Criação de um sistema de autorização baseado em roles
- Utilização de filtros personalizados para autenticação via header
- Estruturação de entidades com relacionamento N:N entre usuários e grupos
- Uso de `@PreAuthorize` para controle de acesso a endpoints

## 🧠 Funcionalidades

- Cadastro de **Usuários**, **Grupos** e associação via **UserGroup**
- Autenticação via múltiplas fontes:
  - Banco de dados
  - Dados mockados (senha master)
  - Header customizado (`x-secret`)
- Controle de acesso por permissões/roles
- Endpoints públicos, privados e com autorização por grupo
- Simulação de acessos a setores (como RH) com regras específicas

## 🔐 Segurança

- Implementação personalizada de `AuthenticationProvider`
- Classe `UserIdentify` centraliza os dados da identidade do usuário
- Autenticação com `CustomAuthentication`
- Filtro `CustomFilter` para simular autenticação via header
- Controle de acesso via `@PreAuthorize` nos endpoints

## 🔍 Endpoints (exemplos)

| Método | Rota             | Acesso                |
|--------|------------------|-----------------------|
| GET    | /api/public      | Livre                 |
| GET    | /api/private     | Autenticado           |
| GET    | /api/admin       | Role `ADMIN`          |
| GET    | /api/rh/tecnico  | Role `TECNICO_RH` ou `GERENTE_RH` ou `ADMIN` |
| GET    | /api/rh/gerente  | Role `GERENTE_RH` ou `ADMIN` |

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

## ✅ Melhorias Futuras

- Validações de domínio (usuário duplicado, campos obrigatórios)
- Operações de update/delete
- Autenticação via OAuth2, OpenID Connect e JWT (Google, GitHub, LinkedIn)
- Testes automatizados com JUnit e Mockito
- Uso de containers (Docker) e CI/CD

## 📚 Aprendizados

- Criação de autenticação customizada com múltiplas fontes
- Implementação de segurança baseada em roles com Spring Security
- Estruturação clara e escalável para projetos seguros
- Como utilizar filtros personalizados no Spring Security

## 🧠 Autor

**Elvis Assis**  
Engenheiro de Software em constante aprendizado  
📫 [LinkedIn](https://www.linkedin.com/in/seu-perfil)

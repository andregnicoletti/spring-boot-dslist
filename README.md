# 🎮 DSList API

Este é um projeto de backend desenvolvido durante um treinamento intensivo de uma semana. A API simula uma listagem de jogos, permitindo o cadastro, ordenação e organização por listas personalizadas — semelhante ao conceito de "minha lista de jogos".

> ✅ Aplicação hospedada com deploy automatizado:  
> 🔗 [https://spring-boot-dslist-production.up.railway.app](https://spring-boot-dslist-production.up.railway.app)

---

## 🚀 Tecnologias Utilizadas

- **MapStruct** para mapeamento automático entre DTOs e entidades

- **Java 21**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
- **Banco de dados PostgreSQL**
- **Docker e Docker Compose**
- **Deploy automático via Railway**
- **Modelo em camadas (Controller, Service, Repository, DTO, Entity)**

---

## 📦 Funcionalidades

- 🔍 Listagem de jogos
- 📂 Organização por listas (ex: favoritos, para jogar, jogados, etc.)
- 📑 Ordenação customizada dentro de listas
- 📬 Acesso aos dados via endpoints RESTful
- 🔄 Deploy contínuo automatizado (CI/CD via Railway)

---

## 🧪 Exemplos de Endpoints

- `GET /games` → Lista todos os jogos  
- `GET /games/{id}` → Detalhes de um jogo  
- `GET /lists` → Lista todas as listas de jogos  
- `GET /lists/{id}/games` → Jogos de uma lista específica  
- `POST /lists/{id}/replacement` → Reorganiza a posição dos jogos na lista  

---

## 🛠️ Como rodar localmente

### Pré-requisitos
- Docker + Docker Compose
- Java 21 (caso deseje rodar fora do container)

### Passos

```bash
# Clone o projeto
git clone https://github.com/andregnicoletti/spring-boot-dslist.git
cd spring-boot-dslist

# Suba o container com o banco de dados
docker-compose up -d

# Rode a aplicação (com sua IDE ou linha de comando)
./mvnw spring-boot:run
```

> A aplicação estará disponível em `http://localhost:8080`

---

## 🗃️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/nicoletti/dslist/
│   │       ├── controllers/      # Camada de entrada da API (REST Controllers)
│   │       ├── models/               
│   │       │   └── dto/              # Objetos de transferência de dados (Data Transfer Objects)
│   │       │   ├── entities/         # Entidades JPA
│   │       │   ├── mappers/          # Conversão com MapStruct
│   │       ├── repositories/     # Interfaces JPA
│   │       └── services/         # Regras de negócio
│   └── resources/
│       └── application.yml
```

---

## 📦 Deploy

- Utilizei a **Railway** para hospedagem gratuita e CI/CD.
- Ao dar `git push` na branch principal, a Railway automaticamente executa o build e publica a aplicação.

---

## 📸 Imagens da API em Produção

| Endpoint `/games` | Endpoint `/lists/1/games` |
|-------------------|---------------------------|
| ![Games](https://i.imgur.com/a1XHk6b.png) | ![List Games](https://i.imgur.com/a2XwHsE.png) |

---

## 💡 Sobre o Projeto

Este projeto foi construído para consolidar conhecimentos em:

- Criação de APIs RESTful com Spring Boot
- Boas práticas com JPA e DTOs
- Deploy automatizado com integração contínua
- Versionamento de código com Git

---

## 👨‍💻 Autor

**André Nicoletti**  
📫 [andregnicoletti@gmail.com](mailto:andregnicoletti@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/andre-nicoletti)  
🐙 [GitHub](https://github.com/andregnicoletti)

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

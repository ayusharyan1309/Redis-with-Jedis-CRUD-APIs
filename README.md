# Redis CRUD — Spring Data Redis

A **Spring Boot application** demonstrating **CRUD operations** on Redis using Spring Data Redis with Jedis. Stores and retrieves `Product` entities in Redis hash data structure.

## Features

- **Create** — Save products to Redis
- **Read** — Find all products or by ID
- **Update** — Overwrite existing products
- **Delete** — Remove products by ID
- **Redis Hash** — Uses Redis Hash (like a Map) for efficient key-value storage
- **Spring Data Redis** — Template-based Redis access

## Quick Start

```bash
git clone https://github.com/ayusharyan1309/redis-crud.git
cd redis-crud
mvn clean package -DskipTests

# Start Redis locally
redis-server

# Run the app
java -jar target/spring-data-redis-0.0.1-SNAPSHOT.jar
```

## Project Structure

```
├── pom.xml                                          # Maven + Spring Data Redis
├── src/main/java/.../
│   ├── SpringDataRedisApplication.java              # Entry point
│   ├── config/RedisConfig.java                      # Jedis + RedisTemplate config
│   ├── entity/Product.java                          # Product entity (@RedisHash)
│   └── repository/ProductDao.java                   # CRUD operations via RedisTemplate
└── src/main/resources/
    └── application.properties                       # Redis connection config
```

## Tech Stack

| Component | Technology |
|-----------|------------|
| **Framework** | Spring Boot 3.2.5 |
| **Cache** | Redis (Spring Data Redis) |
| **Client** | Jedis 5.1.2 |
| **Utilities** | Lombok |
| **Language** | Java 17 |

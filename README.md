📌 Employee Task Management System
📖 Project Overview

The Employee Task Management System is a Spring Boot-based RESTful web application designed to manage employee tasks efficiently.

It allows users to:

Create tasks

Update task details

Track task status

Delete completed tasks

The application uses MySQL for data persistence and is fully containerized using Docker and Docker Compose to ensure consistent and portable deployment.

🛠️ Tech Stack

Backend: Spring Boot

Database: MySQL

ORM: Spring Data JPA (Hibernate)

Build Tool: Maven

Containerization: Docker

Orchestration: Docker Compose

🏗️ Architecture Overview

The project follows a layered architecture:

Controller → Service → Repository → Database

Controller Layer – Handles REST API requests

Service Layer – Contains business logic

Repository Layer – Interacts with database using JPA

Database – Stores employee and task data

🚀 Features

Create new employee tasks

Update task status (Pending / In Progress / Completed)

Delete tasks

View all tasks

MySQL database integration

Dockerized application and database

🐳 Dockerized Setup

This project supports containerized deployment using Docker.

🔹 Multi-Stage Docker Build

Builds the Spring Boot JAR file inside Docker

Uses a lightweight Java runtime image for execution

Reduces final image size

🔹 Docker Compose Setup

Two services are configured:

MySQL Container

Spring Boot Application Container

Docker Compose ensures:

Automatic container networking

Environment-based configuration

Persistent database storage using volumes

⚙️ Running the Project
1️⃣ Clone the Repository
git clone <your-repo-url>
cd taskmanager
2️⃣ Build & Run with Docker

Clean previous containers:

docker compose down -v
docker system prune -a -f

Build and start containers:

docker compose up --build

Run in background:

docker compose up -d
3️⃣ Access the Application

Application runs on:

http://localhost:9090
🗄️ Database Configuration

For Docker environment:

spring.datasource.url=jdbc:mysql://mysql:3306/taskdb?allowPublicKeyRetrieval=true&useSSL=false

For local environment:

spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
📌 Key Learning Outcomes

Implemented REST APIs using Spring Boot

Integrated MySQL using Spring Data JPA

Applied multi-stage Docker build

Used Docker Compose for multi-container orchestration

Configured environment-based datasource settings

Understood container networking and volume persistence


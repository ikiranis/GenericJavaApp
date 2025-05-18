# Generic Java App Scaffold

This project is a generic scaffold for building modern Java applications using Spring Boot for the backend and Vue 3 for the frontend. It is designed to help you quickly start new projects with a robust, full-stack foundation.

## Features

- **Backend:** Java 17+, Spring Boot, RESTful API structure
- **Frontend:** Vue 3, TypeScript, Vite, Vue Router
- **Internationalization:** Language selection and multi-language support
- **Modular Structure:** Organized codebase for easy extension and maintenance
- **Sample Settings and Home Views**

---

## Project Structure

```
GenericJavaApp/
├── frontend/           # Vue 3 frontend app
│   ├── src/
│   ├── public/
│   └── ...
├── src/main/java/      # Java Spring Boot backend
│   └── ...
├── src/main/resources/ # Spring Boot resources
├── pom.xml             # Maven build file
└── ...
```

---

## Getting Started

### Prerequisites
- Java 17 or newer
- Maven
- Node.js (v16+ recommended)

### Backend (Spring Boot)

1. Navigate to the project root:
   ```sh
   cd /path/to/GenericJavaApp
   ```
2. Build and run the backend:
   ```sh
   ./mvnw spring-boot:run
   ```
   The backend will start on `http://localhost:9999` by default.

### Frontend (Vue 3)

1. Navigate to the frontend directory:
   ```sh
   cd frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the development server:
   ```sh
   npm run dev
   ```
   The frontend will be available at `http://localhost:8080` (or as indicated in the terminal).

---

## Customization
- **Backend:** Add your own controllers, services, and models under `src/main/java/...`
- **Frontend:** Add new views and components in `frontend/src/`
- **Internationalization:** Update language files in `src/main/resources/multiLanguage.xml` and frontend language store.

---

## License
This scaffold is provided as a starting point for your own projects. You may use, modify, and distribute it as needed.

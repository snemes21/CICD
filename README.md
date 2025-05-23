# Calculadora Java

Aplicación de calculadora simple en Java con integración continua y despliegue continuo (CI/CD) implementado a través de GitHub Actions.

## Funcionalidades

- Operaciones básicas (suma, resta, multiplicación y división)
- Operaciones avanzadas (potencia, raíz cuadrada, valor absoluto y módulo)
- Manejo adecuado de errores

## Requisitos

- Java JDK 17
- Maven 3.6+

## Compilación y Ejecución

Para compilar el proyecto:

```bash
mvn clean compile
```

Para ejecutar las pruebas:

```bash
mvn test
```

Para ejecutar la aplicación:

```bash
mvn exec:java -Dexec.mainClass="com.ads.Main"
```

## Análisis de Calidad

Para ejecutar el análisis de calidad con PMD:

```bash
mvn pmd:pmd
```

Para generar un informe de cobertura con JaCoCo:

```bash
mvn clean verify
```

## Flujos de trabajo de GitHub Actions

Este proyecto utiliza GitHub Actions para automatizar el proceso de integración y despliegue:

### 1. Maven Build (CI/CD)

- Archivo: `.github/workflows/maven-build.yml`
- Activación: Push a main/master, pull requests a main/master
- Funcionalidades:
  - Compilación del proyecto
  - Ejecución de pruebas
  - Creación de artefacto de aplicación

### 2. Code Quality

- Archivo: `.github/workflows/code-quality.yml`
- Activación: Push a main/master, pull requests a main/master, manual
- Funcionalidades:
  - Análisis estático de código con PMD
  - Generación de informes de cobertura con JaCoCo
  - Análisis de seguridad con CodeQL

## Estructura del Proyecto

```
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── ads/
│   │               ├── Calculator.java    # Implementación de la calculadora
│   │               └── Main.java          # Punto de entrada de la aplicación
│   └── test/
│       └── java/
│           └── com/
│               └── ads/
│                   └── CalculatorTest.java # Pruebas unitarias
├── .github/
│   └── workflows/
│       ├── maven-build.yml               # Workflow de CI/CD
│       └── code-quality.yml              # Workflow de análisis de código
├── .gitignore
├── pom.xml                               # Configuración de Maven
└── README.md                             # Este archivo
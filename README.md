# Java + Selenium + Cucumber Automation Framework (Mac M1 ready)

This is a full-featured automation framework scaffold built with:
- Java (OpenJDK 17 recommended)
- Maven
- Selenium 4.x
- Cucumber JVM 7.x
- Rest-Assured for API testing
- Axe for accessibility checks
- Allure reports
- H2 embedded DB for sample DB tests
- k6 script for performance testing
- OWASP ZAP baseline scan via Docker for security testing
- Docker + docker-compose for Selenium Grid (multi-arch ready)
- GitHub Actions CI and Jenkinsfile for pipeline
- Designed with strict OOP and Page Object Model principles

## What is included
- `src/main/java` : framework core (drivers, utils, config)
- `src/test/java` : sample tests, step definitions, hooks
- `src/test/resources/features` : Cucumber feature files
- `pom.xml` : Maven project with dependencies
- `docker-compose.yml` : start selenium and zap
- `Dockerfile` : containerize test runner (arm64 compatible)
- `jenkins/Jenkinsfile` : sample Jenkins pipeline
- `.github/workflows/maven-ci.yml` : GitHub Actions pipeline
- `k6/` : performance test script
- `zap/` : helper scripts to run OWASP ZAP baseline
- `allure/` : example allure config
- `sql/` : sample H2 init SQL

## How to run (Mac M1 - quick start)
1. Install Homebrew (if not already): `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`
2. Install Java 17 and Maven:
   ```bash
   brew install openjdk@17
   brew install maven
   sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
   export PATH="/opt/homebrew/bin:$PATH"
   ```
3. Install Chrome and ChromeDriver (Homebrew Cask):
   ```bash
   brew install --cask google-chrome
   brew install --cask chromedriver
   ```
4. Start Docker and run docker-compose if you want a containerized Selenium Grid and ZAP:
   ```bash
   docker compose up -d
   ```
5. Run tests via Maven (example):
   ```bash
   mvn clean test -Denv=qa
   ```
6. Generate Allure report:
   ```bash
   mvn allure:serve
   ```

Detailed instructions inside `docs/INSTALL.md` and inline in code comments.



Build status: ![CI](https://github.com/<your-org>/<your-repo>/actions/workflows/maven-ci.yml/badge.svg)

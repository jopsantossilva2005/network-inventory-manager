# ADR-0001: Use Spring Boot as the Application Framework

## Status

Accepted

## Context

The project needs to provide a structured Java application for network inventory auditing, automation, and future integrations with tools such as NetBox.

The application should be easy to extend, test, document, and run in different environments.

## Decision

We will use Spring Boot as the main application framework.

## Reasons

Spring Boot was chosen because:

- It is widely used in enterprise Java applications
- It simplifies project configuration
- It provides dependency injection
- It supports REST APIs
- It integrates well with testing tools
- It can be packaged and deployed easily
- It is useful for both backend development and infrastructure automation projects

## Alternatives considered

### Plain Java

Plain Java would provide more control, but would require more manual configuration and more boilerplate code.

### Other frameworks

Frameworks such as Quarkus and Micronaut are good alternatives, but Spring Boot has broader market adoption and more learning resources.

## Consequences

Using Spring Boot allows the project to grow into a modular backend application.

The project will also require the developer to understand Spring concepts such as:

- Dependency Injection
- Beans
- Controllers
- Services
- Configuration
- Testing with Spring Boot
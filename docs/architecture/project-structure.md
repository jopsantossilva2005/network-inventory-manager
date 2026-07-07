# Project Structure

This document explains the initial structure of the Network Inventory Manager project.

## Root files

### pom.xml

The `pom.xml` file is the main Maven configuration file.

It defines:

- Project metadata
- Java version
- Dependencies
- Build plugins
- Spring Boot configuration

### mvnw and mvnw.cmd

These files are part of the Maven Wrapper.

They allow the project to be built without requiring Maven to be manually installed.

Use `mvnw` on Linux/macOS and `mvnw.cmd` on Windows.

### .mvn

This directory contains Maven Wrapper configuration.

### README.md

The main documentation file shown on the GitHub repository page.

### LICENSE

Defines how other people can use this project.

## Source code structure

### src/main/java

Contains the main application code.

Current base package:

```text
io.github.jopsantossilva2005.networkinventorymanager
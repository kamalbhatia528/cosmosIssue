## Micronaut 3.8.7 Documentation

- [User Guide](https://docs.micronaut.io/3.8.7/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.7/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.7/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

# Micronaut and Azure Function

## Prerequisites

- Latest [Function Core Tools](https://aka.ms/azfunc-install)
- [Azure CLI](https://docs.microsoft.com/en-us/cli/azure/)

## Setup

```cmd
az login
az account set -s <your subscription id>

## Build Tools

The application's build uses [Azure Functions Plugin for Gradle](https://plugins.gradle.org/plugin/com.microsoft.azure.azurefunctions).
## Running the function locally

```cmd
./gradlew clean azureFunctionsRun
```

And visit http://localhost:7071/api/cosmosIssue

## Deploying the function

To deploy the function run:

```bash
$ ./gradlew clean azureFunctionsDeploy
```



- [Azure Functions Plugin for Gradle](https://plugins.gradle.org/plugin/com.microsoft.azure.azurefunctions)
- [Azure Functions Plugin for Gradle](https://plugins.gradle.org/plugin/com.microsoft.azure.azurefunctions)
## Feature azure-function documentation

- [Micronaut Azure Function documentation](https://micronaut-projects.github.io/micronaut-azure/latest/guide/index.html#simpleAzureFunctions)

- [https://docs.microsoft.com/azure](https://docs.microsoft.com/azure)


## Feature azure-function-http documentation

- [Micronaut Azure Function documentation](https://micronaut-projects.github.io/micronaut-azure/latest/guide/index.html#azureHttpFunctions)


## Feature azure-cosmos-db documentation

- [Micronaut Azure Cosmos DB documentation](https://micronaut-projects.github.io/micronaut-azure/latest/guide/#azureCosmosClient)

- [https://learn.microsoft.com/en-us/azure/cosmos-db/](https://learn.microsoft.com/en-us/azure/cosmos-db/)



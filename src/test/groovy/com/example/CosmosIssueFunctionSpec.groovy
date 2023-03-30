package com.example;
import com.microsoft.azure.functions.HttpStatus
import io.micronaut.azure.function.http.HttpRequestMessageBuilder
import io.micronaut.http.HttpMethod
import spock.lang.*

class CosmosIssueFunctionSpec extends Specification {

    @Shared @AutoCleanup
    Function function = new Function()

    void "test function"() {
        when:"The function is executed"
        HttpRequestMessageBuilder.AzureHttpResponseMessage response =
            function.request(HttpMethod.GET, "/cosmosIssue")
                    .invoke()


        then:"The response is correct"
        response.status == HttpStatus.OK
    }
}

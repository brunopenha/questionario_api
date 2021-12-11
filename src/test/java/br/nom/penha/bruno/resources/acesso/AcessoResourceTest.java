package br.nom.penha.bruno.resources.acesso;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class AcessoResourceTest {

    @Test
    public void testAcessoEndpoint() {
        given()
                .when().post("/acesso")
                .then()
                .statusCode(200)
                .body(is(""));
    }

}
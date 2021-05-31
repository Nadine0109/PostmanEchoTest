import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTesting {

    @Test
    public void shouldCheckPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("I write this to check it works") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("I write this to check it works"));
    }
}

package hometest.qa.productsinfo;

import hometest.qa.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductGetTest extends TestBase {

    @Test
    public void getAllProducts() {
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleProduct() {
        Response response = given()
                .pathParams("id", 1)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

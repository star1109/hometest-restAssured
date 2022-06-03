package hometest.qa.productsinfo;

import hometest.qa.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductDeleteTest extends TestBase {

    @Test
    public void productDelete()
    {
        Response response = given()
                .pathParam("id",1)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

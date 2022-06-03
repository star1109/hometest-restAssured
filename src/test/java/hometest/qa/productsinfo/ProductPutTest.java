package hometest.qa.productsinfo;

import hometest.qa.model.ProductPojo;
import hometest.qa.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPutTest extends TestBase {

    @Test
    public void updateProduct()
    {

        ProductPojo productPojo = new ProductPojo();
        productPojo.setAvailable(500);
        productPojo.setName("moon");


       Response response =  given()
               .header("Content-Type","application/json")
                .pathParam("id",3)
               .body(productPojo)
                .when()
                .put("/products/{id}");
       response.then().statusCode(200);
       response.prettyPrint();


    }
}

package hometest.qa.productsinfo;

import hometest.qa.model.ProductPojo;
import hometest.qa.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPostTest extends TestBase {



    @Test
    public void postLoginCredentials()
    {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setUsername("alice");
        productPojo.setPassword("a37d3106168770fa4477903703c548c7010ea570");

        Response response =  given()
                .header("Content-Type","application/json")
                .body(productPojo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void createNewProduct()
    {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("jam");
        productPojo.setAvailable(30);

     Response response =    given()
                .header("Content-Type","application/json")
                .body(productPojo)
                .when()
                .post("/products");
     response.then().statusCode(201);
     response.prettyPrint();


    }
}

package com.herokuapp.booker_restful.bookinginfo;

import com.herokuapp.booker_restful.model.BookingPojo;
import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateAuthTokenTest extends TestBase {

    @Test
    public void createAuth() {
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setUsername("admin");
        bookingPojo.setPassword("password123");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(bookingPojo)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}

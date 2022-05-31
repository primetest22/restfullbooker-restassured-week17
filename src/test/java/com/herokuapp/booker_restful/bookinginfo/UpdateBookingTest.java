package com.herokuapp.booker_restful.bookinginfo;

import com.herokuapp.booker_restful.model.BookingPojo;
import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateBookingTest extends TestBase {

    @Test
    public void updateBookingByID() {


        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Roger");
        bookingPojo.setLastname("Federer");
        bookingPojo.setTotalprice(300);
        bookingPojo.setDepositpaid(false);
        bookingPojo.setAdditionalneeds("N/A");

        Response response = given()
                .header("Content-Type", "application/json")
                .auth().preemptive().basic("admin","password123")
                .body(bookingPojo)
                .when()
                .put("/2090");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}

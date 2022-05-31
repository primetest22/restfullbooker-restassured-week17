package com.herokuapp.booker_restful.bookinginfo;

import com.herokuapp.booker_restful.model.BookingPojo;
import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GetBookingIdTest extends TestBase {

    @Test
    public void createNewBooking() {

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Roger");
        bookingPojo.setLastname("Federer");
        bookingPojo.setTotalprice(145);
        bookingPojo.setDepositpaid(true);
        bookingPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}

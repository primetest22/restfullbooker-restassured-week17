package com.herokuapp.booker_restful.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBase {

       @BeforeClass
       public static void inIt(){

              RestAssured.baseURI = "https://restful-booker.herokuapp.com";

       }

}

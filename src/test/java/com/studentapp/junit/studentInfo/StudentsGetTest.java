package com.studentapp.junit.studentInfo;

import com.studentapp.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

/**
 * Created by Jay
 */
//@RunWith(SerenityRunner.class)
public class StudentsGetTest extends TestBase {


    @Test
    public void getAllStudents() {
        SerenityRest.rest()
                .given()
                .when()
                .get("/list")
                .then()
                .statusCode(200);
    }

    @Test
    public void test01() {

    }

}

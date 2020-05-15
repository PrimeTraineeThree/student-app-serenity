package com.studentapp.studentinfo;

import net.thucydides.core.annotations.Title;
import org.junit.Test;

/**
 * Created by Jay
 */
public class TagsTest {

    @Title("Provide a 405 status code when incorrect HTTP method is used to access a resource")
    @Test
    public void inValidMethod() {

    }

    @Test
    @Title("This test will verify if a status code of 200 is returned for GET request")
    public void verifyIfTheStatusCodeIs200() {

    }

    @Title("This test will provide an error code of 400 when user tries to access an invalid resource")
    @Test
    public void incorrectResource() {

    }

}

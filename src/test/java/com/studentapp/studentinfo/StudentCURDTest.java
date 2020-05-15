package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

/**
 * Created by Jay
 */
public class StudentCURDTest extends TestBase {


    @Test
    public void test01() {

    }

    @Test
    public void test02() {
        String p1 = "findAll{it.firstName=='";
        String p2 = "'}.get(0)";

    }

    @Title("Update the user information and verify the updated information")
    @Test
    public void test03() {

        String p1 = "findAll{it.firstName=='";
        String p2 = "'}.get(0)";


    }

    @Title("Delete the student and verify if the student is deleted!")
    @Test
    public void test04() {

    }
}

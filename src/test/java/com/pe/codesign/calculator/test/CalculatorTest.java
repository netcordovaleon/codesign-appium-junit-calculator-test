package com.pe.codesign.calculator.test;

import com.pe.codesign.calculator.constants.SelectorsConstants;
import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CalculatorTest extends BaseTest {

    @Test
    public void test_add_operator(){
        driver.findElement(MobileBy.id(SelectorsConstants.NUMBER_1)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.OPERATION_ADD)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.NUMBER_3)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.EQUALS)).click();
        WebElement sumOfNumbersEle = driver.findElement(MobileBy.id(SelectorsConstants.SECTION_FORMULA));
        String sumOfNumbers = sumOfNumbersEle.getText();
        Assert.assertTrue(sumOfNumbers.endsWith("4"));
    }

    @Test
    public void test_mul_operator(){
        driver.findElement(MobileBy.id(SelectorsConstants.NUMBER_5)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.OPERATION_MUL)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.NUMBER_5)).click();
        driver.findElement(MobileBy.id(SelectorsConstants.EQUALS)).click();
        WebElement sumOfNumbersEle = driver.findElement(MobileBy.id(SelectorsConstants.SECTION_FORMULA));
        String sumOfNumbers = sumOfNumbersEle.getText();
        Assert.assertTrue(sumOfNumbers.endsWith("25"));
    }
}

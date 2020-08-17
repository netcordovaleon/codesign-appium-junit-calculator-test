package com.pe.codesign.calculator.test;

import com.pe.codesign.calculator.constants.ApkConstants;
import com.pe.codesign.calculator.constants.DeviceConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AppiumDriver<MobileElement> driver;

    @BeforeClass
    public static void initial(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, DeviceConstants.PLATFORM_NAME);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, DeviceConstants.PLATFORM_VERSION);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceConstants.DEVICE_NAME);
        caps.setCapability(MobileCapabilityType.UDID, DeviceConstants.UDID);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ApkConstants.APP_PACKAGE);
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ApkConstants.APP_ACTIVITY);
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        }catch (Exception exp) {
            System.out.println("CAUSE: " + exp.getCause());
            System.out.println("MESSAGE: " + exp.getMessage());
        }
    }

    @AfterClass
    public static void finish() {
        driver.quit();
    }
}

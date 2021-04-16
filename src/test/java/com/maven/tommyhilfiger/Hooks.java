package com.maven.tommyhilfiger;

import com.maven.tommyhilfiger.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    DriverFactory  driverFactory = new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser("firefox");
        driverFactory.getUrl("https://uk.tommy.com/");
        driverFactory.maximize();
        driverFactory.timeOut();
        driverFactory.delAllCookies();

    }
    @After
    public void tearDown(){
      //  driverFactory.close();
    }
}

package com.qtpselenium.demo4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebDriverEventListnerDemo2 extends AbstractWebDriverEventListener
{
    public void beforeNavigateBack(WebDriver driver)
    {
    	System.out.println("Hello.....");
    }
}

package com.demoblaze.automation.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUserPage {
    public static String URL = "https://www.demoblaze.com/";
    public static final Target SING_UP_OPTION = Target.the("").located(By.xpath("//*[@id='signin2']"));
    public static final Target SING_USERNAME = Target.the("").located(By.xpath("//*[@id='sign-username']"));
    public static final Target SING_PASSWORD = Target.the("").located(By.xpath("//*[@id='sign-password']"));
    public static final Target SING_UP_BUTTON = Target.the("").located(By.xpath("//button[@onclick='register()']"));
}

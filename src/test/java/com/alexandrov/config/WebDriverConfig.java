package com.alexandrov.config;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseURL")
    @DefaultValue("https://github.com")
    String getBaseURL();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();
}

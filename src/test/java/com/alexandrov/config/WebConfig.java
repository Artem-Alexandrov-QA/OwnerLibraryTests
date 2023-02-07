package com.alexandrov.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${env}.properties")
public interface WebConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String browserName();

    @Key("browser.version")
    @DefaultValue("95")
    String browserVersion();

    @Key("selenoid.url")
    String remoteUrl();
}

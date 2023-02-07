package com.alexandrov;

import com.alexandrov.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {

    @Test
    void testMobile() {

        MobileConfig config = ConfigFactory.create(MobileConfig.class,System.getProperties());

        assertThat(config.getDeviceName()).isEqualTo("iPhone 12 Pro Max");
        assertThat(config.getPlatformName()).isEqualTo("iOS");
        assertThat(config.getPlatformVersion()).isEqualTo(11);
    }

    @Test
    void testIphone() {

        System.setProperty("device","iphone");

        MobileConfig config = ConfigFactory.create(MobileConfig.class,System.getProperties());

        assertThat(config.getDeviceName()).isEqualTo("iPhone 12 Pro Max");
        assertThat(config.getPlatformName()).isEqualTo("iOS");
        assertThat(config.getPlatformVersion()).isEqualTo(11);
    }

    @Test
    void testMobileAndroid() {

        System.setProperty("device","google-pixel");

        MobileConfig config = ConfigFactory.create(MobileConfig.class,System.getProperties());

        assertThat(config.getDeviceName()).isEqualTo("Google Pixel XL");
        assertThat(config.getPlatformName()).isEqualTo("Android");
        assertThat(config.getPlatformVersion()).isEqualTo(17);
    }
}

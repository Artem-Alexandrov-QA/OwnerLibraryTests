package com.alexandrov;

import com.alexandrov.config.Browser;
import com.alexandrov.config.TypeConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TypeTest {

    @Test
    void testInteger() {
        System.setProperty("integer","66");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(66);
    }

    @Test
    void testDouble() {
        System.setProperty("double","34.55");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(34.55);
    }

    @Test
    void testBoolean() {
        System.setProperty("boolean","false");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);
    }

    @Test
    void testBrowser() {
        System.setProperty("browser","FIREFOX");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBrowser()).isEqualTo(Browser.FIREFOX);
    }
}

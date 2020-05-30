package config;

import org.aeonbits.owner.ConfigFactory;

public class CustomConfiguration {
    public static CommonConfig getCommon() {
        return ConfigFactory.create(CommonConfig.class);
    }
}

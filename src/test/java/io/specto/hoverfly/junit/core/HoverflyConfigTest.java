package io.specto.hoverfly.junit.core;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HoverflyConfigTest {


    @Test
    public void shouldHaveDefaultSettings() throws Exception {
        HoverflyConfig configs = HoverflyConfig.configs();

        assertThat(configs.getAdminPort()).isEqualTo(0);
        assertThat(configs.getProxyPort()).isEqualTo(0);
        assertThat(configs.getRemoteHost()).isNull();
        assertThat(configs.getSslCertificatePath()).isNull();
        assertThat(configs.getSslKeyPath()).isNull();

        assertThat(configs.isRemoteInstance()).isFalse();
        assertThat(configs.isProxyLocalHost()).isFalse();
    }

}
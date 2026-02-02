package com.rest.webservices.restfulwebservices.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

import static java.lang.System.getProperty;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public final class TlsConfigurer {
    private static final Logger LOG = LoggerFactory.getLogger(TlsConfigurer.class);

    private static final String TRUST_STORE_FILE = "/MPTruststore/truststore.jks";
    // default password, use another one
    private static final String TRUST_STORE_PASSWORD = "changeit";


    public static void setupTruststore() {
        var trustStore = createTmpFile("Truststore");
        try (var source = TlsConfigurer.class.getResourceAsStream(TRUST_STORE_FILE)) {
            Files.copy(source, trustStore.toPath(), REPLACE_EXISTING);
        } catch (IOException e) {
            throw new IllegalStateException("Truststore: Could not bootstrap truststore " + trustStore + " : could not copy data", e);
        }

        LOG.info("Truststore: Setup trust store: porperty javax.net.ssl.trustStore={} (was {})", trustStore, getProperty("javax.net.ssl.trustStore"));
        System.setProperty("javax.net.ssl.trustStore", trustStore.getPath());
        LOG.info("Truststore: Setup trust store: porperty javax.net.ssl.trustStorePassword={} (was {})",
                TRUST_STORE_PASSWORD.length(),
                Objects.toString(getProperty("javax.net.ssl.trustStorePassword"), "").length());
        System.setProperty("javax.net.ssl.trustStorePassword", TRUST_STORE_PASSWORD);
    }

    private static File createTmpFile(String name) {
        try {
            var file = File.createTempFile(name + "-", ".jks");
            file.deleteOnExit();
            LOG.info("{}: tmp file created: {}", name, file);
            return file;
        } catch (IOException e) {
            throw new IllegalStateException("Keystore: Could not bootstrap keystore " + name + " : could not create tmp file", e);
        }
    }

    private TlsConfigurer() {
        // hide
    }
}

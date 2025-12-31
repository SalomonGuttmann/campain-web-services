package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final Wsdl4jLibraryAccessors laccForWsdl4jLibraryAccessors = new Wsdl4jLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jakarta
     */
    public JakartaLibraryAccessors getJakarta() {
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Returns the group of libraries at org
     */
    public OrgLibraryAccessors getOrg() {
        return laccForOrgLibraryAccessors;
    }

    /**
     * Returns the group of libraries at wsdl4j
     */
    public Wsdl4jLibraryAccessors getWsdl4j() {
        return laccForWsdl4jLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlLibraryAccessors laccForComFasterxmlLibraryAccessors = new ComFasterxmlLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml
         */
        public ComFasterxmlLibraryAccessors getFasterxml() {
            return laccForComFasterxmlLibraryAccessors;
        }

    }

    public static class ComFasterxmlLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonLibraryAccessors laccForComFasterxmlJacksonLibraryAccessors = new ComFasterxmlJacksonLibraryAccessors(owner);

        public ComFasterxmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson
         */
        public ComFasterxmlJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatLibraryAccessors(owner);

        public ComFasterxmlJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.dataformat
         */
        public ComFasterxmlJacksonDataformatLibraryAccessors getDataformat() {
            return laccForComFasterxmlJacksonDataformatLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.dataformat.jackson
         */
        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.dataformat.jackson.dataformat
         */
        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors getDataformat() {
            return laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xml (com.fasterxml.jackson.dataformat:jackson-dataformat-xml)
         * with versionRef 'com.fasterxml.jackson.dataformat.jackson.dataformat.xml'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getXml() {
                return create("com.fasterxml.jackson.dataformat.jackson.dataformat.xml");
        }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlLibraryAccessors laccForJakartaXmlLibraryAccessors = new JakartaXmlLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.xml
         */
        public JakartaXmlLibraryAccessors getXml() {
            return laccForJakartaXmlLibraryAccessors;
        }

    }

    public static class JakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindLibraryAccessors laccForJakartaXmlBindLibraryAccessors = new JakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.xml.bind
         */
        public JakartaXmlBindLibraryAccessors getBind() {
            return laccForJakartaXmlBindLibraryAccessors;
        }

    }

    public static class JakartaXmlBindLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaLibraryAccessors laccForJakartaXmlBindJakartaLibraryAccessors = new JakartaXmlBindJakartaLibraryAccessors(owner);

        public JakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.xml.bind.jakarta
         */
        public JakartaXmlBindJakartaLibraryAccessors getJakarta() {
            return laccForJakartaXmlBindJakartaLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlLibraryAccessors laccForJakartaXmlBindJakartaXmlLibraryAccessors = new JakartaXmlBindJakartaXmlLibraryAccessors(owner);

        public JakartaXmlBindJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.xml.bind.jakarta.xml
         */
        public JakartaXmlBindJakartaXmlLibraryAccessors getXml() {
            return laccForJakartaXmlBindJakartaXmlLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlBindLibraryAccessors laccForJakartaXmlBindJakartaXmlBindLibraryAccessors = new JakartaXmlBindJakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlBindJakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.xml.bind.jakarta.xml.bind
         */
        public JakartaXmlBindJakartaXmlBindLibraryAccessors getBind() {
            return laccForJakartaXmlBindJakartaXmlBindLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlBindLibraryAccessors extends SubDependencyFactory {

        public JakartaXmlBindJakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.xml.bind:jakarta.xml.bind-api)
         * with versionRef 'jakarta.xml.bind.jakarta.xml.bind.api'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("jakarta.xml.bind.jakarta.xml.bind.api");
        }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgGlassfishLibraryAccessors laccForOrgGlassfishLibraryAccessors = new OrgGlassfishLibraryAccessors(owner);
        private final OrgJunitLibraryAccessors laccForOrgJunitLibraryAccessors = new OrgJunitLibraryAccessors(owner);
        private final OrgPostgresqlLibraryAccessors laccForOrgPostgresqlLibraryAccessors = new OrgPostgresqlLibraryAccessors(owner);
        private final OrgSpringframeworkLibraryAccessors laccForOrgSpringframeworkLibraryAccessors = new OrgSpringframeworkLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.glassfish
         */
        public OrgGlassfishLibraryAccessors getGlassfish() {
            return laccForOrgGlassfishLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.junit
         */
        public OrgJunitLibraryAccessors getJunit() {
            return laccForOrgJunitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.postgresql
         */
        public OrgPostgresqlLibraryAccessors getPostgresql() {
            return laccForOrgPostgresqlLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework
         */
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            return laccForOrgSpringframeworkLibraryAccessors;
        }

    }

    public static class OrgGlassfishLibraryAccessors extends SubDependencyFactory {
        private final OrgGlassfishJaxbLibraryAccessors laccForOrgGlassfishJaxbLibraryAccessors = new OrgGlassfishJaxbLibraryAccessors(owner);

        public OrgGlassfishLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.glassfish.jaxb
         */
        public OrgGlassfishJaxbLibraryAccessors getJaxb() {
            return laccForOrgGlassfishJaxbLibraryAccessors;
        }

    }

    public static class OrgGlassfishJaxbLibraryAccessors extends SubDependencyFactory {
        private final OrgGlassfishJaxbJaxbLibraryAccessors laccForOrgGlassfishJaxbJaxbLibraryAccessors = new OrgGlassfishJaxbJaxbLibraryAccessors(owner);

        public OrgGlassfishJaxbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.glassfish.jaxb.jaxb
         */
        public OrgGlassfishJaxbJaxbLibraryAccessors getJaxb() {
            return laccForOrgGlassfishJaxbJaxbLibraryAccessors;
        }

    }

    public static class OrgGlassfishJaxbJaxbLibraryAccessors extends SubDependencyFactory {

        public OrgGlassfishJaxbJaxbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (org.glassfish.jaxb:jaxb-runtime)
         * with versionRef 'org.glassfish.jaxb.jaxb.runtime'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("org.glassfish.jaxb.jaxb.runtime");
        }

    }

    public static class OrgJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterLibraryAccessors laccForOrgJunitJupiterLibraryAccessors = new OrgJunitJupiterLibraryAccessors(owner);

        public OrgJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.junit.jupiter
         */
        public OrgJunitJupiterLibraryAccessors getJupiter() {
            return laccForOrgJunitJupiterLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitLibraryAccessors laccForOrgJunitJupiterJunitLibraryAccessors = new OrgJunitJupiterJunitLibraryAccessors(owner);

        public OrgJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.junit.jupiter.junit
         */
        public OrgJunitJupiterJunitLibraryAccessors getJunit() {
            return laccForOrgJunitJupiterJunitLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitJupiterLibraryAccessors laccForOrgJunitJupiterJunitJupiterLibraryAccessors = new OrgJunitJupiterJunitJupiterLibraryAccessors(owner);

        public OrgJunitJupiterJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.junit.jupiter.junit.jupiter
         */
        public OrgJunitJupiterJunitJupiterLibraryAccessors getJupiter() {
            return laccForOrgJunitJupiterJunitJupiterLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterJunitJupiterLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJupiterJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.jupiter:junit-jupiter-api)
         * with versionRef 'org.junit.jupiter.junit.jupiter.api'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("org.junit.jupiter.junit.jupiter.api");
        }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
         * with versionRef 'org.junit.jupiter.junit.jupiter.engine'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("org.junit.jupiter.junit.jupiter.engine");
        }

    }

    public static class OrgPostgresqlLibraryAccessors extends SubDependencyFactory {

        public OrgPostgresqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for postgresql (org.postgresql:postgresql)
         * with versionRef 'org.postgresql.postgresql'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPostgresql() {
                return create("org.postgresql.postgresql");
        }

    }

    public static class OrgSpringframeworkLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootLibraryAccessors laccForOrgSpringframeworkBootLibraryAccessors = new OrgSpringframeworkBootLibraryAccessors(owner);
        private final OrgSpringframeworkDataLibraryAccessors laccForOrgSpringframeworkDataLibraryAccessors = new OrgSpringframeworkDataLibraryAccessors(owner);
        private final OrgSpringframeworkWsLibraryAccessors laccForOrgSpringframeworkWsLibraryAccessors = new OrgSpringframeworkWsLibraryAccessors(owner);

        public OrgSpringframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot
         */
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.data
         */
        public OrgSpringframeworkDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.ws
         */
        public OrgSpringframeworkWsLibraryAccessors getWs() {
            return laccForOrgSpringframeworkWsLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring
         */
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot
         */
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootStarterLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for devtools (org.springframework.boot:spring-boot-devtools)
         * with versionRef 'org.springframework.boot.spring.boot.devtools'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDevtools() {
                return create("org.springframework.boot.spring.boot.devtools");
        }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot.starter
         */
        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors getStarter() {
            return laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hateoas (org.springframework.boot:spring-boot-starter-hateoas)
         * with versionRef 'org.springframework.boot.spring.boot.starter.hateoas'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHateoas() {
                return create("org.springframework.boot.spring.boot.starter.hateoas");
        }

            /**
             * Creates a dependency provider for test (org.springframework.boot:spring-boot-starter-test)
         * with versionRef 'org.springframework.boot.spring.boot.starter.test'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("org.springframework.boot.spring.boot.starter.test");
        }

            /**
             * Creates a dependency provider for validation (org.springframework.boot:spring-boot-starter-validation)
         * with versionRef 'org.springframework.boot.spring.boot.starter.validation'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getValidation() {
                return create("org.springframework.boot.spring.boot.starter.validation");
        }

            /**
             * Creates a dependency provider for web (org.springframework.boot:spring-boot-starter-web)
         * with versionRef 'org.springframework.boot.spring.boot.starter.web'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWeb() {
                return create("org.springframework.boot.spring.boot.starter.web");
        }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot.starter.data
         */
        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jpa (org.springframework.boot:spring-boot-starter-data-jpa)
         * with versionRef 'org.springframework.boot.spring.boot.starter.data.jpa'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJpa() {
                return create("org.springframework.boot.spring.boot.starter.data.jpa");
        }

    }

    public static class OrgSpringframeworkDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringLibraryAccessors laccForOrgSpringframeworkDataSpringLibraryAccessors = new OrgSpringframeworkDataSpringLibraryAccessors(owner);

        public OrgSpringframeworkDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring
         */
        public OrgSpringframeworkDataSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkDataSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataLibraryAccessors laccForOrgSpringframeworkDataSpringDataLibraryAccessors = new OrgSpringframeworkDataSpringDataLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring.data
         */
        public OrgSpringframeworkDataSpringDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataSpringDataLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataRestLibraryAccessors laccForOrgSpringframeworkDataSpringDataRestLibraryAccessors = new OrgSpringframeworkDataSpringDataRestLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring.data.rest
         */
        public OrgSpringframeworkDataSpringDataRestLibraryAccessors getRest() {
            return laccForOrgSpringframeworkDataSpringDataRestLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataRestLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataRestHalLibraryAccessors laccForOrgSpringframeworkDataSpringDataRestHalLibraryAccessors = new OrgSpringframeworkDataSpringDataRestHalLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringDataRestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring.data.rest.hal
         */
        public OrgSpringframeworkDataSpringDataRestHalLibraryAccessors getHal() {
            return laccForOrgSpringframeworkDataSpringDataRestHalLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataRestHalLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkDataSpringDataRestHalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for explorer (org.springframework.data:spring-data-rest-hal-explorer)
         * with versionRef 'org.springframework.data.spring.data.rest.hal.explorer'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExplorer() {
                return create("org.springframework.data.spring.data.rest.hal.explorer");
        }

    }

    public static class OrgSpringframeworkWsLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkWsSpringLibraryAccessors laccForOrgSpringframeworkWsSpringLibraryAccessors = new OrgSpringframeworkWsSpringLibraryAccessors(owner);

        public OrgSpringframeworkWsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.ws.spring
         */
        public OrgSpringframeworkWsSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkWsSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkWsSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkWsSpringWsLibraryAccessors laccForOrgSpringframeworkWsSpringWsLibraryAccessors = new OrgSpringframeworkWsSpringWsLibraryAccessors(owner);

        public OrgSpringframeworkWsSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.ws.spring.ws
         */
        public OrgSpringframeworkWsSpringWsLibraryAccessors getWs() {
            return laccForOrgSpringframeworkWsSpringWsLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkWsSpringWsLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkWsSpringWsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.springframework.ws:spring-ws-core)
         * with versionRef 'org.springframework.ws.spring.ws.core'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("org.springframework.ws.spring.ws.core");
        }

    }

    public static class Wsdl4jLibraryAccessors extends SubDependencyFactory {

        public Wsdl4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for wsdl4j (wsdl4j:wsdl4j)
         * with versionRef 'wsdl4j.wsdl4j'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWsdl4j() {
                return create("wsdl4j.wsdl4j");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        private final Wsdl4jVersionAccessors vaccForWsdl4jVersionAccessors = new Wsdl4jVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.jakarta
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.wsdl4j
         */
        public Wsdl4jVersionAccessors getWsdl4j() {
            return vaccForWsdl4jVersionAccessors;
        }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComFasterxmlVersionAccessors vaccForComFasterxmlVersionAccessors = new ComFasterxmlVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.fasterxml
         */
        public ComFasterxmlVersionAccessors getFasterxml() {
            return vaccForComFasterxmlVersionAccessors;
        }

    }

    public static class ComFasterxmlVersionAccessors extends VersionFactory  {

        private final ComFasterxmlJacksonVersionAccessors vaccForComFasterxmlJacksonVersionAccessors = new ComFasterxmlJacksonVersionAccessors(providers, config);
        public ComFasterxmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.fasterxml.jackson
         */
        public ComFasterxmlJacksonVersionAccessors getJackson() {
            return vaccForComFasterxmlJacksonVersionAccessors;
        }

    }

    public static class ComFasterxmlJacksonVersionAccessors extends VersionFactory  {

        private final ComFasterxmlJacksonDataformatVersionAccessors vaccForComFasterxmlJacksonDataformatVersionAccessors = new ComFasterxmlJacksonDataformatVersionAccessors(providers, config);
        public ComFasterxmlJacksonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.fasterxml.jackson.dataformat
         */
        public ComFasterxmlJacksonDataformatVersionAccessors getDataformat() {
            return vaccForComFasterxmlJacksonDataformatVersionAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatVersionAccessors extends VersionFactory  {

        private final ComFasterxmlJacksonDataformatJacksonVersionAccessors vaccForComFasterxmlJacksonDataformatJacksonVersionAccessors = new ComFasterxmlJacksonDataformatJacksonVersionAccessors(providers, config);
        public ComFasterxmlJacksonDataformatVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.fasterxml.jackson.dataformat.jackson
         */
        public ComFasterxmlJacksonDataformatJacksonVersionAccessors getJackson() {
            return vaccForComFasterxmlJacksonDataformatJacksonVersionAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonVersionAccessors extends VersionFactory  {

        private final ComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors vaccForComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors = new ComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors(providers, config);
        public ComFasterxmlJacksonDataformatJacksonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.fasterxml.jackson.dataformat.jackson.dataformat
         */
        public ComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors getDataformat() {
            return vaccForComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors extends VersionFactory  {

        public ComFasterxmlJacksonDataformatJacksonDataformatVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.fasterxml.jackson.dataformat.jackson.dataformat.xml (2.18.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getXml() { return getVersion("com.fasterxml.jackson.dataformat.jackson.dataformat.xml"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        private final JakartaXmlVersionAccessors vaccForJakartaXmlVersionAccessors = new JakartaXmlVersionAccessors(providers, config);
        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.xml
         */
        public JakartaXmlVersionAccessors getXml() {
            return vaccForJakartaXmlVersionAccessors;
        }

    }

    public static class JakartaXmlVersionAccessors extends VersionFactory  {

        private final JakartaXmlBindVersionAccessors vaccForJakartaXmlBindVersionAccessors = new JakartaXmlBindVersionAccessors(providers, config);
        public JakartaXmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.xml.bind
         */
        public JakartaXmlBindVersionAccessors getBind() {
            return vaccForJakartaXmlBindVersionAccessors;
        }

    }

    public static class JakartaXmlBindVersionAccessors extends VersionFactory  {

        private final JakartaXmlBindJakartaVersionAccessors vaccForJakartaXmlBindJakartaVersionAccessors = new JakartaXmlBindJakartaVersionAccessors(providers, config);
        public JakartaXmlBindVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.xml.bind.jakarta
         */
        public JakartaXmlBindJakartaVersionAccessors getJakarta() {
            return vaccForJakartaXmlBindJakartaVersionAccessors;
        }

    }

    public static class JakartaXmlBindJakartaVersionAccessors extends VersionFactory  {

        private final JakartaXmlBindJakartaXmlVersionAccessors vaccForJakartaXmlBindJakartaXmlVersionAccessors = new JakartaXmlBindJakartaXmlVersionAccessors(providers, config);
        public JakartaXmlBindJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.xml.bind.jakarta.xml
         */
        public JakartaXmlBindJakartaXmlVersionAccessors getXml() {
            return vaccForJakartaXmlBindJakartaXmlVersionAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlVersionAccessors extends VersionFactory  {

        private final JakartaXmlBindJakartaXmlBindVersionAccessors vaccForJakartaXmlBindJakartaXmlBindVersionAccessors = new JakartaXmlBindJakartaXmlBindVersionAccessors(providers, config);
        public JakartaXmlBindJakartaXmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.xml.bind.jakarta.xml.bind
         */
        public JakartaXmlBindJakartaXmlBindVersionAccessors getBind() {
            return vaccForJakartaXmlBindJakartaXmlBindVersionAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlBindVersionAccessors extends VersionFactory  {

        public JakartaXmlBindJakartaXmlBindVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jakarta.xml.bind.jakarta.xml.bind.api (4.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApi() { return getVersion("jakarta.xml.bind.jakarta.xml.bind.api"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgGlassfishVersionAccessors vaccForOrgGlassfishVersionAccessors = new OrgGlassfishVersionAccessors(providers, config);
        private final OrgJunitVersionAccessors vaccForOrgJunitVersionAccessors = new OrgJunitVersionAccessors(providers, config);
        private final OrgPostgresqlVersionAccessors vaccForOrgPostgresqlVersionAccessors = new OrgPostgresqlVersionAccessors(providers, config);
        private final OrgSpringframeworkVersionAccessors vaccForOrgSpringframeworkVersionAccessors = new OrgSpringframeworkVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.glassfish
         */
        public OrgGlassfishVersionAccessors getGlassfish() {
            return vaccForOrgGlassfishVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.junit
         */
        public OrgJunitVersionAccessors getJunit() {
            return vaccForOrgJunitVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.postgresql
         */
        public OrgPostgresqlVersionAccessors getPostgresql() {
            return vaccForOrgPostgresqlVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.springframework
         */
        public OrgSpringframeworkVersionAccessors getSpringframework() {
            return vaccForOrgSpringframeworkVersionAccessors;
        }

    }

    public static class OrgGlassfishVersionAccessors extends VersionFactory  {

        private final OrgGlassfishJaxbVersionAccessors vaccForOrgGlassfishJaxbVersionAccessors = new OrgGlassfishJaxbVersionAccessors(providers, config);
        public OrgGlassfishVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.glassfish.jaxb
         */
        public OrgGlassfishJaxbVersionAccessors getJaxb() {
            return vaccForOrgGlassfishJaxbVersionAccessors;
        }

    }

    public static class OrgGlassfishJaxbVersionAccessors extends VersionFactory  {

        private final OrgGlassfishJaxbJaxbVersionAccessors vaccForOrgGlassfishJaxbJaxbVersionAccessors = new OrgGlassfishJaxbJaxbVersionAccessors(providers, config);
        public OrgGlassfishJaxbVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.glassfish.jaxb.jaxb
         */
        public OrgGlassfishJaxbJaxbVersionAccessors getJaxb() {
            return vaccForOrgGlassfishJaxbJaxbVersionAccessors;
        }

    }

    public static class OrgGlassfishJaxbJaxbVersionAccessors extends VersionFactory  {

        public OrgGlassfishJaxbJaxbVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.glassfish.jaxb.jaxb.runtime (4.0.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRuntime() { return getVersion("org.glassfish.jaxb.jaxb.runtime"); }

    }

    public static class OrgJunitVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterVersionAccessors vaccForOrgJunitJupiterVersionAccessors = new OrgJunitJupiterVersionAccessors(providers, config);
        public OrgJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.junit.jupiter
         */
        public OrgJunitJupiterVersionAccessors getJupiter() {
            return vaccForOrgJunitJupiterVersionAccessors;
        }

    }

    public static class OrgJunitJupiterVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterJunitVersionAccessors vaccForOrgJunitJupiterJunitVersionAccessors = new OrgJunitJupiterJunitVersionAccessors(providers, config);
        public OrgJunitJupiterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.junit.jupiter.junit
         */
        public OrgJunitJupiterJunitVersionAccessors getJunit() {
            return vaccForOrgJunitJupiterJunitVersionAccessors;
        }

    }

    public static class OrgJunitJupiterJunitVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterJunitJupiterVersionAccessors vaccForOrgJunitJupiterJunitJupiterVersionAccessors = new OrgJunitJupiterJunitJupiterVersionAccessors(providers, config);
        public OrgJunitJupiterJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.junit.jupiter.junit.jupiter
         */
        public OrgJunitJupiterJunitJupiterVersionAccessors getJupiter() {
            return vaccForOrgJunitJupiterJunitJupiterVersionAccessors;
        }

    }

    public static class OrgJunitJupiterJunitJupiterVersionAccessors extends VersionFactory  {

        public OrgJunitJupiterJunitJupiterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.junit.jupiter.junit.jupiter.api (5.11.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApi() { return getVersion("org.junit.jupiter.junit.jupiter.api"); }

            /**
             * Returns the version associated to this alias: org.junit.jupiter.junit.jupiter.engine (5.11.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEngine() { return getVersion("org.junit.jupiter.junit.jupiter.engine"); }

    }

    public static class OrgPostgresqlVersionAccessors extends VersionFactory  {

        public OrgPostgresqlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.postgresql.postgresql (42.7.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPostgresql() { return getVersion("org.postgresql.postgresql"); }

    }

    public static class OrgSpringframeworkVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootVersionAccessors vaccForOrgSpringframeworkBootVersionAccessors = new OrgSpringframeworkBootVersionAccessors(providers, config);
        private final OrgSpringframeworkDataVersionAccessors vaccForOrgSpringframeworkDataVersionAccessors = new OrgSpringframeworkDataVersionAccessors(providers, config);
        private final OrgSpringframeworkWsVersionAccessors vaccForOrgSpringframeworkWsVersionAccessors = new OrgSpringframeworkWsVersionAccessors(providers, config);
        public OrgSpringframeworkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.boot
         */
        public OrgSpringframeworkBootVersionAccessors getBoot() {
            return vaccForOrgSpringframeworkBootVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.springframework.data
         */
        public OrgSpringframeworkDataVersionAccessors getData() {
            return vaccForOrgSpringframeworkDataVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.springframework.ws
         */
        public OrgSpringframeworkWsVersionAccessors getWs() {
            return vaccForOrgSpringframeworkWsVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringVersionAccessors vaccForOrgSpringframeworkBootSpringVersionAccessors = new OrgSpringframeworkBootSpringVersionAccessors(providers, config);
        public OrgSpringframeworkBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.boot.spring
         */
        public OrgSpringframeworkBootSpringVersionAccessors getSpring() {
            return vaccForOrgSpringframeworkBootSpringVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringBootVersionAccessors vaccForOrgSpringframeworkBootSpringBootVersionAccessors = new OrgSpringframeworkBootSpringBootVersionAccessors(providers, config);
        public OrgSpringframeworkBootSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.boot.spring.boot
         */
        public OrgSpringframeworkBootSpringBootVersionAccessors getBoot() {
            return vaccForOrgSpringframeworkBootSpringBootVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringBootStarterVersionAccessors vaccForOrgSpringframeworkBootSpringBootStarterVersionAccessors = new OrgSpringframeworkBootSpringBootStarterVersionAccessors(providers, config);
        public OrgSpringframeworkBootSpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.devtools (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDevtools() { return getVersion("org.springframework.boot.spring.boot.devtools"); }

        /**
         * Returns the group of versions at versions.org.springframework.boot.spring.boot.starter
         */
        public OrgSpringframeworkBootSpringBootStarterVersionAccessors getStarter() {
            return vaccForOrgSpringframeworkBootSpringBootStarterVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringBootStarterDataVersionAccessors vaccForOrgSpringframeworkBootSpringBootStarterDataVersionAccessors = new OrgSpringframeworkBootSpringBootStarterDataVersionAccessors(providers, config);
        public OrgSpringframeworkBootSpringBootStarterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.starter.hateoas (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHateoas() { return getVersion("org.springframework.boot.spring.boot.starter.hateoas"); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.starter.test (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTest() { return getVersion("org.springframework.boot.spring.boot.starter.test"); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.starter.validation (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getValidation() { return getVersion("org.springframework.boot.spring.boot.starter.validation"); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.starter.web (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWeb() { return getVersion("org.springframework.boot.spring.boot.starter.web"); }

        /**
         * Returns the group of versions at versions.org.springframework.boot.spring.boot.starter.data
         */
        public OrgSpringframeworkBootSpringBootStarterDataVersionAccessors getData() {
            return vaccForOrgSpringframeworkBootSpringBootStarterDataVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterDataVersionAccessors extends VersionFactory  {

        public OrgSpringframeworkBootSpringBootStarterDataVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.boot.spring.boot.starter.data.jpa (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJpa() { return getVersion("org.springframework.boot.spring.boot.starter.data.jpa"); }

    }

    public static class OrgSpringframeworkDataVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkDataSpringVersionAccessors vaccForOrgSpringframeworkDataSpringVersionAccessors = new OrgSpringframeworkDataSpringVersionAccessors(providers, config);
        public OrgSpringframeworkDataVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.data.spring
         */
        public OrgSpringframeworkDataSpringVersionAccessors getSpring() {
            return vaccForOrgSpringframeworkDataSpringVersionAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkDataSpringDataVersionAccessors vaccForOrgSpringframeworkDataSpringDataVersionAccessors = new OrgSpringframeworkDataSpringDataVersionAccessors(providers, config);
        public OrgSpringframeworkDataSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.data.spring.data
         */
        public OrgSpringframeworkDataSpringDataVersionAccessors getData() {
            return vaccForOrgSpringframeworkDataSpringDataVersionAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkDataSpringDataRestVersionAccessors vaccForOrgSpringframeworkDataSpringDataRestVersionAccessors = new OrgSpringframeworkDataSpringDataRestVersionAccessors(providers, config);
        public OrgSpringframeworkDataSpringDataVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.data.spring.data.rest
         */
        public OrgSpringframeworkDataSpringDataRestVersionAccessors getRest() {
            return vaccForOrgSpringframeworkDataSpringDataRestVersionAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataRestVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkDataSpringDataRestHalVersionAccessors vaccForOrgSpringframeworkDataSpringDataRestHalVersionAccessors = new OrgSpringframeworkDataSpringDataRestHalVersionAccessors(providers, config);
        public OrgSpringframeworkDataSpringDataRestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.data.spring.data.rest.hal
         */
        public OrgSpringframeworkDataSpringDataRestHalVersionAccessors getHal() {
            return vaccForOrgSpringframeworkDataSpringDataRestHalVersionAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataRestHalVersionAccessors extends VersionFactory  {

        public OrgSpringframeworkDataSpringDataRestHalVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.data.spring.data.rest.hal.explorer (4.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExplorer() { return getVersion("org.springframework.data.spring.data.rest.hal.explorer"); }

    }

    public static class OrgSpringframeworkWsVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkWsSpringVersionAccessors vaccForOrgSpringframeworkWsSpringVersionAccessors = new OrgSpringframeworkWsSpringVersionAccessors(providers, config);
        public OrgSpringframeworkWsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.ws.spring
         */
        public OrgSpringframeworkWsSpringVersionAccessors getSpring() {
            return vaccForOrgSpringframeworkWsSpringVersionAccessors;
        }

    }

    public static class OrgSpringframeworkWsSpringVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkWsSpringWsVersionAccessors vaccForOrgSpringframeworkWsSpringWsVersionAccessors = new OrgSpringframeworkWsSpringWsVersionAccessors(providers, config);
        public OrgSpringframeworkWsSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.springframework.ws.spring.ws
         */
        public OrgSpringframeworkWsSpringWsVersionAccessors getWs() {
            return vaccForOrgSpringframeworkWsSpringWsVersionAccessors;
        }

    }

    public static class OrgSpringframeworkWsSpringWsVersionAccessors extends VersionFactory  {

        public OrgSpringframeworkWsSpringWsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.ws.spring.ws.core (5.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("org.springframework.ws.spring.ws.core"); }

    }

    public static class Wsdl4jVersionAccessors extends VersionFactory  {

        public Wsdl4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: wsdl4j.wsdl4j (1.6.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWsdl4j() { return getVersion("wsdl4j.wsdl4j"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}

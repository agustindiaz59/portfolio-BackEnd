package org.springframework.data.rest.webmvc.config;

import java.lang.Class;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.data.auditing.AuditableBeanWrapperFactory;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.repository.support.Repositories;
import org.springframework.data.repository.support.RepositoryInvokerFactory;
import org.springframework.data.rest.core.config.MetadataConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.AnnotatedEventHandlerInvoker;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.core.mapping.RepositoryResourceMappings;
import org.springframework.data.rest.core.support.RepositoryRelProvider;
import org.springframework.data.rest.core.support.SelfLinkProvider;
import org.springframework.data.rest.webmvc.BaseUri;
import org.springframework.data.rest.webmvc.HttpHeadersPreparer;
import org.springframework.data.rest.webmvc.ProfileResourceProcessor;
import org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler;
import org.springframework.data.rest.webmvc.ServerHttpRequestMethodArgumentResolver;
import org.springframework.data.rest.webmvc.alps.AlpsJsonHttpMessageConverter;
import org.springframework.data.rest.webmvc.alps.RootResourceInformationToAlpsDescriptorConverter;
import org.springframework.data.rest.webmvc.convert.UriListHttpMessageConverter;
import org.springframework.data.rest.webmvc.json.EnumTranslator;
import org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverter;
import org.springframework.data.rest.webmvc.mapping.Associations;
import org.springframework.data.rest.webmvc.mapping.LinkCollector;
import org.springframework.data.rest.webmvc.spi.BackendIdConverter;
import org.springframework.data.rest.webmvc.support.BackendIdHandlerMethodArgumentResolver;
import org.springframework.data.rest.webmvc.support.ETagArgumentResolver;
import org.springframework.data.rest.webmvc.support.ExcerptProjector;
import org.springframework.data.rest.webmvc.support.JpaHelper;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.data.web.HateoasPageableHandlerMethodArgumentResolver;
import org.springframework.data.web.HateoasSortHandlerMethodArgumentResolver;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.hateoas.mediatype.MessageResolver;
import org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * Bean definitions for {@link RepositoryRestMvcConfiguration}
 */
public class RepositoryRestMvcConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration'.
   */
  private static BeanInstanceSupplier<RepositoryRestMvcConfiguration> getRepositoryRestMvcConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryRestMvcConfiguration>forConstructor(ApplicationContext.class, ObjectFactory.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new RepositoryRestMvcConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9)));
  }

  /**
   * Get the bean definition for 'repositoryRestMvcConfiguration'
   */
  public static BeanDefinition getRepositoryRestMvcConfigurationBeanDefinition() {
    Class<?> beanType = RepositoryRestMvcConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryRestMvcConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositories'.
   */
  private static BeanInstanceSupplier<Repositories> getRepositoriesInstanceSupplier() {
    return BeanInstanceSupplier.<Repositories>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositories")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositories());
  }

  /**
   * Get the bean definition for 'repositories'
   */
  public static BeanDefinition getRepositoriesBeanDefinition() {
    Class<?> beanType = Repositories.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoriesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryRelProvider'.
   */
  private static BeanInstanceSupplier<RepositoryRelProvider> getRepositoryRelProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryRelProvider>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositoryRelProvider", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositoryRelProvider(args.get(0)));
  }

  /**
   * Get the bean definition for 'repositoryRelProvider'
   */
  public static BeanDefinition getRepositoryRelProviderBeanDefinition() {
    Class<?> beanType = RepositoryRelProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryRelProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'persistentEntities'.
   */
  private static BeanInstanceSupplier<PersistentEntities> getPersistentEntitiesInstanceSupplier() {
    return BeanInstanceSupplier.<PersistentEntities>forFactoryMethod(RepositoryRestMvcConfiguration.class, "persistentEntities")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).persistentEntities());
  }

  /**
   * Get the bean definition for 'persistentEntities'
   */
  public static BeanDefinition getPersistentEntitiesBeanDefinition() {
    Class<?> beanType = PersistentEntities.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPersistentEntitiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultConversionService'.
   */
  private static BeanInstanceSupplier<DefaultFormattingConversionService> getDefaultConversionServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultFormattingConversionService>forFactoryMethod(RepositoryRestMvcConfiguration.class, "defaultConversionService", PersistentEntities.class, RepositoryInvokerFactory.class, Repositories.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).defaultConversionService(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'defaultConversionService'
   */
  public static BeanDefinition getDefaultConversionServiceBeanDefinition() {
    Class<?> beanType = DefaultFormattingConversionService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDefaultConversionServiceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'validatingRepositoryEventListener'.
   */
  private static BeanInstanceSupplier<ValidatingRepositoryEventListener> getValidatingRepositoryEventListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValidatingRepositoryEventListener>forFactoryMethod(RepositoryRestMvcConfiguration.class, "validatingRepositoryEventListener", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).validatingRepositoryEventListener(args.get(0)));
  }

  /**
   * Get the bean definition for 'validatingRepositoryEventListener'
   */
  public static BeanDefinition getValidatingRepositoryEventListenerBeanDefinition() {
    Class<?> beanType = ValidatingRepositoryEventListener.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getValidatingRepositoryEventListenerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jpaHelper'.
   */
  private static BeanInstanceSupplier<JpaHelper> getJpaHelperInstanceSupplier() {
    return BeanInstanceSupplier.<JpaHelper>forFactoryMethod(RepositoryRestMvcConfiguration.class, "jpaHelper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).jpaHelper());
  }

  /**
   * Get the bean definition for 'jpaHelper'
   */
  public static BeanDefinition getJpaHelperBeanDefinition() {
    Class<?> beanType = JpaHelper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJpaHelperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryRestConfiguration'.
   */
  private static BeanInstanceSupplier<RepositoryRestConfiguration> getRepositoryRestConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryRestConfiguration>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositoryRestConfiguration")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositoryRestConfiguration());
  }

  /**
   * Get the bean definition for 'repositoryRestConfiguration'
   */
  public static BeanDefinition getRepositoryRestConfigurationBeanDefinition() {
    Class<?> beanType = RepositoryRestConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryRestConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'projectionDefinitionRegistrar'.
   */
  private static BeanInstanceSupplier<ProjectionDefinitionRegistar> getProjectionDefinitionRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ProjectionDefinitionRegistar>forFactoryMethod(RepositoryRestMvcConfiguration.class, "projectionDefinitionRegistrar", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> RepositoryRestMvcConfiguration.projectionDefinitionRegistrar(args.get(0)));
  }

  /**
   * Get the bean definition for 'projectionDefinitionRegistrar'
   */
  public static BeanDefinition getProjectionDefinitionRegistrarBeanDefinition() {
    Class<?> beanType = ProjectionDefinitionRegistar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProjectionDefinitionRegistrarInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'metadataConfiguration'.
   */
  private static BeanInstanceSupplier<MetadataConfiguration> getMetadataConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MetadataConfiguration>forFactoryMethod(RepositoryRestMvcConfiguration.class, "metadataConfiguration")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).metadataConfiguration());
  }

  /**
   * Get the bean definition for 'metadataConfiguration'
   */
  public static BeanDefinition getMetadataConfigurationBeanDefinition() {
    Class<?> beanType = MetadataConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMetadataConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'baseUri'.
   */
  private static BeanInstanceSupplier<BaseUri> getBaseUriInstanceSupplier() {
    return BeanInstanceSupplier.<BaseUri>forFactoryMethod(RepositoryRestMvcConfiguration.class, "baseUri", RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).baseUri(args.get(0)));
  }

  /**
   * Get the bean definition for 'baseUri'
   */
  public static BeanDefinition getBaseUriBeanDefinition() {
    Class<?> beanType = BaseUri.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBaseUriInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'annotatedEventHandlerInvoker'
   */
  public static BeanDefinition getAnnotatedEventHandlerInvokerBeanDefinition() {
    Class<?> beanType = AnnotatedEventHandlerInvoker.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<AnnotatedEventHandlerInvoker>forFactoryMethod(RepositoryRestMvcConfiguration.class, "annotatedEventHandlerInvoker").withGenerator(RepositoryRestMvcConfiguration::annotatedEventHandlerInvoker));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'serverHttpRequestMethodArgumentResolver'.
   */
  private static BeanInstanceSupplier<ServerHttpRequestMethodArgumentResolver> getServerHttpRequestMethodArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServerHttpRequestMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "serverHttpRequestMethodArgumentResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).serverHttpRequestMethodArgumentResolver());
  }

  /**
   * Get the bean definition for 'serverHttpRequestMethodArgumentResolver'
   */
  public static BeanDefinition getServerHttpRequestMethodArgumentResolverBeanDefinition() {
    Class<?> beanType = ServerHttpRequestMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getServerHttpRequestMethodArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repoRequestArgumentResolver'.
   */
  private static BeanInstanceSupplier<RootResourceInformationHandlerMethodArgumentResolver> getRepoRequestArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RootResourceInformationHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repoRequestArgumentResolver", Repositories.class, ResourceMetadataHandlerMethodArgumentResolver.class, RepositoryInvokerFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repoRequestArgumentResolver(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'repoRequestArgumentResolver'
   */
  public static BeanDefinition getRepoRequestArgumentResolverBeanDefinition() {
    Class<?> beanType = RootResourceInformationHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepoRequestArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'resourceMetadataHandlerMethodArgumentResolver'.
   */
  private static BeanInstanceSupplier<ResourceMetadataHandlerMethodArgumentResolver> getResourceMetadataHandlerMethodArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ResourceMetadataHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "resourceMetadataHandlerMethodArgumentResolver", Repositories.class, RepositoryResourceMappings.class, BaseUri.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).resourceMetadataHandlerMethodArgumentResolver(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'resourceMetadataHandlerMethodArgumentResolver'
   */
  public static BeanDefinition getResourceMetadataHandlerMethodArgumentResolverBeanDefinition() {
    Class<?> beanType = ResourceMetadataHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getResourceMetadataHandlerMethodArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'backendIdHandlerMethodArgumentResolver'.
   */
  private static BeanInstanceSupplier<BackendIdHandlerMethodArgumentResolver> getBackendIdHandlerMethodArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BackendIdHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "backendIdHandlerMethodArgumentResolver", PluginRegistry.class, ResourceMetadataHandlerMethodArgumentResolver.class, BaseUri.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).backendIdHandlerMethodArgumentResolver(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'backendIdHandlerMethodArgumentResolver'
   */
  public static BeanDefinition getBackendIdHandlerMethodArgumentResolverBeanDefinition() {
    Class<?> beanType = BackendIdHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBackendIdHandlerMethodArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eTagArgumentResolver'.
   */
  private static BeanInstanceSupplier<ETagArgumentResolver> getETagArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ETagArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "eTagArgumentResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).eTagArgumentResolver());
  }

  /**
   * Get the bean definition for 'eTagArgumentResolver'
   */
  public static BeanDefinition getETagArgumentResolverBeanDefinition() {
    Class<?> beanType = ETagArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getETagArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'entityLinks'.
   */
  private static BeanInstanceSupplier<RepositoryEntityLinks> getEntityLinksInstanceSupplier() {
    return BeanInstanceSupplier.<RepositoryEntityLinks>forFactoryMethod(RepositoryRestMvcConfiguration.class, "entityLinks", ObjectFactory.class, Repositories.class, RepositoryResourceMappings.class, PluginRegistry.class, RepositoryRestConfiguration.class, ObjectFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).entityLinks(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'entityLinks'
   */
  public static BeanDefinition getEntityLinksBeanDefinition() {
    Class<?> beanType = RepositoryEntityLinks.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEntityLinksInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'persistentEntityArgumentResolver'.
   */
  private static BeanInstanceSupplier<PersistentEntityResourceHandlerMethodArgumentResolver> getPersistentEntityArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PersistentEntityResourceHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "persistentEntityArgumentResolver", List.class, RootResourceInformationHandlerMethodArgumentResolver.class, Associations.class, BackendIdHandlerMethodArgumentResolver.class, PersistentEntities.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).persistentEntityArgumentResolver(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'persistentEntityArgumentResolver'
   */
  public static BeanDefinition getPersistentEntityArgumentResolverBeanDefinition() {
    Class<?> beanType = PersistentEntityResourceHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPersistentEntityArgumentResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonSchemaConverter'.
   */
  private static BeanInstanceSupplier<PersistentEntityToJsonSchemaConverter> getJsonSchemaConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PersistentEntityToJsonSchemaConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "jsonSchemaConverter", PersistentEntities.class, Associations.class, RepositoryInvokerFactory.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).jsonSchemaConverter(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'jsonSchemaConverter'
   */
  public static BeanDefinition getJsonSchemaConverterBeanDefinition() {
    Class<?> beanType = PersistentEntityToJsonSchemaConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJsonSchemaConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jacksonHttpMessageConverter'.
   */
  private static BeanInstanceSupplier<TypeConstrainedMappingJackson2HttpMessageConverter> getJacksonHttpMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypeConstrainedMappingJackson2HttpMessageConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "jacksonHttpMessageConverter", RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).jacksonHttpMessageConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'jacksonHttpMessageConverter'
   */
  public static BeanDefinition getJacksonHttpMessageConverterBeanDefinition() {
    Class<?> beanType = TypeConstrainedMappingJackson2HttpMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJacksonHttpMessageConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'halJacksonHttpMessageConverter'.
   */
  private static BeanInstanceSupplier<TypeConstrainedMappingJackson2HttpMessageConverter> getHalJacksonHttpMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypeConstrainedMappingJackson2HttpMessageConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "halJacksonHttpMessageConverter", LinkCollector.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).halJacksonHttpMessageConverter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'halJacksonHttpMessageConverter'
   */
  public static BeanDefinition getHalJacksonHttpMessageConverterBeanDefinition() {
    Class<?> beanType = TypeConstrainedMappingJackson2HttpMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHalJacksonHttpMessageConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'halFormsJacksonHttpMessageConverter'.
   */
  private static BeanInstanceSupplier<TypeConstrainedMappingJackson2HttpMessageConverter> getHalFormsJacksonHttpMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypeConstrainedMappingJackson2HttpMessageConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "halFormsJacksonHttpMessageConverter", LinkCollector.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).halFormsJacksonHttpMessageConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'halFormsJacksonHttpMessageConverter'
   */
  public static BeanDefinition getHalFormsJacksonHttpMessageConverterBeanDefinition() {
    Class<?> beanType = TypeConstrainedMappingJackson2HttpMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHalFormsJacksonHttpMessageConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'uriListHttpMessageConverter'.
   */
  private static BeanInstanceSupplier<UriListHttpMessageConverter> getUriListHttpMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<UriListHttpMessageConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "uriListHttpMessageConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).uriListHttpMessageConverter());
  }

  /**
   * Get the bean definition for 'uriListHttpMessageConverter'
   */
  public static BeanDefinition getUriListHttpMessageConverterBeanDefinition() {
    Class<?> beanType = UriListHttpMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getUriListHttpMessageConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryExporterHandlerAdapter'.
   */
  private static BeanInstanceSupplier<RequestMappingHandlerAdapter> getRepositoryExporterHandlerAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RequestMappingHandlerAdapter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositoryExporterHandlerAdapter", List.class, AlpsJsonHttpMessageConverter.class, SelfLinkProvider.class, PersistentEntityResourceHandlerMethodArgumentResolver.class, RootResourceInformationHandlerMethodArgumentResolver.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositoryExporterHandlerAdapter(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'repositoryExporterHandlerAdapter'
   */
  public static BeanDefinition getRepositoryExporterHandlerAdapterBeanDefinition() {
    Class<?> beanType = RequestMappingHandlerAdapter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryExporterHandlerAdapterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'restHandlerMapping'.
   */
  private static BeanInstanceSupplier<DelegatingHandlerMapping> getRestHandlerMappingInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DelegatingHandlerMapping>forFactoryMethod(RepositoryRestMvcConfiguration.class, "restHandlerMapping", Repositories.class, RepositoryResourceMappings.class, Optional.class, RepositoryRestConfiguration.class, CorsConfigurationAware.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).restHandlerMapping(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'restHandlerMapping'
   */
  public static BeanDefinition getRestHandlerMappingBeanDefinition() {
    Class<?> beanType = DelegatingHandlerMapping.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRestHandlerMappingInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'resourceMappings'.
   */
  private static BeanInstanceSupplier<RepositoryResourceMappings> getResourceMappingsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryResourceMappings>forFactoryMethod(RepositoryRestMvcConfiguration.class, "resourceMappings", Repositories.class, PersistentEntities.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).resourceMappings(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'resourceMappings'
   */
  public static BeanDefinition getResourceMappingsBeanDefinition() {
    Class<?> beanType = RepositoryResourceMappings.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getResourceMappingsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'linkCollector'.
   */
  private static BeanInstanceSupplier<LinkCollector> getLinkCollectorInstanceSupplier() {
    return BeanInstanceSupplier.<LinkCollector>forFactoryMethod(RepositoryRestMvcConfiguration.class, "linkCollector", PersistentEntities.class, SelfLinkProvider.class, Associations.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).linkCollector(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'linkCollector'
   */
  public static BeanDefinition getLinkCollectorBeanDefinition() {
    Class<?> beanType = LinkCollector.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getLinkCollectorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'excerptProjector'.
   */
  private static BeanInstanceSupplier<ExcerptProjector> getExcerptProjectorInstanceSupplier() {
    return BeanInstanceSupplier.<ExcerptProjector>forFactoryMethod(RepositoryRestMvcConfiguration.class, "excerptProjector", RepositoryResourceMappings.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).excerptProjector(args.get(0)));
  }

  /**
   * Get the bean definition for 'excerptProjector'
   */
  public static BeanDefinition getExcerptProjectorBeanDefinition() {
    Class<?> beanType = ExcerptProjector.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getExcerptProjectorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryRestExceptionHandler'.
   */
  private static BeanInstanceSupplier<RepositoryRestExceptionHandler> getRepositoryRestExceptionHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryRestExceptionHandler>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositoryRestExceptionHandler")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositoryRestExceptionHandler());
  }

  /**
   * Get the bean definition for 'repositoryRestExceptionHandler'
   */
  public static BeanDefinition getRepositoryRestExceptionHandlerBeanDefinition() {
    Class<?> beanType = RepositoryRestExceptionHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryRestExceptionHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryInvokerFactory'.
   */
  private static BeanInstanceSupplier<RepositoryInvokerFactory> getRepositoryInvokerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryInvokerFactory>forFactoryMethod(RepositoryRestMvcConfiguration.class, "repositoryInvokerFactory")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).repositoryInvokerFactory());
  }

  /**
   * Get the bean definition for 'repositoryInvokerFactory'
   */
  public static BeanDefinition getRepositoryInvokerFactoryBeanDefinition() {
    Class<?> beanType = RepositoryInvokerFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryInvokerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultMessageConverters'.
   */
  private static BeanInstanceSupplier<List> getDefaultMessageConvertersInstanceSupplier() {
    return BeanInstanceSupplier.<List>forFactoryMethod(RepositoryRestMvcConfiguration.class, "defaultMessageConverters", TypeConstrainedMappingJackson2HttpMessageConverter.class, TypeConstrainedMappingJackson2HttpMessageConverter.class, TypeConstrainedMappingJackson2HttpMessageConverter.class, AlpsJsonHttpMessageConverter.class, UriListHttpMessageConverter.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).defaultMessageConverters(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'defaultMessageConverters'
   */
  public static BeanDefinition getDefaultMessageConvertersBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(List.class, ResolvableType.forClass(HttpMessageConverter.class));
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDefaultMessageConvertersInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'alpsJsonHttpMessageConverter'.
   */
  private static BeanInstanceSupplier<AlpsJsonHttpMessageConverter> getAlpsJsonHttpMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AlpsJsonHttpMessageConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "alpsJsonHttpMessageConverter", RootResourceInformationToAlpsDescriptorConverter.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).alpsJsonHttpMessageConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'alpsJsonHttpMessageConverter'
   */
  public static BeanDefinition getAlpsJsonHttpMessageConverterBeanDefinition() {
    Class<?> beanType = AlpsJsonHttpMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAlpsJsonHttpMessageConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pageableResolver'.
   */
  private static BeanInstanceSupplier<HateoasPageableHandlerMethodArgumentResolver> getPageableResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HateoasPageableHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "pageableResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).pageableResolver());
  }

  /**
   * Get the bean definition for 'pageableResolver'
   */
  public static BeanDefinition getPageableResolverBeanDefinition() {
    Class<?> beanType = HateoasPageableHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPageableResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sortResolver'.
   */
  private static BeanInstanceSupplier<HateoasSortHandlerMethodArgumentResolver> getSortResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HateoasSortHandlerMethodArgumentResolver>forFactoryMethod(RepositoryRestMvcConfiguration.class, "sortResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).sortResolver());
  }

  /**
   * Get the bean definition for 'sortResolver'
   */
  public static BeanDefinition getSortResolverBeanDefinition() {
    Class<?> beanType = HateoasSortHandlerMethodArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSortResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'backendIdConverterRegistry'.
   */
  private static BeanInstanceSupplier<PluginRegistry> getBackendIdConverterRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PluginRegistry>forFactoryMethod(RepositoryRestMvcConfiguration.class, "backendIdConverterRegistry", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).backendIdConverterRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'backendIdConverterRegistry'
   */
  public static BeanDefinition getBackendIdConverterRegistryBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(PluginRegistry.class, ResolvableType.forClass(BackendIdConverter.class), ResolvableType.forClass(Class.class));
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBackendIdConverterRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'auditableBeanWrapperFactory'.
   */
  private static BeanInstanceSupplier<AuditableBeanWrapperFactory> getAuditableBeanWrapperFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuditableBeanWrapperFactory>forFactoryMethod(RepositoryRestMvcConfiguration.class, "auditableBeanWrapperFactory", PersistentEntities.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).auditableBeanWrapperFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'auditableBeanWrapperFactory'
   */
  public static BeanDefinition getAuditableBeanWrapperFactoryBeanDefinition() {
    Class<?> beanType = AuditableBeanWrapperFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAuditableBeanWrapperFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'httpHeadersPreparer'.
   */
  private static BeanInstanceSupplier<HttpHeadersPreparer> getHttpHeadersPreparerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HttpHeadersPreparer>forFactoryMethod(RepositoryRestMvcConfiguration.class, "httpHeadersPreparer", AuditableBeanWrapperFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).httpHeadersPreparer(args.get(0)));
  }

  /**
   * Get the bean definition for 'httpHeadersPreparer'
   */
  public static BeanDefinition getHttpHeadersPreparerBeanDefinition() {
    Class<?> beanType = HttpHeadersPreparer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHttpHeadersPreparerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'selfLinkProvider'.
   */
  private static BeanInstanceSupplier<SelfLinkProvider> getSelfLinkProviderInstanceSupplier() {
    return BeanInstanceSupplier.<SelfLinkProvider>forFactoryMethod(RepositoryRestMvcConfiguration.class, "selfLinkProvider", PersistentEntities.class, RepositoryEntityLinks.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).selfLinkProvider(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'selfLinkProvider'
   */
  public static BeanDefinition getSelfLinkProviderBeanDefinition() {
    Class<?> beanType = SelfLinkProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSelfLinkProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'associationLinks'.
   */
  private static BeanInstanceSupplier<Associations> getAssociationLinksInstanceSupplier() {
    return BeanInstanceSupplier.<Associations>forFactoryMethod(RepositoryRestMvcConfiguration.class, "associationLinks", RepositoryResourceMappings.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).associationLinks(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'associationLinks'
   */
  public static BeanDefinition getAssociationLinksBeanDefinition() {
    Class<?> beanType = Associations.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAssociationLinksInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'enumTranslator'.
   */
  private static BeanInstanceSupplier<EnumTranslator> getEnumTranslatorInstanceSupplier() {
    return BeanInstanceSupplier.<EnumTranslator>forFactoryMethod(RepositoryRestMvcConfiguration.class, "enumTranslator", MessageResolver.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).enumTranslator(args.get(0)));
  }

  /**
   * Get the bean definition for 'enumTranslator'
   */
  public static BeanDefinition getEnumTranslatorBeanDefinition() {
    Class<?> beanType = EnumTranslator.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEnumTranslatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'alpsConverter'.
   */
  private static BeanInstanceSupplier<RootResourceInformationToAlpsDescriptorConverter> getAlpsConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RootResourceInformationToAlpsDescriptorConverter>forFactoryMethod(RepositoryRestMvcConfiguration.class, "alpsConverter", Repositories.class, PersistentEntities.class, RepositoryEntityLinks.class, EnumTranslator.class, Associations.class, RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).alpsConverter(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'alpsConverter'
   */
  public static BeanDefinition getAlpsConverterBeanDefinition() {
    Class<?> beanType = RootResourceInformationToAlpsDescriptorConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAlpsConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'profileResourceProcessor'.
   */
  private static BeanInstanceSupplier<ProfileResourceProcessor> getProfileResourceProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ProfileResourceProcessor>forFactoryMethod(RepositoryRestMvcConfiguration.class, "profileResourceProcessor", RepositoryRestConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RepositoryRestMvcConfiguration.class).profileResourceProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'profileResourceProcessor'
   */
  public static BeanDefinition getProfileResourceProcessorBeanDefinition() {
    Class<?> beanType = ProfileResourceProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProfileResourceProcessorInstanceSupplier());
    return beanDefinition;
  }
}

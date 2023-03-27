package org.springframework.hateoas.config;

import java.lang.Class;
import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.hateoas.server.mvc.RepresentationModelProcessorInvoker;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderFactory;

/**
 * Bean definitions for {@link WebMvcHateoasConfiguration}
 */
public class WebMvcHateoasConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcHateoasConfiguration'
   */
  public static BeanDefinition getWebMvcHateoasConfigurationBeanDefinition() {
    Class<?> beanType = WebMvcHateoasConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebMvcHateoasConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hypermediaWebMvcConfigurer'.
   */
  private static BeanInstanceSupplier<WebMvcHateoasConfiguration.HypermediaWebMvcConfigurer> getHypermediaWebMvcConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcHateoasConfiguration.HypermediaWebMvcConfigurer>forFactoryMethod(WebMvcHateoasConfiguration.class, "hypermediaWebMvcConfigurer", WebConverters.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcHateoasConfiguration.class).hypermediaWebMvcConfigurer(args.get(0)));
  }

  /**
   * Get the bean definition for 'hypermediaWebMvcConfigurer'
   */
  public static BeanDefinition getHypermediaWebMvcConfigurerBeanDefinition() {
    Class<?> beanType = WebMvcHateoasConfiguration.HypermediaWebMvcConfigurer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHypermediaWebMvcConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'representationModelProcessorInvoker'.
   */
  private static BeanInstanceSupplier<RepresentationModelProcessorInvoker> getRepresentationModelProcessorInvokerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepresentationModelProcessorInvoker>forFactoryMethod(WebMvcHateoasConfiguration.class, "representationModelProcessorInvoker", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcHateoasConfiguration.class).representationModelProcessorInvoker(args.get(0)));
  }

  /**
   * Get the bean definition for 'representationModelProcessorInvoker'
   */
  public static BeanDefinition getRepresentationModelProcessorInvokerBeanDefinition() {
    Class<?> beanType = RepresentationModelProcessorInvoker.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepresentationModelProcessorInvokerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hypermediaRepresentionModelProcessorConfigurator'.
   */
  private static BeanInstanceSupplier<WebMvcHateoasConfiguration.HypermediaRepresentationModelBeanProcessorPostProcessor> getHypermediaRepresentionModelProcessorConfiguratorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcHateoasConfiguration.HypermediaRepresentationModelBeanProcessorPostProcessor>forFactoryMethod(WebMvcHateoasConfiguration.class, "hypermediaRepresentionModelProcessorConfigurator", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> WebMvcHateoasConfiguration.hypermediaRepresentionModelProcessorConfigurator(args.get(0)));
  }

  /**
   * Get the bean definition for 'hypermediaRepresentionModelProcessorConfigurator'
   */
  public static BeanDefinition getHypermediaRepresentionModelProcessorConfiguratorBeanDefinition() {
    Class<?> beanType = WebMvcHateoasConfiguration.HypermediaRepresentationModelBeanProcessorPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHypermediaRepresentionModelProcessorConfiguratorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webMvcLinkBuilderFactory'.
   */
  private static BeanInstanceSupplier<WebMvcLinkBuilderFactory> getWebMvcLinkBuilderFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcLinkBuilderFactory>forFactoryMethod(WebMvcHateoasConfiguration.class, "webMvcLinkBuilderFactory", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcHateoasConfiguration.class).webMvcLinkBuilderFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'webMvcLinkBuilderFactory'
   */
  public static BeanDefinition getWebMvcLinkBuilderFactoryBeanDefinition() {
    Class<?> beanType = WebMvcLinkBuilderFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getWebMvcLinkBuilderFactoryInstanceSupplier());
    return beanDefinition;
  }
}

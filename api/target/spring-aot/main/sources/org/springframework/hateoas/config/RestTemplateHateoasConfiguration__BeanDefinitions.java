package org.springframework.hateoas.config;

import java.lang.Class;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestTemplateHateoasConfiguration}
 */
public class RestTemplateHateoasConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restTemplateHateoasConfiguration'
   */
  public static BeanDefinition getRestTemplateHateoasConfigurationBeanDefinition() {
    Class<?> beanType = RestTemplateHateoasConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(RestTemplateHateoasConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hypermediaRestTemplateBeanPostProcessor'.
   */
  private static BeanInstanceSupplier<RestTemplateHateoasConfiguration.HypermediaRestTemplateBeanPostProcessor> getHypermediaRestTemplateBeanPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestTemplateHateoasConfiguration.HypermediaRestTemplateBeanPostProcessor>forFactoryMethod(RestTemplateHateoasConfiguration.class, "hypermediaRestTemplateBeanPostProcessor", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> RestTemplateHateoasConfiguration.hypermediaRestTemplateBeanPostProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'hypermediaRestTemplateBeanPostProcessor'
   */
  public static BeanDefinition getHypermediaRestTemplateBeanPostProcessorBeanDefinition() {
    Class<?> beanType = RestTemplateHateoasConfiguration.HypermediaRestTemplateBeanPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHypermediaRestTemplateBeanPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hypermediaRestTemplateConfigurer'.
   */
  private static BeanInstanceSupplier<HypermediaRestTemplateConfigurer> getHypermediaRestTemplateConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HypermediaRestTemplateConfigurer>forFactoryMethod(RestTemplateHateoasConfiguration.class, "hypermediaRestTemplateConfigurer", WebConverters.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestTemplateHateoasConfiguration.class).hypermediaRestTemplateConfigurer(args.get(0)));
  }

  /**
   * Get the bean definition for 'hypermediaRestTemplateConfigurer'
   */
  public static BeanDefinition getHypermediaRestTemplateConfigurerBeanDefinition() {
    Class<?> beanType = HypermediaRestTemplateConfigurer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getHypermediaRestTemplateConfigurerInstanceSupplier());
    return beanDefinition;
  }
}

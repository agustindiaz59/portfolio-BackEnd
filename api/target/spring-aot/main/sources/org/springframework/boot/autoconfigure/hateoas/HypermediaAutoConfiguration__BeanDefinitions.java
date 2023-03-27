package org.springframework.boot.autoconfigure.hateoas;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.hateoas.mediatype.hal.HalConfiguration;

/**
 * Bean definitions for {@link HypermediaAutoConfiguration}
 */
public class HypermediaAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'hypermediaAutoConfiguration'
   */
  public static BeanDefinition getHypermediaAutoConfigurationBeanDefinition() {
    Class<?> beanType = HypermediaAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HypermediaAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'applicationJsonHalConfiguration'.
   */
  private static BeanInstanceSupplier<HalConfiguration> getApplicationJsonHalConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HalConfiguration>forFactoryMethod(HypermediaAutoConfiguration.class, "applicationJsonHalConfiguration")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HypermediaAutoConfiguration.class).applicationJsonHalConfiguration());
  }

  /**
   * Get the bean definition for 'applicationJsonHalConfiguration'
   */
  public static BeanDefinition getApplicationJsonHalConfigurationBeanDefinition() {
    Class<?> beanType = HalConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getApplicationJsonHalConfigurationInstanceSupplier());
    return beanDefinition;
  }
}

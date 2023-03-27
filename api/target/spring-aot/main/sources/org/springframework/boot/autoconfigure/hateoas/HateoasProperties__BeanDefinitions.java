package org.springframework.boot.autoconfigure.hateoas;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HateoasProperties}
 */
public class HateoasProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'hateoasProperties'
   */
  public static BeanDefinition getHateoasPropertiesBeanDefinition() {
    Class<?> beanType = HateoasProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HateoasProperties::new);
    return beanDefinition;
  }
}

package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EducacionService}
 */
public class EducacionService__BeanDefinitions {
  /**
   * Get the bean definition for 'educacionService'
   */
  public static BeanDefinition getEducacionServiceBeanDefinition() {
    Class<?> beanType = EducacionService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<EducacionService> instanceSupplier = InstanceSupplier.using(EducacionService::new);
    instanceSupplier = instanceSupplier.andThen(EducacionService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

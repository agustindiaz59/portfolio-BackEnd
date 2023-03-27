package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExperienciaService}
 */
public class ExperienciaService__BeanDefinitions {
  /**
   * Get the bean definition for 'experienciaService'
   */
  public static BeanDefinition getExperienciaServiceBeanDefinition() {
    Class<?> beanType = ExperienciaService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ExperienciaService> instanceSupplier = InstanceSupplier.using(ExperienciaService::new);
    instanceSupplier = instanceSupplier.andThen(ExperienciaService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

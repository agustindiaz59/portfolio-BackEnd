package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabilidadesService}
 */
public class HabilidadesService__BeanDefinitions {
  /**
   * Get the bean definition for 'habilidadesService'
   */
  public static BeanDefinition getHabilidadesServiceBeanDefinition() {
    Class<?> beanType = HabilidadesService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<HabilidadesService> instanceSupplier = InstanceSupplier.using(HabilidadesService::new);
    instanceSupplier = instanceSupplier.andThen(HabilidadesService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

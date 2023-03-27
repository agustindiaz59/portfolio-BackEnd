package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProyectoService}
 */
public class ProyectoService__BeanDefinitions {
  /**
   * Get the bean definition for 'proyectoService'
   */
  public static BeanDefinition getProyectoServiceBeanDefinition() {
    Class<?> beanType = ProyectoService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ProyectoService> instanceSupplier = InstanceSupplier.using(ProyectoService::new);
    instanceSupplier = instanceSupplier.andThen(ProyectoService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

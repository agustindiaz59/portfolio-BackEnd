package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UsuarioService}
 */
public class UsuarioService__BeanDefinitions {
  /**
   * Get the bean definition for 'usuarioService'
   */
  public static BeanDefinition getUsuarioServiceBeanDefinition() {
    Class<?> beanType = UsuarioService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<UsuarioService> instanceSupplier = InstanceSupplier.using(UsuarioService::new);
    instanceSupplier = instanceSupplier.andThen(UsuarioService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

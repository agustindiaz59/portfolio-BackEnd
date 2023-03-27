package com.portfolio.api.services;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PersonaService}
 */
public class PersonaService__BeanDefinitions {
  /**
   * Get the bean definition for 'personaService'
   */
  public static BeanDefinition getPersonaServiceBeanDefinition() {
    Class<?> beanType = PersonaService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<PersonaService> instanceSupplier = InstanceSupplier.using(PersonaService::new);
    instanceSupplier = instanceSupplier.andThen(PersonaService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}

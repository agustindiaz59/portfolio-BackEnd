package org.springframework.boot.autoconfigure.data.rest;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RepositoryRestProperties}
 */
public class RepositoryRestProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'repositoryRestProperties'
   */
  public static BeanDefinition getRepositoryRestPropertiesBeanDefinition() {
    Class<?> beanType = RepositoryRestProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(RepositoryRestProperties::new);
    return beanDefinition;
  }
}

package com.portfolio.api.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProyectoService}.
 */
public class ProyectoService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProyectoService apply(RegisteredBean registeredBean, ProyectoService instance) {
    AutowiredFieldValueResolver.forRequiredField("repo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}

package com.portfolio.api.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabilidadesService}.
 */
public class HabilidadesService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabilidadesService apply(RegisteredBean registeredBean,
      HabilidadesService instance) {
    AutowiredFieldValueResolver.forRequiredField("repo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}

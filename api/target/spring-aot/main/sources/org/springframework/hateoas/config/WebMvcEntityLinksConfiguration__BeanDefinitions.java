package org.springframework.hateoas.config;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.hateoas.server.core.ControllerEntityLinksFactoryBean;

/**
 * Bean definitions for {@link WebMvcEntityLinksConfiguration}
 */
public class WebMvcEntityLinksConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcEntityLinksConfiguration'
   */
  public static BeanDefinition getWebMvcEntityLinksConfigurationBeanDefinition() {
    Class<?> beanType = WebMvcEntityLinksConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebMvcEntityLinksConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webMvcEntityLinks'.
   */
  private static BeanInstanceSupplier<ControllerEntityLinksFactoryBean> getWebMvcEntityLinksInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ControllerEntityLinksFactoryBean>forFactoryMethod(WebMvcEntityLinksConfiguration.class, "webMvcEntityLinks", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcEntityLinksConfiguration.class).webMvcEntityLinks(args.get(0)));
  }

  /**
   * Get the bean definition for 'webMvcEntityLinks'
   */
  public static BeanDefinition getWebMvcEntityLinksBeanDefinition() {
    Class<?> beanType = ControllerEntityLinksFactoryBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getWebMvcEntityLinksInstanceSupplier());
    return beanDefinition;
  }
}

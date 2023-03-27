package org.springframework.data.web.config;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.data.web.PagedResourcesAssemblerArgumentResolver;

/**
 * Bean definitions for {@link HateoasAwareSpringDataWebConfiguration}
 */
public class HateoasAwareSpringDataWebConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'pagedResourcesAssembler'.
   */
  private static BeanInstanceSupplier<PagedResourcesAssembler> getPagedResourcesAssemblerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PagedResourcesAssembler>forFactoryMethod(HateoasAwareSpringDataWebConfiguration.class, "pagedResourcesAssembler")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HateoasAwareSpringDataWebConfiguration.class).pagedResourcesAssembler());
  }

  /**
   * Get the bean definition for 'pagedResourcesAssembler'
   */
  public static BeanDefinition getPagedResourcesAssemblerBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClass(PagedResourcesAssembler.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPagedResourcesAssemblerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pagedResourcesAssemblerArgumentResolver'.
   */
  private static BeanInstanceSupplier<PagedResourcesAssemblerArgumentResolver> getPagedResourcesAssemblerArgumentResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PagedResourcesAssemblerArgumentResolver>forFactoryMethod(HateoasAwareSpringDataWebConfiguration.class, "pagedResourcesAssemblerArgumentResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HateoasAwareSpringDataWebConfiguration.class).pagedResourcesAssemblerArgumentResolver());
  }

  /**
   * Get the bean definition for 'pagedResourcesAssemblerArgumentResolver'
   */
  public static BeanDefinition getPagedResourcesAssemblerArgumentResolverBeanDefinition() {
    Class<?> beanType = PagedResourcesAssemblerArgumentResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPagedResourcesAssemblerArgumentResolverInstanceSupplier());
    return beanDefinition;
  }
}

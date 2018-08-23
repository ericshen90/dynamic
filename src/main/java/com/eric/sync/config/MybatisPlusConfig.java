package com.eric.sync.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置
 *
 * @author EricShen
 * @date 2018-08-22
 */
@Configuration
public class MybatisPlusConfig {

  /**
   * 分页插件
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    return new PaginationInterceptor();
  }

  /**
   * 相当于顶部的：
   * {@code @MapperScan("com.baomidou.springboot.mapper*")}
   * 这里可以扩展，比如使用配置文件来配置扫描Mapper的路径
   */
  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
    scannerConfigurer.setBasePackage("com.eric.sync.mapper*");
    return scannerConfigurer;
  }

  /**
   * 性能分析拦截器，不建议生产使用
   */
  @Bean
  public PerformanceInterceptor performanceInterceptor(){
    return new PerformanceInterceptor();
  }
}

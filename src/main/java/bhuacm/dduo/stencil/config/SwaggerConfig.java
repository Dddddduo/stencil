package bhuacm.dduo.stencil.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi defaultApi() {
        return GroupedOpenApi.builder()
                .group("default-group")
                .displayName("API文档")
                .pathsToMatch("/**") // 匹配所有API路径，可按需调整
                .build();
    }
}
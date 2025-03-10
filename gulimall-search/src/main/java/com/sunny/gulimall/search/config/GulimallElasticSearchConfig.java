package com.sunny.gulimall.search.config;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.nio.protocol.HttpAsyncResponseConsumer;
import org.elasticsearch.client.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * GulimallElasticSearchConfig
 *
 * @Author JackLi 2025/3/10 23:27
 */
@SpringBootConfiguration
public class GulimallElasticSearchConfig {
    public static final RequestOptions COMMON_OPTIONS;

    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
//        builder.addHeader("Authorization", "Bearer " + TOKEN);
//        builder.setHttpAsyncResponseConsumerFactory(
//                new HttpAsyncResponseConsumerFactory
//                .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));

        COMMON_OPTIONS = builder.build();
    }
    @Bean
    public RestHighLevelClient esRestHighLevelClient() {
        RestClientBuilder builder =
                RestClient.builder(new HttpHost("127.0.0.1", 9200, "http"));
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(builder);

        return restHighLevelClient;
    }

}

package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> route(UserHandler handler) {
        return RouterFunctions
                .route(GET("/routeUsers").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/routeUser/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/routeUser").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(DELETE("/routeUser/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}

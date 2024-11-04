package co.edu.unbosque.sw2.Gateway.Filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class StoreFilter implements GlobalFilter {
    private static final Logger logger = LoggerFactory.getLogger(StoreFilter.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Request to: " + exchange.getRequest().getPath());
        return chain.filter(exchange);
    }
}

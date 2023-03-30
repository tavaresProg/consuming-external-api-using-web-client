package com.tavaresProg.webclientstudies.service;

import com.tavaresProg.webclientstudies.model.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiService {

    @Autowired
    private WebClient webClient;

    public ApiModel getNumberTriviaService(int number) {

        Mono<ApiModel> numbersAPIMono =
                this.webClient
                        .method(HttpMethod.GET)
                        .uri("/{number}/trivia", number)
                        .retrieve()
                        .bodyToMono(ApiModel.class);
        ApiModel numbersAPI = numbersAPIMono.block();
        return numbersAPI;
    }

    public ApiModel getNumberTriviaWithMathService(int number) {

        Mono<ApiModel> numbersAPIMono =
                this.webClient
                        .method(HttpMethod.GET)
                        .uri("/{number}/math", number)
                        .retrieve()
                        .bodyToMono(ApiModel.class);

        ApiModel numbersAPI = numbersAPIMono.block();
        return numbersAPI;
    }

    public ApiModel getNumberYearService(int number) {

        Mono<ApiModel> numbersAPIMono =
                this.webClient
                        .method(HttpMethod.GET)
                        .uri("/{number}/year", number)
                        .retrieve()
                        .bodyToMono(ApiModel.class);

        ApiModel numbersAPI = numbersAPIMono.block();
        return numbersAPI;
    }


}

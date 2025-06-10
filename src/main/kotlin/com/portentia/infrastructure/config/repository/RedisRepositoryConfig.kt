package com.portentia.infrastructure.config.repository

import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@Configuration
@EnableRedisRepositories(
    basePackages = ["com.portentia.infrastructure.security.jwt.repository"]
)
class RedisRepositoryConfig
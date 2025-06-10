package com.portentia.infrastructure.security.jwt.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed

@RedisHash(value = "refresh_token")
class RefreshTokenEntity(
    loginId: String,
    token: String,
    ttl: Long
) {
    @Id
    var loginId: String = loginId
        protected set

    @Indexed
    var token: String = token
        protected set

    @TimeToLive
    var ttl: Long = ttl
        protected set
}
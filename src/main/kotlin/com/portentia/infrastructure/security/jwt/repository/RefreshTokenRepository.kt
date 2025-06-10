package com.portentia.infrastructure.security.jwt.repository

import com.portentia.infrastructure.security.jwt.entity.RefreshTokenEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RefreshTokenRepository : CrudRepository<RefreshTokenEntity, String>
package com.portentia.adapter.out.persistence.user.repository

import com.portentia.infrastructure.persistence.user.UserJpaEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserJpaRepository : JpaRepository<UserJpaEntity, UUID>
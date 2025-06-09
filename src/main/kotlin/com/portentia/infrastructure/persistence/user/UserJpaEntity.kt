package com.portentia.infrastructure.persistence.user

import com.portentia.domain.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.util.UUID

@Entity(name = "tbl_user")
class UserJpaEntity(
    id: UUID?,
    userName: String,
    loginId: String,
    email: String?,
    avatarUrl: String
) : BaseUUIDEntity(id) {
    @Column(name = "userName", nullable = false)
    var userName: String = userName
        protected set

    @Column(name = "login_id", nullable = false, unique = true)
    var loginId: String = loginId
        protected set

    @Column(name = "email", unique = true)
    var email: String? = email
        protected set

    @Column(name = "avatar_url", nullable = false)
    var avatarUrl: String = avatarUrl
        protected set
}
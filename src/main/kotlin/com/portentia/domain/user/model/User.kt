package com.portentia.domain.user.model

import java.util.UUID

data class User(
    val id: UUID?,
    val userName: String,
    val loginId: String,
    val email: String,
    val avatarUrl: String
)

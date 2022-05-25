package com.learning.ddd

import java.util.*

class UserId(private val email: String?,
             private val phoneNumber: String? )

data class User(
    private val id: String = UUID.randomUUID().toString(),
    private val userId: UserId?,
     val firstName: String?,
    private val lastName: String?,
    private val isActive: Boolean = false
)
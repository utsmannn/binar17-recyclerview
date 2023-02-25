package com.binar.recyclerview

import java.util.UUID

data class Cat(
    val id: String = UUID.randomUUID().toString(),
    val url: String
)
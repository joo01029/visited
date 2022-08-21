package com.hello.visited.data

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass

abstract class BaseEntity {

    @CreationTimestamp
    @Column(name = "REGISTERDT", updatable = false)
    val createdAt: LocalDateTime? = null

    @UpdateTimestamp
    @Column(name = "MODIFIEDDT")
    val updatedAt: LocalDateTime? = null
}

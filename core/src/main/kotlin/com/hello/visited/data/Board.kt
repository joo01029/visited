package com.hello.visited.data

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Board (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false)
    val title: String,
    @Column(nullable = false)
    val content: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User
    ): BaseEntity()
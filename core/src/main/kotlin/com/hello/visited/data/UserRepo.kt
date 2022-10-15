package com.hello.visited.data

import org.springframework.data.jpa.repository.JpaRepository
interface UserRepo : JpaRepository<User, Long> {
    fun findByName(name: String): User?
}

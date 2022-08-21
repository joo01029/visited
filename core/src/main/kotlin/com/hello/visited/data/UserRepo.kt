package com.hello.visited.data

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

interface UserRepo : CrudRepository<User, Long> {
    fun findByName(name:String):User?
}
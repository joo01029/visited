package com.hello.visited.user.domain

import com.hello.visited.data.Board
import com.hello.visited.data.User
import com.hello.visited.data.UserRepo
import org.springframework.stereotype.Component

@Component
class UserImpl  (
    private val userRepo: UserRepo
) {
    fun getUser(userName:String):User?{
        return userRepo.findByName(userName)
    }

    fun saveUser(userName: String) : User{
        val user = User(name = userName, boards = mutableListOf<Board>())
        return userRepo.save(user)
    }
}
package com.hello.visited.user.domain

import com.hello.visited.data.User
import com.hello.visited.data.UserRepo
import org.springframework.stereotype.Component

@Component
class UserImpl  (
    private val userRepo: UserRepo
        ) {
    fun getUser(userName:String):User{
        var user : User? =  userRepo.findByName(userName)
        if(user == null){
            user = User(name = userName, boards = mutableListOf())
            user = userRepo.save(user)
        }
        return user
    }
}
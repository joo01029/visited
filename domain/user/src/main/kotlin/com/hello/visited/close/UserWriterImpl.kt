package com.hello.visited.close

import com.hello.visited.data.Board
import com.hello.visited.data.User
import com.hello.visited.data.UserRepo
import com.hello.visited.open.UserWriter
import com.hello.visited.open.inputs.UserSource
import org.springframework.stereotype.Component

@Component
class UserWriterImpl (
    private val userRepo: UserRepo
) :UserWriter {
    override fun saveUser(userSource: UserSource) : User {
        val user = User(name = userSource.name, boards = mutableListOf<Board>())
        return userRepo.save(user)
    }
}
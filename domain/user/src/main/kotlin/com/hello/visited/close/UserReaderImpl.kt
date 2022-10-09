package com.hello.visited.close

import com.hello.visited.data.User
import com.hello.visited.data.UserRepo
import com.hello.visited.open.UserReader
import com.hello.visited.open.inputs.UserSource
import org.springframework.stereotype.Component

@Component
class UserReaderImpl (
    private val userRepo: UserRepo
) : UserReader {
    override fun getUser(userSource: UserSource): User?{
        return userRepo.findByName(userSource.name)
    }

}
package com.hello.visited.open

import com.hello.visited.data.User
import com.hello.visited.open.inputs.UserSource

interface UserWriter {
    fun saveUser(userSource: UserSource) : User
}
package com.hello.visited.open

import com.hello.visited.board.domain.MakeBoardSource
import com.hello.visited.data.User
import com.hello.visited.open.inputs.UserSource

interface BoardWriter {
    fun saveBoard(board: MakeBoardSource, userSource: UserSource)
}
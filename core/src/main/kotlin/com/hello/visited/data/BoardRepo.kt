package com.hello.visited.data

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepo : CrudRepository<Board, Long> {
}
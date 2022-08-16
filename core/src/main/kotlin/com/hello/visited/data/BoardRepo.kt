package com.hello.visited.data

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepo : JpaRepository<Board, Long> {
}
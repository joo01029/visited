package com.hello.visited.response

class DefaultResponse<S> {
    val result: ResultType
    val data: S?
    val error: String?

    constructor(data: S) {
        this.result = ResultType.SUCCESS
        this.data = data
        this.error = null
    }

    constructor(result: ResultType, data: S? = null, error: String? = null) {
        this.result = result
        this.data = data
        this.error = error
    }

    companion object {
        fun <S> success(): DefaultResponse<S> {
            return DefaultResponse(ResultType.SUCCESS)
        }

        fun <S> success(data: S): DefaultResponse<S> {
            return DefaultResponse(data)
        }

        fun <S> error(): DefaultResponse<S> {
            return DefaultResponse(ResultType.ERROR)
        }

        fun <S> error(error: String): DefaultResponse<S> {
            return DefaultResponse(result = ResultType.ERROR, error = error)
        }
    }
}

enum class ResultType {
    SUCCESS,
    ERROR
}

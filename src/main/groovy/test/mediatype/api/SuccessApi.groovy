package test.mediatype.api

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import test.mediatype.dto.MyResponse

interface SuccessApi {
    @Post
    MyResponse successCall(@Body Map<String, String> payload)
}
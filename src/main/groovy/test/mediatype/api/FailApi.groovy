package test.mediatype.api

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import test.mediatype.dto.MyResponse

interface FailApi {
    @Post
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    MyResponse failCall(@Body Map<String, String> payload)
}
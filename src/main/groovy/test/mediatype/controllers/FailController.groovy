package test.mediatype.controllers

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import test.mediatype.api.FailApi
import test.mediatype.dto.MyResponse

@Controller("/fail")
class FailController implements FailApi {

    @Override
    MyResponse failCall(@Body Map<String, String> payload) {
        new MyResponse(
                result: payload.collect { it.value }.join(' ')
        )
    }
}
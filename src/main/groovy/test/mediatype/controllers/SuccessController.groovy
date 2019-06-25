package test.mediatype.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Produces
import test.mediatype.api.SuccessApi
import test.mediatype.dto.MyResponse

@Controller("/success")
class SuccessController implements SuccessApi {

    @Override
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    MyResponse successCall(@Body Map<String, String> payload) {
        new MyResponse(
                result: payload.collect { it.value }.join(' ')
        )
    }
}
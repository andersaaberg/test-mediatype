package test.mediatype.clients

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Produces
import io.micronaut.http.client.annotation.Client
import test.mediatype.api.SuccessApi

@Client('/success')
@Produces(MediaType.APPLICATION_FORM_URLENCODED) // different from SuccessController
interface SuccessClient extends SuccessApi {

}
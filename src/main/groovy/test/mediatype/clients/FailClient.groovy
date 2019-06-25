package test.mediatype.clients

import io.micronaut.http.client.annotation.Client
import test.mediatype.api.FailApi

@Client('/fail')
interface FailClient extends FailApi {

}
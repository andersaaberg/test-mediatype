package test.mediatype.controllers

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import test.mediatype.clients.FailClient
import test.mediatype.clients.SuccessClient
import test.mediatype.dto.MyResponse

import javax.inject.Inject


@MicronautTest
class ControllerSpec extends Specification {

    @Inject
    SuccessClient successClient

    @Inject
    FailClient failClient

    void "test fail"() {
        when:
        MyResponse myResponse = failClient.failCall([foo: 'Hello', bar: 'World'])

        then:
        myResponse.result == 'Hello World'
    }

    void "test success"() {
        when:
        MyResponse myResponse = successClient.successCall([foo: 'Hello', bar: 'World'])

        then:
        myResponse.result == 'Hello World'
    }
}

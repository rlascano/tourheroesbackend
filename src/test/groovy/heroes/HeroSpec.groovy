package heroes

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class HeroSpec extends Specification implements DomainUnitTest<Heroe> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

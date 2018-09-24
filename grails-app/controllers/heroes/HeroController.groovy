package heroes


import grails.rest.*
import grails.converters.*
import groovy.transform.CompileStatic

@CompileStatic
class HeroController extends RestfulController {
    static responseFormats = ['json', 'xml']
    HeroController() {
        super(Hero)
    }

    @Override
    def index(Integer max) {
      params.max = Math.min(max ?: 10, 100)
      if(params.name) {
        def name = params.name
        def c = Hero.createCriteria()
        def results = c.list {
          ilike("name", "${name}%" )
        }
        respond results
      }
      else {
        respond Hero.list()
      }
    }
}

package heroes

class BootStrap {

    def init = { servletContext ->
      new Hero(name:'Mr. Nice').save()
      new Hero(name:'Narco').save()
      new Hero(name:'Bombasto').save()
      new Hero(name:'Celeritas').save()
      new Hero(name:'Magneta').save()
      new Hero(name:'RubberMan').save()
      new Hero(name:'Dynama').save()
      new Hero(name:'Dr IQ').save()
      new Hero(name:'Magma').save()
      new Hero(name:'Tornado').save()
    }
    def destroy = {
    }
}

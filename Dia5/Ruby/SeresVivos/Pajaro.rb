require_relative "Volador"

class Pajaro < SerVivo
    include Volador

    def initialize(nombre)
        super(nombre)
    end

    def mover()
        "El pajaro #{@nombre} " + volar()
    end
end
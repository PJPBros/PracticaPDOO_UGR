require_relative "Volador"
require_relative "Nadador"

class Pato < SerVivo
    include Volador
    include Nadador

    def initialize(nombre)
        super(nombre)
    end

    def mover()
        "El pato #{@nombre} " + volar() + " y " + nadar()
    end
end
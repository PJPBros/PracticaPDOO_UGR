class Gato < Animal

    def initialize(nombre, edad)
        super(nombre, edad)
    end

    def hacer_ruido()
        "Soy #{@nombre}, tengo #{@edad}. Miau!"
    end
end
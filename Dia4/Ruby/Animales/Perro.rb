class Perro < Animal

    def initialize(nombre, edad)
        super(nombre, edad)
    end

    def hacer_ruido()
        "Soy #{@nombre}, tengo #{@edad}. Guau!"
    end
end
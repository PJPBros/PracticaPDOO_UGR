class Pajaro < Animal

    def initialize(nombre, edad)
        super(nombre, edad)
    end

    def hacer_ruido()
        "Soy #{@nombre}, tengo #{@edad}. Sonido de pajaro.mp3!"
    end
end
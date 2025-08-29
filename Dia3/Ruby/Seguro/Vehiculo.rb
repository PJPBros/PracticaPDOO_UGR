class Vehiculo
    MAXSPEED = 200
    MINSPEED = 0

    attr_reader :matricula, :velocidad

    def matricula=(valor)
        if valor.empty?
            raise ArgumentError, "La matricula no puede estar vacia"
        end

        @matricula = valor
    end

    def velocidad=(valor)
        if valor < 0
            raise ArgumentError, "La velocidad no puede ser negativa"
        end

        @velocidad = valor
    end

    def initialize(matricula, velocidad)
        self.matricula = matricula
        self.velocidad = velocidad
    end

    def acelerar(incremento)
        @velocidad += incremento

        if @velocidad > MAXSPEED
            self.velocidad = MAXSPEED
        end
    end

    def frenar(decremento)
        @velocidad -= decremento

        if @velocidad < MINSPEED
            self.velocidad = MINSPEED
        end
    end

end
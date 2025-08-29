class Pokemon
    attr_accessor :nombre, :tipo, :nivel

    def nombre=(nombre)
        if !nombre.is_a?(String) || nombre.strip.empty?
            raise ArgumentError, "El nombre de un pokemon no puede estar vacio" 
        end

        @nombre = nombre
    end

    def tipo=(tipo)
        if !tipo.is_a?(String) || tipo.strip.empty?
            raise ArgumentError, "El tipo de un pokemon no puede estar vacio" 
        end

        @tipo = tipo
    end

    def nivel=(nivel)
        if !nivel.is_a?(Integer) || nivel < 1
            raise ArgumentError, "El nivel de un pokemon debe ser mayor o igual a uno"
        end

        @nivel = nivel
    end

    def initialize(nombre, tipo, nivel)
        self.nombre = nombre
        self.tipo = tipo
        self.nivel = nivel
    end

    def subirNivel()
        @nivel += 1
    end

    def to_s()
       return "#{@nombre} (#{@tipo}, Nivel: #{@nivel})"
    end

    
end
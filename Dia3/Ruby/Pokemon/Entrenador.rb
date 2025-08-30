class Entrenador 
    attr_accessor :nombre, :pokemons

    def nombre=(nombre)
        if !nombre.is_a?(String) || nombre.strip.empty?
            raise ArgumentError, "El nombre del entrenador no debe estar vacio y ser texto"
        end

        @nombre = nombre
    end

    def initialize(nombre)
        self.nombre = nombre
        @pokemons = []
    end

    def capturar(pokemon)
        @pokemons.push(pokemon)
    end

    def listarPokemons()
        cad = "#{@nombre}: \n"
        for pokemon in @pokemons
            cad += pokemon.to_s + "\n"
        end
        return cad
    end

    def buscarTipo(tipo)
        encontrados = []
        cad = ""

        for pokemon in @pokemons
            if pokemon.tipo == tipo
                encontrados.push(pokemon)
            end
        end

        for i in 0..encontrados.size
            cad += encontrados[i].to_s + "\n"
        end

        return cad
        
    end
end


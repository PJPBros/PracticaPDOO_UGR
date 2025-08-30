#Clase abstracta

class Animal
    attr_reader :nombre, :edad

    def nombre=(nombre)
        if !nombre.is_a?(String) || nombre.strip.empty?
            raise ArgumentError, "El nombre de un animal debe ser una cadena y no estar vacia"
        end

        @nombre = nombre
    end

    def edad=(edad)
        if !edad.is_a?(Integer) || edad < 0
            raise ArgumentError, "La edad debe ser un entero postivo"
        end

        @edad = edad
    end

    def initialize(nombre, edad)
        if self.class != Animal
            self.nombre = nombre
            self.edad = edad
        else
            raise NotImplementedError, "No se puede construir un Animal (abstracto)"
        end
        
    end

    def hacer_ruido()
        raise NotImplementedError, "Este metodo debe ser implementado en una subclase"
    end
end
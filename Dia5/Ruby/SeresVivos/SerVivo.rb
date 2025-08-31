#Clase abstracta
class SerVivo 
    attr_reader :nombre

    def nombre=(nombre)
        if !nombre.is_a?(String) || nombre.strip.empty?
            raise ArgumentError, "El nombre no debe estar vacio"
        end
        @nombre = nombre
    end

    def initialize(nombre)
        if self.class == SerVivo
            raise NotImplementedError, "No se puede instanciar un SerVivo"
        else
            @nombre = nombre
        end
        
    end

    def mover()
        raise NotImplementedError, "El metedo se debe hacer un las subclases"
    end

    
end
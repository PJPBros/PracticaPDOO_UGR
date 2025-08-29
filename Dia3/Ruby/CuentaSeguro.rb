class CuentaSeguro
    attr_reader :numeroPoliza, :importe

    def numeroPoliza=(numeroPoliza)
        if numeroPoliza.strip.empty?
            raise ArgumentError, "El nombre de la poliza no puede estar vacio"    
        end

        @numeroPoliza = numeroPoliza

    end

    def importe=(importe)
        if importe < 0
            raise ArgumentError, "El importe de la poliza no puede ser negativo"    
        end

        @importe = importe
    end

    def initialize(numeroPoliza, importe)
        self.numeroPoliza = numeroPoliza
        self.importe = importe
    end

    def to_s()
        "Poliza nº: #{numeroPoliza}, Importe: #{importe}"
    end

end
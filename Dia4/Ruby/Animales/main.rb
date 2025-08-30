require_relative "animal"
require_relative "perro"
require_relative "gato"
require_relative "pajaro"

animales = []

perro = Perro.new("PerroPosible", 5)
gato = Gato.new("GatoPosible", 2)
pajaro2 = Pajaro.new("Pajaro2", 3)
pajaro1 = Pajaro.new("Pajaro1", 3)
gatoTonto = Gato.new("GatoTOnto", 2)

animales << perro << gato << pajaro1 << pajaro2 << gatoTonto

for i in 0..animales.size - 1
    puts animales[i].hacer_ruido()
end
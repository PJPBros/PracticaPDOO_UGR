require_relative "Pokemon"
require_relative "Entrenador"

entrenador = Entrenador.new("Pedro")

pokemon1 = Pokemon.new("Bulbasaur", "Planta", 5)
pokemon2 = Pokemon.new("Pikachu", "Electrico", 7)

entrenador.capturar(pokemon1)
entrenador.capturar(pokemon2)

puts entrenador.listarPokemons()
puts
puts "Pokemons tipo Planta"
puts entrenador.buscarTipo("Planta")


require_relative "SerVivo"
require_relative "Pajaro"
require_relative "Pato"

pajaro = Pajaro.new("Paqui")
puts pajaro.mover()
pato = Pato.new("Donald")
puts pato.mover()
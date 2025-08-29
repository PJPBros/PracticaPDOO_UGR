require_relative 'CuentaSeguro'
require_relative 'Vehiculo'


cuenta = CuentaSeguro.new("2020",5)
puts cuenta.to_s
cuenta.importe = 3
cuenta.numeroPoliza = "Pedro Joya"
puts cuenta.to_s

vehiculo = Vehiculo.new("PEDROCAR", 140)
puts vehiculo.velocidad
vehiculo.acelerar(300)
puts vehiculo.velocidad
vehiculo.frenar(400)
puts vehiculo.velocidad


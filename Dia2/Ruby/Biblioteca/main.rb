#MAIN

require_relative 'libro'

print("Introduce el nombre del libro: ")
title = gets.chomp
print("Introduce el id del libro: ")
id = gets.chomp
print("Introduce el año del libro: ")
year = gets.chomp
print("Introduce el autor del libro: ")
autor = gets.chomp


libro = Libro.new(title,id,year,autor)

puts libro.to_string
puts libro.autor



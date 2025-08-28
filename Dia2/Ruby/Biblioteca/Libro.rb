class Libro 
  attr_accessor :title, :id, :year, :autor

  def initialize(title, id, year, autor)
    @title = title
    @id = id
    @year = year
    @autor = autor
  end

  def to_string()
    return "Titulo: #{@title} | Año: #{@year} | Autor: #{@autor} "
  end
end
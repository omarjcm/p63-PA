import re

# texto de entrada
becquer = """Podrá nublarse el sol eternamente; 
Podrá secarse en un instante el mar; 
Podrá romperse el eje de la tierra 
como un débil cristal. 
¡todo sucederá! Podrá la muerte 
cubrirme con su fúnebre crespón; 
Pero jamás en mí podrá apagarse 
la llama de tu amor.
"""

# dividir donde no se encuentre un caracter alfanumerico
patron = re.compile(r'\W+')
palabras = patron.split( becquer )

print(palabras[:10])

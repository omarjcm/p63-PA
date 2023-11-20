import re

# URL: https://relopezbriega.github.io/blog/2015/07/19/expresiones-regulares-con-python/

# texto de entrada
becquer = """Podrá nublarse el sol eternamente; 
Podrá secarse en un instante el mar; 
Podrá romperse el eje de la tierra 
como un débil cristal. 
¡todo sucederá! Podrá la muerte 
cubrirme con su fúnebre crespón; 
Pero jamás en mí podrá apagarse 
la llama de tu amor."""

# dividir donde no se encuentre un caracter alfanumerico
patron = re.compile(r'\W+')
palabras = patron.split( becquer )

print(palabras[:10])
#print(palabras[3:10])
#print(palabras[3:])

palabras = re.split('\n', becquer)
print(palabras)

palabras = patron.split(becquer, 5)
print(palabras)

podra = re.compile(r'\b(P|p)odrá\b')
puede = podra.sub('Puede', becquer)
print(puede)

puede = podra.sub('Puede', becquer, 1)
print(puede)

print(re.findall(r'\bPodrá\b', becquer))
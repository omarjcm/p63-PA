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

podra = re.compile(r'podrá\b', re.IGNORECASE)
puede = podra.sub('puede', becquer)
print(puede)

correos = """guillermo-pizarro@gmail.com, raul.lopez@relopezbriega.com, Raul Lopez Briega,
foo bar, relopezbriega@relopezbriega.com.edu.ar, raul@github.io, 
https://relopezbriega.com.ar, https://relopezbriega.github.io, 
python@python, river@riverplate.com.ar, pythonAR@python.pythonAR
"""

mail = re.compile(r"""
\b
[\w.]
+@
[\w.]
+\.
[a-zA-Z]{2,6}
\b
""", re.X)
mails = mail.findall(correos)
print(mails)

# METACARACTERES DELIMITADORES
# ^     inicio de linea
# $     fin de linea
# \A    inicio de texto
# \Z    fin de texto
# .     cualquier caracter en linea
# \b    encuentra limite de palabra
# \B    encuentra distitnot al limite de palabra

# METACARACTERES CLASES PREDEFINIBAS
# \w    un caracter alfanumerico (incluye _)
# \W    un caracter NO alfanumerico
# \d    un caracter digito
# \D    un caracter no numerico
# \s    cualquier espacio (lo mismo que \t\n\r\f)
# \S    un no espacio

# METACARACTERES ITERADORES
# *     {0,}
# +     {1,}
# ?     cero o uno
# {n}   exactamente n veces
# {n,}  por lo menos n veces
# {n,m} por lo menos n pero no más de m veces.
# *?    cero o mas, similar a {0,}?
# +?    {1,}?
# ??    {0,1}?
# {n}?
# {n, }?
# {n},m?

# Validando una fecha
fecha = re.compile(r'^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\d\d)')
# 20/11/2023

print( fecha.search('31/02/2023') )
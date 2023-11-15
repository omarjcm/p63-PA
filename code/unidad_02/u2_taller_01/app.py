import re

# URL: https://relopezbriega.github.io/blog/2015/07/19/expresiones-regulares-con-python/

pattern = re.compile(r'\bPyWombat\b')

# MATCH - Determina si la regex tiene coincidencias en el comienzo del texto.
print(pattern.match('PyWombat Hola'))
print(pattern.match('Hola PyWombat'))

# SEARCH - Escanea todo el texto buscando cualquier ubicación donde haya una coincidencia.
print(pattern.search('PyWombat Hola'))
print(pattern.search('Hola PyWombat'))

# FINDALL - encuentra todos los subtextos donde haya una coincidencia y nos devuelve estas coincidencias como una lista.
print(pattern.findall('PyWombat Hola'))
print(pattern.findall('PyWombat HolaPyWombat'))
print(pattern.findall('PyWombat Hola PyWombat'))

# FINDITER - similar al anterior pero en lugar de devolvernos una lista nos devuelve un iterador.
a1 = pattern.finditer('PyWombat Hola')
a2 = pattern.finditer('PyWombat HolaPyWombat')
a3 = pattern.finditer('PyWombat Hola PyWombat')

print(next(a1))
print(next(a3))
print(next(a3))

import os
import re

ruta = 'texto2.txt'
print("Ruta del archivo:", ruta)

with open(ruta, 'r') as reader:
    for line in reader.readlines():
        ipsum = re.compile(r'\bipsum\b')
        ten_cuidado = ipsum.sub('Ten cuidado', line)
        print(ten_cuidado)


#!/usr/bin/bash
if [ $# -eq 0 ]; then 
	echo "Produce un comentario de bloque con extensión total de 80 líneas"
	echo "USO: $0 texto_a_comentar"; exit; 
fi

echo '/*'
echo "$1" | fold -sw 77 | sed s/'^'/' * '/g
echo ' */'

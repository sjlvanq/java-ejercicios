#!/usr/bin/bash
if [ $# -eq 0 ]; then 
	echo "USO: $0 fichero-de-clase"; exit; 
fi
if [ ! -w $1 ]; then 
	echo "Sin permisos de escritura en el fichero"; exit; 
fi

nombre_fichero=$( ctags -f - --Java-kinds=c | awk '{print $1}').java
echo -n "¿Proceder con: $1 --> $nombre_fichero ? (y/N) "
read -n 1 input; 
if [ \( $input == 'y' \) -o \( $input == 'Y' \) ]; then 
	mv $1 $nombre_fichero
	echo -e "\nHecho"; exit
fi;
echo -e "\nOk"

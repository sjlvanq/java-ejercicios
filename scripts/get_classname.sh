#!/usr/bin/bash
if [ $# -eq 0 ]; then 
	echo "USO: $0 fichero-de-clase"; exit; 
fi

nombre_clase=$(egrep -o 'public class ([a-zA-Z0-9_]*)' $1 | awk '{print $3}')
echo $nombre_clase

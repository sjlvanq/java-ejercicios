#!/usr/bin/bash
if [ $# -eq 0 ]; then 
	echo "USO: $0 fichero-de-clase"; exit; 
fi

nombre_clase=$( ctags -f - --Java-kinds=c | awk '{print $3}')
echo $nombre_clase

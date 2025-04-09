#!/bin/env bash
set -e

usage() {
  cat <<EOF
Uso: $(basename "${BASH_SOURCE[0]}") [-h] nombre_archivo
EOF
  exit
}

if [ $# -eq 0 ] || [ $1 = '-h' ]; then usage; fi
if [ ! -f $1 ]; then echo "Fichero inexistente"; usage; fi

ctags -x $1 | sed -E 's/[[:space:]]+/\;/g' | awk -F ';' '{
	if ($2 == "field")
	{
		attrib=$1
		attribcaps=toupper(substr(attrib,1,1))substr(attrib,2,length(attrib))
		type=$(NF-2)
		print "public void","set"attribcaps"(",type,attrib,") {"
		print "\tthis."attrib,"=",attrib";"
		print "}"
	}
}'


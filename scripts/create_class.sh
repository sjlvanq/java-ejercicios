#!/bin/env bash
set -e

usage() {
  cat <<EOF
Uso: $(basename "${BASH_SOURCE[0]}") [-h] nombre_clase
EOF
  exit
}

if [ $# -eq 0 ] || [ $1 = '-h' ]; then usage; fi
tee ${1^}.java <<EOF
//import 

public class ${1^}
{
	public static void main (String[] args)
	{
		//code
	}
}
EOF


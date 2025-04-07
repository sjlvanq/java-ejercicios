#!/bin/env bash
set -e

usage() {
  cat <<EOF
Uso: $(basename "${BASH_SOURCE[0]}") [-h] nombre_clase
EOF
  exit
}

if [ $# -eq 0 ] || [ $1 = '-h' ]; then usage; fi

nombrefmt=$(echo ${1^} | sed s/"\.java$"//I | tr -dC '![:alnum:]');

tee $nombrefmt.java <<EOF
//import 

public class $nombrefmt
{
	public static void main (String[] args)
	{
		//code
	}
}
EOF


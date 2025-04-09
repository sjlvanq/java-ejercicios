#!/bin/env bash
set -e

usage() {
  cat <<EOF
Uso: $(basename "${BASH_SOURCE[0]}") [-h] [-main] nombre_clase
EOF
  exit
}

if [ $# -eq 0 ] || [ $1 = '-h' ]; then usage; fi

nombre=${!#}
nombrefmt=$(echo ${nombre^} | sed s/"\.java$"//I | tr -dC '![:alnum:]');

if [ "$1" = "-main" ]; then
	main_method=$(cat << 'EOF'
	public static void main (String[] args)
	{
		//code
	}
EOF
	);
fi

tee $nombrefmt.java <<EOF
public class $nombrefmt
{
$main_method
}
EOF


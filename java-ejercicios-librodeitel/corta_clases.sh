#!/usr/bin/bash

total_lineas=$(wc -l < deitel.txt)
separadores=`egrep -n '\/\/ [a-zA-Z.]+ [0-9]+\.[0-9]+' deitel.txt | awk -F ':' '{printf $1","}'`; 
separadores=${separadores%?};

IFS=',' read -ra aseparadores <<< "$separadores"

for ((i=0; i<${#aseparadores[@]}; i++)); do
    start=${aseparadores[$i]}
    end=$((aseparadores[$((i+1))]-1))
    if [ $end = -1 ]; then
        end=$((total_lineas+1))
    fi
    
    fichero_salida=`awk -F ':' 'NR=='$start' {print $2}' deitel.txt | sed 's/^ *//'`
    echo $start,$end,$fichero_salida

    vim -c ":${start},${end}w $fichero_salida" -c ":q" deitel.txt
done

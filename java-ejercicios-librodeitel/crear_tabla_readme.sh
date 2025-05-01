
#!/usr/bin/bash
echo '| Rev. | Clase | Ref. |'
echo '| ---   | ---  | ---      |'
egrep -n '\/\/ [a-zA-Z.]+ [0-9]+\.[0-9]+' deitel.txt | awk -F ':' '{print "|[ ]|["$3"]("$3")\t|"$2"\t|" }'; 


/*************************************************************
* BinarySearch.java
* Dean & Dean
*
* Esto usa recursión para encontrar el índice de un valor objetivo en un arreglo
* ordenado en forma ascendente. Si no se encuentra, el resultado es -1.
*************************************************************/
public class BinarySearch
{
public static int binarySearch(
int[] arr, int first, int last, int target)
{
int mid;
int index;
System.out.printf("first=%d, last=%d\n", first, last);
if (first == last)
// condición de detención
{
if (arr[first] == target)
{
index = first;
System.out.println("found");
}
else
{
index = -1;
System.out.println("not found");
}
}
else
// continuar la recursión
{
mid = (last + first) / 2;
if (target > arr[mid])
{
first = mid + 1;
}
else
{
last = mid;
}
index = binarySearch(arr, first, last, target);
System.out.println("returnedValue=" + index);
}
return index;
} // end binarySearch
} // end BinarySearch class

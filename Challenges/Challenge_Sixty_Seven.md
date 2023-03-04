Write the code for the function printARGB(). It reads 4 integers from stdin divided by spaces. They denote the Alpha, Red, Green, and Blue values respectively, and each should be in the range 0-255.

If any value is out of range, then the function should print "Invalid input".

If everything is within range, then a Color instance should be created with the provided data and its ARGB value should be printed.

Note that the ARGB value is a 32-bit integer. If printed as it is, you may get a negative value. In order to avoid this, the ARGB value should first be converted to Unsigned Integer (UInt).

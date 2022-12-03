GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.

Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered string. Your program should be case independent.

For example, in the string "acggtgttat" the percentage of characters G and C equals to 4/10 * 100 = 40.0

, where 4 is the number of symbols G and C, and 10 is the length of the string.

Note, answer should be double.

val i: Int = …
val j: Int = …
val result = i / j              // not correct, integer division
val result = i.toDouble() / j   // correct
Remember: characters are case-insensitive(g equals G and c equals C)

Input data format

The single input line contains a sequence.

Output data format

The percentage of G and C characters as a double. Do not round/format the value, output it as is.

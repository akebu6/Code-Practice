# Question

You have a sequence of integer numbers that ends with 0. Find the largest element of this sequence.

0 is not included in the sequence. It serves only as a sign of the sequence end.

# Solution
# I used C language for this Question

	#include <stdio.h>

	int largest(int arr[], int n)
	{
		int i;

		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < n; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	int main()
	{
		int arr[] = {10, 324, 45, 90, 0};
		int n = sizeof(arr)/sizeof(arr[0]);
		printf("Largest in given array is %d", largest(arr, n));
		return 0;
	}

# Output
test case: int arr[] = {10, 324, 45, 90, 0};
result: 324

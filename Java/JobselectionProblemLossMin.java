// Java implementation of the
// above approach
import java.util.*;
class GFG{

static void optimum_sequence_jobs(int[] V,
									double P)
{
	int j = 1, N = V.length - 1;
	double result = 0;

	// Create a min-heap
	// (priority queue)
	PriorityQueue<Integer> Queue =
				new PriorityQueue<>();

	// Add all goods to the Queue
	for (int i = 1; i <= N; i++)
	Queue.add(V[i]);

	// Pop Goods from Queue as
	// long as it is not empty
	while (!Queue.isEmpty())
	{
	// Print the good
	System.out.print(Queue.peek() +
					" ");

	// Add the Queue to the vector
	// so that total voulme can
	// be calculated
	V[j++] = Queue.peek();
	Queue.remove();
	}

	// Calclulating volume of goods
	// left when all are produced.
	// Move from right to left of
	// sequence multiplying each
	// volume by increasing powers
	// of 1 - P starting from 0
	for (int i = N; i >= 1; i--)
	result += Math.pow((1 - P),
						N - i) * V[i];

	// Print result
	System.out.printf("\n%.2f\n",
					result );
}

// Driver code
public static void main(String[] args)
{
// For implementation simplicity
// days are numbered from 1 to N.
// Hence 1 based indexing is used
int[] V = {-1, 3, 5, 4, 1,
			2, 7, 6, 8, 9, 10};

// 10% loss per day
double P = 0.10;

optimum_sequence_jobs(V, P);
}
}

// This code is contributed by Amit Katiyar

#include <stdio.h>

void twoSum(int nums[], int n, int target)
{
    int i, j;

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                printf("Output: [%d, %d]\n", i, j);
                return;
            }
        }
    }

    printf("No solution found.\n");
}

int main()
{
    int n, target;
    int i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int nums[n];

    printf("Enter the elements:\n");

    for (i = 0; i < n; i++)
    {
        scanf("%d", &nums[i]);
    }

    printf("Enter target: ");
    scanf("%d", &target);

    twoSum(nums, n, target);

    return 0;
}
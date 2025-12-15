import random
import time

N = int(input("N: "))  # number of items in array

running_time = 0
total_time = 0
# use a list comprehension. the randint is to put a limit on the random integers for the arrays
for i in range(1000):
    arr = [random.randint(0, 1000) for i in range(N)]
    # bubble sort the array
    start_time = time.perf_counter()  # START
    for i in range(len(arr)):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                # Swap
                t = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = t
    end_time = time.perf_counter()  # END
    running_time = end_time - start_time
    total_time = total_time + running_time
    print(arr)

print(total_time)
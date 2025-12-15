import random
import time

N = int(input("N: "))  # number of items in array

running_time = 0
total_time = 0
# use a list comprehension. the randint is to put a limit on the random integers for the arrays
for i in range(1000):
    arr = [random.randint(0, 1000) for i in range(N)]
    start_time = time.perf_counter()  # START
    # selection sort
    for i in range(len(arr)):
        minPos = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[minPos]:
                minPos = j
        if i != minPos:
            t = arr[minPos]
            arr[minPos] = arr[i]
            arr[i] = t
    end_time = time.perf_counter()  # END
    running_time = end_time - start_time
    total_time = total_time + running_time
    print(arr)

print(total_time)
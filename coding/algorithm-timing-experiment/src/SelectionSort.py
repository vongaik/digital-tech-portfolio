import random

arr = []

N = int(input("N: "))

for i in range(N):
    arr.append(random.randint(0, 501))

print(arr)

for i in range(len(arr)):
    minPos = i
    for j in range(i+1, len(arr)):
        if (arr[j] < arr[minPos]):
            minPos = j
    if i != minPos:
        t = arr[minPos]
        arr[minPos] = arr[i]
        arr[i] = t

print(arr)
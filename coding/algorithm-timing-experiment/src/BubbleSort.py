import random

arr = []

N = int(input("N: "))

for i in range(N):
    arr.append(random.randint(0, 501))

print(arr)

for i in range(len(arr)):
    for j in range(len(arr) - i - 1):
        if arr[j] > arr[j + 1]:
            # Swap
            t = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = t

print(arr)
def reverselist(A, start, end):
    while start< end:
        A[start], a[end] = A[end], A[start]
        start+=1
        end-=1
    return A
n = int(input(" Enter the number of elements "))
a = list(map(int,input("\n Enter the elements: ").strip().split()))[:n]
a = reverselist(a, 0, n-1)
print(a)

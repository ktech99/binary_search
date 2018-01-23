list = [1,3,5,7,9,12,34,56,67,71,72,73,86,87,89,92,94,97,100]

def binary_search(list, search):
    min = 0;
    max = len(list) - 1
    found = False
    while min < max and (not found):
        mid = int( (min + max)/2)
        if list[mid] > search:
            max = mid - 1
        elif list[mid] < search:
            min = mid + 1
        else :
            return mid + 1
    return -1

x = binary_search(list,34)
print( "found at position:"+ str(x))

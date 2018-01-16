def toDecimal(n,b):
    res = 0
    multiplier = 1
    while(n>0):
        res += (n%10)*multiplier
        multiplier *= b
        n = n/10
    return res

n,b = raw_input("enter the number and base to be converted to decimal").strip().split(' ')
n,b = [int(n),int(b)]
result = toDecimal(n,b)
print(result)




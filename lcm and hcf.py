def GCD(x,y):
    if(y == 0):
        return x
    return(GCD(y,x%y))


def LCM(x,y):
    return(x*y/GCD(x,y))


a,b = raw_input("enter the numbers").strip().split(' ')
a,b = [int(a),int(b)]
print(GCD(a,b))
print(LCM(a,b))

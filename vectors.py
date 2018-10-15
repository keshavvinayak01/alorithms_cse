def cross(a,b,c):
    AB = [0,0]
    AB[0] = b[0] - a[0]
    AB[1] = b[1] - a[1]

    BC = [0,0]
    BC[0] = b[0] - c[0]
    BC[1] = b[1] - c[1]

    d  = AB[0]*BC[1] - AB[1]*BC[0]
    d = str(d) + 'k'
    return d
    

def dot(a,b,c):
    AB = [0,0]
    AB[0] = b[0] - a[0]
    AB[1] = b[1] - a[1]
    
    BC = [0,0]
    BC[0] = c[0] - b[0]
    BC[1] = c[1] - b[1]
    return(AB[0]*BC[0] + AB[1]*BC[1])

def distance(a,b):
    d1 = b[0] - a[0]
    d2 = b[1] - a[1]
    return((d1^2 + d2^2)**(1/2.0))    #return the value of function distance
    

def caldist(a,b,c,isSegment):
    dist = cross(a,b,c)/distance(a,b)
    if(isSegment):
        if(dot(a,b,c) > 0):
            return(distance(b,c))
        if(dot(b,a,c) > 0):
            return(distance(a,c))
    return(dist)

a,b,c = [[0,0],[0,0],[0,0]]

a[0],a[1] = raw_input("enter the value of vector a(i j format) : ").split(' ')
a[0],a[1] = [int(a[0]) , int(a[1])]

b[0],b[1] = raw_input("enter the value of vector b(i j format) : ").split(' ')
b[0],b[1] = [int(b[0]), int(b[1])]

c[0],c[1] = raw_input("enter the value of vector c(i j format) : ").split(' ')
c[0],c[1] = [int(c[0]) , int(c[1])]

print 'dot product of vector AB and BC is', dot(a,b,c)
print 'cross product of vector AB and BC is', cross(a,b,c)
option = input("line or line segment?")
if(option == "line"):
    

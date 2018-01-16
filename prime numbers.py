# Enter your code here. Read input from STDIN. Print output to STDOUT
T = input()
for i in range(T):
    N = input()
    if(N %2 != 0):
        print(0)
    else:
        count = 0
        for j in xrange(1,(N**(1/2)) + 1):
            if(N%j == 0):                
                if(j%2 == 0):
                    count += 1
                if((N/j)%2 == 0 and N/j != j):
                    
                    count += 1
        print count

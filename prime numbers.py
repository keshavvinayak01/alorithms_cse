test_cases=int(input("Enter the number of the test cases: "))
for i in range(test_cases):
    flag=0
    n=int(input("Enter the number to check whether it is prime or not : "))
    for j in range(2,int(n**(0.5))+1):
        if n%j==0:
            flag=1
            break
        else:
            flag=0
    if flag==1:
        print("Not a prime number. ")
    else:
        print("It is prime. ")

import math

print('''
Square will be taken of 1st number!
Radius will be taken as 1st number!
SquareRoot of 1st number will be taken!
''')
# Numbers that are going to be used in the calculation

n1 = int(input("Enter 1st number\n"))

oper = input('''
Enter + for addition
Enter - for subtraction
Enter * for multiplication
Enter / for division
Enter ** for squaring
Enter **/ for SquareRoot
Enter 'AOT' for AreaOfTriangle
Enter 'AOC' for Area of circle
Enter 'CIRCOC' for Circumference/Perimeter of circle\n
''')
    
n2 = int(input("Enter 2nd number\n"))

# Constant Values

pi = math.pi

# Formulae for calculation
# You have to add cube, cube root!

Add1 = n1+n2
Diff = n1-n2
Product = n1*n2
Division = n1/n2
Square = n1*n1
SqRoot = math.sqrt(n1)
AreaOfTriangle = 0.5*n1*n2
AreaOfCircle_Radius_num1 = pi*n1*n1
Circumference = 2*pi*n1

# Statements that will calculate!

if oper == '+':
    print(Add1)
elif oper == '-':
    print(Diff)
elif oper == '*':
    print(Product)
elif oper == '/':
    print(Division)
elif oper == '**':
    print(Square)
elif oper == '**/':
    print(SqRoot)
elif oper == 'AOT':
    print(AreaOfTriangle)
elif oper == 'AOC':
    print(AreaOfCircle_Radius_num1)
elif oper == 'CIRCOC':
    print(Circumference)
else: #This else statement will ensure the user doesn't enter wrong operator!
    print("I don't know this operator!")

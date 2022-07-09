oper = int(input('''Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for squaring
Enter 6 for Area of circle
Enter 7 for Circumference/Perimeter of circle
Enter 8 for SquareRoot\n'''))

print('''Square will be taken of 1st number!
Radius will be taken as 1st number!
SquareRoot of 1st number will be taken!
''')

num1 = int(input("Enter 1st number\n"))
num2 = int(input("Enter 2nd number\n"))

pi = 3.14159265359

Add1 = num1+num2
Diff = num1-num2
Product = num1*num2
Division = num1/num2
Square = num1*num1
AreaOfCircle_Radius_num1 = pi*num1*num1
Circumference = 2*pi*num1
Root = Square/num1

if oper == 1:
    print(Add1)
elif oper == 2:
    print(Diff)
elif oper == 3:
    print(Product)
elif oper == 4:
    print(Division)
elif oper == 5:
    print(Square)
elif oper == 6:
    print(AreaOfCircle_Radius_num1)
elif oper == 7:
    print(Circumference)
elif oper == 8:
    print(Root)
else:
    print("I don't know this operator!")
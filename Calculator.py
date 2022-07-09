num1 = int(input("Enter 1st number\n"))
num2 = int(input("Enter 2nd number\n"))

oper = input('''Enter '+' for Addition
Enter '-' for Subtraction
Enter '*' for Multiplication
Enter '/' for Division
''')

if oper == '+':
    print(f"Sum of {num1} and {num2} is {num1+num2}")
elif oper == '-':
    print(f"Difference in {num1} and {num2} is {num1-num2}")
elif oper == '*':
    print(f"Product of {num1} and {num2} is {num1*num2}")
elif oper == '/':
    print(f" of {num1} and {num2} is {num1/num2}")
else:
    print("I don't know this operator!")

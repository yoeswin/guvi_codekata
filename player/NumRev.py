try:
    number = int(input())
    total = 0
    while(number > 0):
        rem = number % 10
        total = (total*10)+rem
        number = number//10

    print(total)

except:
    pass

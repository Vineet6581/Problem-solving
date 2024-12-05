def mul(a):
    print("a",a)
    def multiplier(b):
        print("b",b)
        return a*b
    return multiplier
mul20 = mul(25)
print("Multiplication result",mul20(20))
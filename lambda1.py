def f1(f2):
    return lambda x:f2(x)+5
def f2(x):
    return x+5
a=f1(f2)
print(a(5))

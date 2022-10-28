def toTuple(strNum):
    strTuple = tuple(strNum.split());
    numericX2 = int("".join(strTuple)) * 2;

    print("String tuple value: " + strNum)
    print("Values in tuple: {}".format(strTuple))
    print("Numeric value: " + "".join(strTuple))
    print("Numeric value x2: {}".format(numericX2))
    print("To tuple: {}".format(tuple(str(numericX2))))

toTuple("5      1   4   5   1   2")
#get each digit
#if the sum of the square of each digit is 1 then true, else repeat until 1 or encounter a previous result
#use SET because there is no repeating values
import math
import sys

def happy_number(number) -> bool:
    seen = set()
    while number not in seen:
        seen.add(number)
        accumulator_sum = 0
        while number > 0:
            accumulator_sum += math.pow(number%10, 2)
            number = math.floor(number/10)
        if accumulator_sum == 1:
            return True
        number = accumulator_sum
    return False

print(happy_number(int(sys.argv[1])))

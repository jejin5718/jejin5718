############## 주의 ##############
# 입력을 받기위한 input 함수는 절대 사용하지 않습니다.
# 내장 함수 sum 함수를 사용하지 않습니다.
# 사용시 감점처리 되니 반드시 확인 바랍니다.
import math


def sum_primes(number):
    sumj = 0
    for i in range(1, number):
        if i == 17:
            continue   
        if number <= 1:
            continue
        else:
            for i in range(2, int(math.sqrt(number))):
                if i % number == 0:
                    continue
        sumj += i
    return sumj



# 아래 코드는 실행 확인을 위한 코드입니다.
if __name__ == '__main__':
    # 예시 코드는 수정하지 마세요.
    print(sum_primes(22)) # => 60
    print(sum_primes(33)) # => 143
    # 여기부터 아래에 추가 테스트를 위한 코드 작성 가능합니다.
    
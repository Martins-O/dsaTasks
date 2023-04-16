def calculate_pi(n):
    pi = 0
    sign = 1
    for i in range(1, n + 1, 2):
        pi += sign * 4 / i
        sign *= -1
    return pi


print("n\t\tπ Approximation")
print("--------------------------------------")
for n in range(1, 200000, 10000):
    pi_approx = calculate_pi(n)
    print(f"{n}\t\t{pi_approx:.6f}")

# CRT_CSCI610

This is the repository for implementing the Chinese Remainder Theorem.  

The Chinese Remainder Theorem says that a number, n, can be expressed as the following:
1. The product of prime numbers.  If given an integer, n, it can be expressed as: p_1^k_1 * p_2^k_2 * ... * p_n^k_n.  Where p represents a prime factor, and k represents the exponent when there is a redundant prime factor.  
2. Given a number n, there is a set of Z_n that is formed, and thus there is a mapping which exists based on the number of factors
3. Therefore, the mappings could be generated as follows.  For a given number n, we can express Z_n as: n mod f_1, n mod f_2, n mod f_n where n is the integer, and f is the factor.  

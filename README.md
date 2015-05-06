CRT Implementation: CSCI610
=============================

This README file contains the following information:
1. Statement of the Theorem
2. Approach Taken


Statement of the Chinese Remainder Theorem
===============================
The Chinese Remainder Theorem says that a number, n, can be expressed as the following:
1. The product of prime numbers.  If given an integer, n, it can be expressed as: p_1^k_1 * p_2^k_2 * ... * p_n^k_n.  Where p represents a prime factor, and k represents the exponent when there is a redundant prime factor.  
2. Given a number n, there is a set of Z_n that is formed, and thus there is a mapping which exists based on the number of factors
3. Therefore, the mappings could be generated as follows.  For a given number n, we can express Z_n as: n mod f_1, n mod f_2, n mod f_n where n is the integer, and f is the factor.  

Approach Taken
=================================
Using the Java programming language and hard-coded integer input, we are able to generate the mappings for certain values of n as long as the value of n satisfies the following conditions:
1. There are distinct prime factors (i.e. for 35 the factors are 5 and 7)
2. No repetition of prime factors which could throw off the mappings in general.  Therefore we don't use numnbers like 12 because the prime factors are 2, 2, and 3 instead of 4 and 3. 

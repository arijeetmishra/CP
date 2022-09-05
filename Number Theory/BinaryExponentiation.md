# Binary Exponentiation

Binary exponentiation (also known as exponentiation by squaring) is a trick which allows to calculate $a^n$ using only $O(\log n)$ multiplications (instead of $O(n)$ multiplications required by the naive approach).

It also has important applications in many tasks unrelated to arithmetic, since it
can be used with any operations that have the property of **associativity**:

$$(X \cdot Y) \cdot Z = X \cdot (Y \cdot Z)$$

Most obviously this applies to modular multiplication, to multiplication of matrices and
to other problems which we will discuss below.

## Algorithm

Raising $a$ to the power of $n$ is expressed naively as multiplication by $a$ done $n - 1$ times:
$a^{n} = a \cdot a \cdot \ldots \cdot a$. However, this approach is not practical for large $a$ or $n$.

$a^{b+c} = a^b \cdot a^c$ and $a^{2b} = a^b \cdot a^b = (a^b)^2$.

The idea of binary exponentiation is, that we split the work using the binary representation of the exponent.

Let's write $n$ in base 2, for example:

$$3^{13} = 3^{1101_2} = 3^8 \cdot 3^4 \cdot 3^1$$

Since the number $n$ has exactly $\lfloor \log_2 n \rfloor + 1$ digits in base 2, we only need to perform $O(\log n)$ multiplications, if we know the powers $a^1, a^2, a^4, a^8, \dots, a^{2^{\lfloor \log n \rfloor}}$.

So we only need to know a fast way to compute those.
Luckily this is very easy, since an element in the sequence is just the square of the previous element.

$$\begin{align}
3^1 &= 3 \\
3^2 &= \left(3^1\right)^2 = 3^2 = 9 \\
3^4 &= \left(3^2\right)^2 = 9^2 = 81 \\
3^8 &= \left(3^4\right)^2 = 81^2 = 6561
\end{align}$$

So to get the final answer for $3^{13}$, we only need to multiply three of them (skipping $3^2$ because the corresponding bit in $n$ is not set):
$3^{13} = 6561 \cdot 81 \cdot 3 = 1594323$

The final complexity of this algorithm is $O(\log n)$: we have to compute $\log n$ powers of $a$, and then have to do at most $\log n$ multiplications to get the final answer from them.

The following recursive approach expresses the same idea:

$$a^n = \begin{cases}
1 &\text{if } n == 0 \\
\left(a^{\frac{n}{2}}\right)^2 &\text{if } n > 0 \text{ and } n \text{ even}\\
\left(a^{\frac{n - 1}{2}}\right)^2 \cdot a &\text{if } n > 0 \text{ and } n \text{ odd}\\
\end{cases}$$

## Implementation

First the recursive approach, which is a direct translation of the recursive formula:

```cpp
long long binpow(long long a, long long b) {
    if (b == 0)
        return 1;
    long long res = binpow(a, b / 2);
    if (b % 2)
        return res * res * a;
    else
        return res * res;
}
```

The second approach accomplishes the same task without recursion.
It computes all the powers in a loop, and multiplies the ones with the corresponding set bit in $n$.
Although the complexity of both approaches is identical, this approach will be faster in practice since we don't have the overhead of the recursive calls.

```cpp
long long binpow(long long a, long long b) {
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a;
        a = a * a;
        b >>= 1;
    }
    return res;
}
```

## Applications

### Effective computation of large exponents modulo a number

**Problem:**
Compute $x^n \bmod m$.
This is a very common operation. For instance it is used in computing the [modular multiplicative inverse](module-inverse.md).

**Solution:**
Since we know that the module operator doesn't interfere with multiplications ($a \cdot b \equiv (a \bmod m) \cdot (b \bmod m) \pmod m$), we can directly use the same code, and just replace every multiplication with a modular multiplication:

```cpp
long long binpow(long long a, long long b, long long m) {
    a %= m;
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res;
}
```

**Note:** If $m$ is a prime number we can speed up a bit this algorithm by calculating $x^{n \bmod (m-1)}$ instead of $x ^ n$.
This follows directly from [Fermat's little theorem](module-inverse.md#toc-tgt-2).

## Video Tutorials
Errichto
https://youtu.be/L-Wzglnm4dM  
Indian Accent 
https://youtu.be/-3Lt-EwR_Hw  


## Article Source 
https://cp-algorithms.com/algebra/binary-exp.html

## Practice Problems

* [UVa 1230 - MODEX](http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=3671)
* [UVa 374 - Big Mod](http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=310)
* [UVa 11029 - Leading and Trailing](https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1970)
* [Codeforces - Parking Lot](http://codeforces.com/problemset/problem/630/I)
* [SPOJ - The last digit](http://www.spoj.com/problems/LASTDIG/)
* [SPOJ - Locker](http://www.spoj.com/problems/LOCKER/)
* [LA - 3722 Jewel-eating Monsters](https://icpcarchive.ecs.baylor.edu/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1723)
* [SPOJ - Just add it](http://www.spoj.com/problems/ZSUM/)
* [Codechef - Chef and Riffles](https://www.codechef.com/JAN221B/problems/RIFFLES)
* [leetcode - Count good numbers](https://leetcode.com/problems/count-good-numbers/)
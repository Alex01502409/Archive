def d(q, w):
        if len(w) == 0:
                return(q)
        return( (2*d(q,w[:-1])+ int(w[-1]))%3 )

def f(w):
        return( d(0, str(w)) == 0 )

print(f(1001))

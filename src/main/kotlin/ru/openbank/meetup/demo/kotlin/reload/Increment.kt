package ru.openbank.meetup.demo.kotlin.reload

import java.time.LocalDate

data class DeliveryDate(val date: LocalDate = LocalDate.now()) {
    operator fun DeliveryDate.inc() : DeliveryDate {
        return DeliveryDate(date.plusDays(1))
    }
}

fun main() {
    val date = DeliveryDate();
    println("Source date: $date")
    println("Increment date: $date++")
}

+a	a.unaryPlus()
-a	a.unaryMinus()
!a	a.not()
a++	a.inc()
a--	a.dec()
a + b	a.plus(b)
a - b	a.minus(b)
a * b	a.times(b)
a / b	a.div(b)
a % b	a.rem(b) , a.mod(b) (устаревший)
a..b	a.rangeTo(b)
a in b	b.contains(a)
a !in b	!b.contains(a)
a[i]	a.get(i)
a[i, j]	a.get(i, j)
a[i_1, ..., i_n]	a.get(i_1, ..., i_n)
a[i] = b	a.set(i, b)
a[i, j] = b	a.set(i, j, b)
a[i_1, ..., i_n] = b	a.set(i_1, ..., i_n, b)
a()	a.invoke()
a(i)	a.invoke(i)
a(i, j)	a.invoke(i, j)
a(i_1, ..., i_n)	a.invoke(i_1, ..., i_n)
a += b	a.plusAssign(b)
a -= b	a.minusAssign(b)
a *= b	a.timesAssign(b)
a /= b	a.divAssign(b)
a %= b	a.remAssign(b)
a == b	a?.equals(b) ?: (b === null)
a != b	!(a?.equals(b) ?: (b === null))
a > b	a.compareTo(b) > 0
a < b	a.compareTo(b) < 0
a >= b	a.compareTo(b) >= 0
a <= b	a.compareTo(b) <= 0
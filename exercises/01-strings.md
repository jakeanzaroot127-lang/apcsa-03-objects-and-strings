# Exercise 3 — Concatenation Predictions

Predict every result **before** running anything. Be exact — include spaces.

Assume: `int a = 5;  int b = 3;  String s = "Score";  char c = 'A';`

| # | Expression | Predicted | Actual | Right? |
|---|---|---|---|---|
| 1 | `s + a` | Score5 | Score5 | Yes |
| 2 | `s + a + b` | Score53 | Score53 | Yes |
| 3 | `s + (a + b)` | Score8 | Score8 | Yes |
| 4 | `a + b + s` | 8Score | 8Score | Yes |
| 5 | `a + (b + s)` | 5Score3 | 5Score3 | Yes |
| 6 | `"" + a + b` | 53 | 53 | Yes |
| 7 | `c + 1` | 66 | 66 | Yes |
| 8 | `"" + c + 1` | A1 | A1 | Yes |
| 9 | `(char)(c + 1)` | B | B | Yes |
| 10 | `s + c` | ScoreA | ScoreA | Yes |

---

## Follow-up

**1. Compare #2 and #4. Same three values, opposite order, and the results are structurally different. Explain the rule.**

Strings join values; numbers add until a String appears.

**2. Why does #7 give `66` instead of `A1`?**

Java adds the character's number, 65, and 1.

**3. Why does #8 give `A1` when #7 gives `66`? What did the empty string change?**

The empty String makes Java join text instead of adding numbers.

**4. Write a single line that prints exactly `The total of 5 and 3 is 8` using the variables `a` and `b`.**

```java
System.out.println("The total of " + a + " and " + b + " is " + (a + b));
```

---

## Immutability check

Run this:
```java
String word = "hello";
word.toUpperCase();
System.out.println(word);

word = word.toUpperCase();
System.out.println(word);
```

**1. What did each line print?**

First: hello

Second: HELLO

**2. In your own words: what does it mean that Strings are immutable?**

Strings cannot be changed after they are created.

**3. Why is it easy to write `word.toUpperCase();` and think you've changed something? What kind of error is this — syntax, runtime, or logic?**

It returns a new String. Forgetting to save it is a logic error.

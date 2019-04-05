# Start IT Java group theoretical test
2019-04-05

To submit solutions, simply create a file called "theoretical-answers.txt" with the answers. If a question has multiple correct answers, select all of them.

Suggested format is `question-number: answer`

Example:
```
1: e
2: f,h
3: e
4: f,g,h
5: freeform answer text
...
```

Remember to save your answers, add the file, and commit, and push.

**1. Which one of these is **not** an operating system?**
- a) Android
- b) IntelliJ Idea
- c) Linux
- d) Windows

1:b

**2. What command or commands would you run in the terminal to install the (fake) application "foobar" on Linux?**

2: sudo apt-get install


**3. Which one of these is the file format used to distributable Java applications?**
- a) JDK
- b) JRE
- c) JVM
- d) JAR

3: c

**4. Which one of these is required to develop with Java but is not mandatory for a simple user of a Java application?**
- a) JDK
- b) JRE
- c) JVM
- d) JAR

4: a

**5. What does a user have to have installed to run Java applications?**
- a) JDK
- b) JRE
- c) JVM
- d) JAR

5: b

**6. Can a computer have multiple operating systems installed?**
- a) yes
- b) no

6: a

### Operators

**7. What is the value of `x` after the last line?**
```
int x = 0;
x++;

```
7: 1

**8. What is the value of `x` after the last line?**
```
int x = 5;
x = x * 3;
```

8: 15

**9. What is the value of `x` after the last line?**
```
int x = 15;
x %= 6;
```

9: 3

**10. What is the value of `x` after the last line?**
```
int x = 0;
x = ++x + x++;
```

10: 0

**11. What is the value of `x` after the last line?**
```
boolean a = true;
boolean b = false;
boolean x = a || b;
```
11:true

**12. What is the value of `x` after the last line?**
```
boolean a = true;
boolean b = false;
boolean x = a && !b;
```
12: true

**13. What is the value of `x` after the last line?**
```
boolean x = false || true && 5 >= 5;
```
13: x>=5
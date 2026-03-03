# student-utils-assignment (Java 11)

A beginner-friendly **Secure Programming** unit testing mini-assignment using **Java 11**, **Maven**, and **JUnit 5**.

You are given a small utility class with simple validation logic (grades and ages).
The code contains **intentional bugs**. Your job is to:

1. Write unit tests (including **boundary tests**) for each method.
2. Run the tests and identify failures.
3. Fix the bugs in `StudentUtils`.
4. Ensure **all tests pass**.

## Quick start

### Requirements
- Java **11**
- Maven **3.6+**

### Run tests
```bash
mvn test
```

## Methods to test

- `isValidGrade(int grade)` → grade must be **0–100**
- `isPassingGrade(int grade)` → pass mark is **40+**
- `isAdult(int age)` → **18+**
- `isTeenager(int age)` → **13–17**
- `isChild(int age)` → **0–12**

## What you must test (minimum)

Write tests that cover:

### Grades
- valid middle value (e.g., 75)
- boundary: 0 and 100
- invalid: -1 and 101
- pass boundary: 39 (fail), 40 (pass)

### Ages
- adult boundary: 17 (false), 18 (true)
- teenager boundaries: 12 (false), 13 (true), 17 (true), 18 (false)
- child boundaries: -1 (false), 0 (true), 12 (true), 13 (false)

## Notes
- Keep each test small and focused.
- Use clear test names.
- Prefer `assertTrue`, `assertFalse`, and boundary tests.

## Extra Work (optional)
- Add a method `getAgeCategory(int age)` returning `"child"`, `"teen"`, `"adult"` and test it

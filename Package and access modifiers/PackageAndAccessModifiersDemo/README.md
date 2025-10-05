# Packages and access modifiers

## Notes: Java packages and access modifiers

### Packages — purpose and basics
- A package groups related classes and interfaces. It provides namespace management and controls visibility.
- Declared at the top of a source file: `package com.airbus.package1;`
- Directory structure should match package name: `src/com/airbus/package1/DemoOne.java`.
- If no package is declared, the class is in the unnamed (default) package — not recommended for real projects.
- Importing: use `import com.airbus.package1.DemoOne;` or wildcard `import com.airbus.package1.*;`
- Fully qualified name: `com.airbus.package1.DemoOne`

### Access modifiers — visibility rules
- `public`: visible everywhere (any package)
- `protected`: visible in the same package and to subclasses (even in other packages)
- package-private (no modifier): visible only within the same package
- `private`: visible only within the same class

Summary:
- `public`: same class, same package, subclasses, everywhere
- `protected`: same class, same package, subclasses (other packages)
- (default) package-private: same class, same package
- `private`: same class only

Top-level classes:
- `public` or package-private only. Top-level classes cannot be `private` or `protected`.

### Examples (based on this workspace)

`src/com/airbus/package1/DemoOne.java`:

```java
package com.airbus.package1;

public class DemoOne {
    public int publicField;          // visible everywhere
    protected int protectedField;    // same package & subclasses
    int packageField;                // package-private: same package only
    private int privateField;        // only this class

    public DemoOne(int v) {
        this.publicField = v;
        this.protectedField = v + 1;
        this.packageField = v + 2;
        this.privateField = v + 3;
    }

    public int getPrivateField() {
        return privateField;
    }
}
```

`src/com/airbus/package2/DemoThree.java`:

```java
package com.airbus.package2;

import com.airbus.package1.DemoOne;

public class DemoThree extends DemoOne {
    public DemoThree(int v) {
        super(v);
        int a = this.publicField;           // OK
        int b = this.protectedField;        // OK because subclass
        // int c = this.packageField;       // ERROR: package-private -> different package
        // int d = this.privateField;       // ERROR: private to DemoOne
        int priv = getPrivateField();       // OK via public getter
    }
}
```

### Why IDE warns "field is never used"
- If a `private` field is declared but never read/used in the class, IDEs show an "unused" warning. Either use the field, remove it, or suppress the warning with `@SuppressWarnings("unused")` if it's kept for reflection/framework use.

### Best practices
- Prefer `private` fields + public/protected getters/setters (encapsulation).
- Keep fields `private` by default; expose only what is necessary via methods.
- Use package-private for internal helpers meant for other classes in the same package.
- Use `protected` only for extension points designed for subclasses.
- Avoid public mutable fields; prefer immutable APIs.

### Quick compile & run (Windows PowerShell)
From the project root (adjust paths if needed):

```powershell
javac -d bin src\\com\\airbus\\package1\\DemoOne.java src\\com\\airbus\\package2\\DemoThree.java
java -cp bin com.airbus.package2.DemoThree
```

Note: `DemoThree` above doesn't have a `main` method. Replace with a class that has `public static void main(String[] args)` to run.

### Short quiz
1. Which modifier allows access only inside the same package? (Answer: package-private/default)
2. Can a `private` field be accessed by a subclass in another package? (Answer: No)
3. True/False: Top-level classes can be declared `private`. (Answer: False)

---



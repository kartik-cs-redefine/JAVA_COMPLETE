# Core Java — Lecture 02: JVM, JRE, JDK & First Java Program

---

## 📌 Mindmap

```mermaid
flowchart TD
    JDK["JDK (Java Development Kit)<br/>Development Tools + JRE"]
    
    JDK --> DevTools["Development Tools<br/>javac (Compiler), jdb (Debugger), javadoc"]
    JDK --> JRE["JRE (Java Runtime Environment)<br/>Libraries + JVM"]
    
    JRE --> Libs["Class Libraries / Core APIs<br/>java.lang, java.util, java.io, etc."]
    JRE --> JVM["JVM (Java Virtual Machine)<br/>Execution Engine"]
    
    JVM --> ExecEngine["Execution Engine"]
    JVM --> Security["Security Sandbox"]
    JVM --> GC["Garbage Collector"]
    
    ExecEngine --> Interp["Interpreter<br/>(Line-by-line execution, fast startup)"]
    ExecEngine --> JIT["JIT Compiler<br/>(Compiles frequent 'hotspots' to native code)"]
```

---

## 1. Hierarchy: JDK vs. JRE vs. JVM

Java execution and development is structured as three concentric layers:

```mermaid
flowchart LR
    JDK["JDK<br/>(Tools + JRE)"] --> JRE["JRE<br/>(Class Libraries + JVM)"] --> JVM["JVM<br/>(Execution Engine)"]
```

* **JVM (Java Virtual Machine)**:
  * Innermost engine.
  * Responsible for executing Bytecode (`.class`) and translating it into host-specific Machine Code.
  * Provides memory management (Garbage Collection) and security sandboxing.
* **JRE (Java Runtime Environment)**:
  * Formula: $\text{JRE} = \text{JVM} + \text{Class Libraries}$
  * Contains the runtime packages, standard utility libraries, and core APIs needed to **run** an existing Java application.
* **JDK (Java Development Kit)**:
  * Formula: $\text{JDK} = \text{JRE} + \text{Development Tools}$
  * The full software bundle needed to **develop, compile, and debug** Java applications.
  * Includes `javac` (compiler), `jdb` (debugger), `javadoc`, and other CLI developer utilities.

---

## 2. JVM Internals: How Bytecode Executes

```mermaid
flowchart LR
    Bytecode["Bytecode (.class)"] --> JVM["JVM Execution Engine"]
    JVM --> Fast["Hot Code (Frequent)"] --> JIT["JIT Compiler"] --> Native1["Native Machine Code"]
    JVM --> Normal["Cold Code (Infrequent)"] --> Interp["Interpreter"] --> Native2["Native Machine Code Line-by-Line"]
```

### Compiler vs. Interpreter (The Core Trade-off)
* **Compiler**: Reads and converts the entire source code into machine code all at once before execution.
  * *Advantage*: Very fast execution once compiled.
  * *Disadvantage*: Slow initial build/compilation startup time.
* **Interpreter**: Reads and translates source code line-by-line, executing instructions on the fly.
  * *Advantage*: Starts execution immediately with minimal startup delay.
  * *Disadvantage*: Slower execution speed for loops and repetitive tasks because the same instructions are interpreted repeatedly.

### Is Java Compiled or Interpreted?
**Java is both.**
1. **Ahead-of-Time Step**: `javac` compiles `.java` source code into platform-independent `.class` Bytecode.
2. **Runtime Step**: Inside the JVM, a **hybrid engine** combines an Interpreter with a **JIT (Just-In-Time) Compiler**:
   * **Interpreter**: Begins executing Bytecode instructions line-by-line immediately for fast application startup.
   * **JIT Compiler**: Monitors code while running and detects repetitive code blocks ("hotspots", frequent loops/methods). It compiles these hotspot sections directly into native machine code so they never need re-interpretation.

### Primary Functions of the JVM
1. **Bytecode to Machine Code Translation**: Handled by the hybrid Interpreter + JIT engine.
2. **Security Sandbox Model**: Runs untrusted/downloaded bytecode in a restricted virtual environment to prevent unauthorized memory access or arbitrary filesystem destruction.
3. **Automatic Garbage Collection (GC)**: Continuously monitors heap memory and automatically deletes unreferenced objects.

---

## 3. Java Editions: JSE vs. JEE vs. JME

| Edition | Full Name | Primary Target & Description | Current Status |
| :--- | :--- | :--- | :--- |
| **JSE** | Java Standard Edition | **Core Java**. Includes fundamental OOP principles, core APIs (`java.lang`, `java.util`), multithreading, collections, and I/O. | **Active & Foundational** (Basis for all Java development) |
| **JEE** | Java Enterprise Edition *(Now Jakarta EE)* | Extended enterprise libraries for distributed systems, backend web applications, transactions, and enterprise microservices (e.g., Spring Boot ecosystem). | **Active** (Modern Enterprise Backend) |
| **JME** | Java Micro Edition | Lightweight subset designed for early resource-constrained mobile phones and embedded systems. | **Obsolete** (Replaced by modern Android OS / Kotlin) |

---

## 4. End-to-End Execution of a Java Program

```mermaid
flowchart TD
    Src["1. Source Code (Demo.java)"] -->|"javac Demo.java (Compiler)"| BC["2. Bytecode (Demo.class)"]
    BC -->|"java Demo (JVM Invocation)"| JRE["3. JRE / JVM Loads Libraries"]
    JRE -->|"JIT + Interpreter"| Native["4. Native Machine Code (0s & 1s)"]
    Native --> CPU["5. CPU / Processor Execution"]
    CPU --> Out["6. Console Output ('Hello World')"]
```

### Step-by-Step CLI Workflow:

#### Step 1: Write Source Code (`Demo.java`)
```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

#### Step 2: Compile to Bytecode
Run the Java compiler (`javac`) from the terminal:
```bash
javac Demo.java
```
* **Output**: Produces an intermediate platform-independent file: `Demo.class`.
* *Note*: Opening a `.class` file in editors like VS Code triggers an internal decompiler (e.g., Fernflower) because raw bytecode consists of binary JVM opcodes.

#### Step 3: Execute via the JVM
Invoke the Java runtime launcher:
```bash
java Demo
```
* **Action**: The JVM loads `Demo.class`, dynamically links standard runtime class libraries from the JRE, translates the bytecode using its Interpreter and JIT compiler into native instructions, and executes it via the host CPU.
* **Console Output**:
```text
Hello World
```

---

## 5. Architectural Takeaways

1. **JDK contains JRE; JRE contains JVM**.
2. **Bytecode is universal**, but the **JVM is platform-specific**.
3. **Java balances fast startup with peak performance** by dynamically pairing an Interpreter with a JIT Compiler.
4. **Core Java is based on JSE (Java Standard Edition)**; web and enterprise frameworks build on the JEE / Jakarta EE specification.

# Thread Examples

A collection of code examples to illustrate Java Threads.

## Build

```bash
mvn compile
```

## Running the Examples

### 1. Thread Scheduling — Basic Thread (extends Thread)

`javascheduling.ThreadTest1` — two threads printing characters concurrently using `Thread.yield()`.

```bash
mvn exec:java -Dexec.mainClass="javascheduling.ThreadTest1"
```

### 2. Thread Scheduling — Thread with Sleep

`javascheduling.ThreadTest2` — threads using `Thread.sleep()` to pace output.

```bash
mvn exec:java -Dexec.mainClass="javascheduling.ThreadTest2"
```

### 3. Stopping a Thread with a Flag

`stopping.StopRunnerWithFlag` — safely stopping a thread using an `AtomicBoolean` flag.

```bash
mvn exec:java -Dexec.mainClass="stopping.StopRunnerWithFlag"
```

### 4. Interrupting a Thread

`interrupt.InterruptMessageLoop` — interrupting a sleeping thread using `Thread.interrupt()`.

```bash
mvn exec:java -Dexec.mainClass="interrupt.InterruptMessageLoop"
```

### 5. Synchronized Shared Resource

`sync.ThreadTestSynchronized` — multiple threads sharing a synchronized printer object to avoid interleaved output.

```bash
mvn exec:java -Dexec.mainClass="sync.ThreadTestSynchronized"
```

### 6. Thread Pool (ExecutorService)

`pool.ThreadPoolExample` — submitting tasks to a fixed thread pool using `ExecutorService`.

```bash
mvn exec:java -Dexec.mainClass="pool.ThreadPoolExample"
```
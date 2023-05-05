### Thread Cooperation

Inter-thread communication (or Cooperation) is a mechanism in which a thread is paused running in its critical section
and another thread is allowed to enter (or lock) in the same critical section to be executed.

### Polling

It's the process of testing a condition repeatedly till it becomes true. Polling is usually implemented with loops to
check whether a particular condition is true or not. If it is true, a certain action is taken. This wastes many CPU
cycles and makes the implementation inefficient.

### How to avoid polling?

Java uses three methods
- wait()
- notify()
- notifyAll()

All these methods belong to object class as final so all classes have them.

They must be used within a **synchronized lock only**.

### wait()

After calling wait() method on the object:

1. The thread releases intrinsic lock.
2. Thread starts waiting for another thread to invoke *notify()* or *notifyAll()* method on the same object.

default invoke of wait() = this.wait()

### notify()

For one waiting thread.

### notifyAll()

For the all waiting threads.

### !!!
*notify()* invoke is not enough for waking up another
waiting thread. Current thread should also return intrinsic lock.
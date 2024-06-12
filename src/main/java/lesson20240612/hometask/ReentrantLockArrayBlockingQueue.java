package lesson20240612.hometask;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockArrayBlockingQueue<T> {

    private final Queue<T> queue;

    private final int capacity;
    private final ReentrantLock lock = new ReentrantLock(true);

    private final Condition notEmpty = lock.newCondition();

    private final Condition notFull = lock.newCondition();

    public ReentrantLockArrayBlockingQueue(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque<>(capacity);
    }

    public void put(T t) {
        lock.lock();
        try {
            while (queue.size() >= capacity) {
                notFull.awaitUninterruptibly();
            }
            queue.add(t);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.awaitUninterruptibly();
            }
            notFull.signal();
            return queue.poll();
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }

}

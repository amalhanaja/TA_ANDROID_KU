package com.amalhanaja.sani.data.executor

import com.amalhanaja.sani.domain.executor.ThreadExecutor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
open class JobExecutor
@Inject constructor(): ThreadExecutor{

    companion object {
        private val INITIAL_POOL_SIZE = 3
        private val MAX_POOL_SIZE = 5

        //Sets amount of time an idle thread waits before terminating
        private val KEEP_ALIVE_TIME = 10L

        //Sets Time Unit of Idle Thread
        private val KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS
    }

    private val workQueue: LinkedBlockingQueue<Runnable> =
            LinkedBlockingQueue()

    private val threadPoolExecutor: ThreadPoolExecutor

    private val threadFactory: ThreadFactory = JobThreadFactory()

    init {
        threadPoolExecutor = ThreadPoolExecutor(INITIAL_POOL_SIZE,
                MAX_POOL_SIZE, KEEP_ALIVE_TIME, KEEP_ALIVE_TIME_UNIT,
                workQueue, threadFactory)
    }

    override fun execute(runnable: Runnable?) {
        if (runnable == null) throw IllegalArgumentException("Can't Execute Because Runnable is Null")
        this.threadPoolExecutor.execute(runnable)
    }

    internal class JobThreadFactory: ThreadFactory {
        companion object {
            private val THREAD_NAME = "SANI_THREAD"
        }
        private var counter = 0
        override fun newThread(runnable: Runnable?): Thread {
            return Thread(runnable, "${THREAD_NAME}_${counter.inc()}")
        }
    }
}
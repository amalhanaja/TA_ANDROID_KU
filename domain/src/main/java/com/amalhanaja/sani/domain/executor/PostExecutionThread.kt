package com.amalhanaja.sani.domain.executor

import io.reactivex.Scheduler

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface PostExecutionThread {
    val scheduler: Scheduler
}
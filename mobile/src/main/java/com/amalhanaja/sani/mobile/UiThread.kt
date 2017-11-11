package com.amalhanaja.sani.mobile

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
class UiThread
@Inject constructor(): PostExecutionThread{
    override val scheduler: Scheduler
        get() = AndroidSchedulers.mainThread()
}
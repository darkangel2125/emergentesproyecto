package com.longnp.lnsocial.presentation.auth.register

import com.longnp.lnsocial.business.domain.util.Queue
import com.longnp.lnsocial.business.domain.util.StateMessage

data class RegisterState(
    val isLoading: Boolean = false,
    val queue: Queue<StateMessage> = Queue(mutableListOf())
)
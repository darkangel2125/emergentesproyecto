package com.longnp.lnsocial.presentation.main.discovery

import com.longnp.lnsocial.business.domain.models.discovery.DiscoveryModel
import com.longnp.lnsocial.business.domain.util.Queue
import com.longnp.lnsocial.business.domain.util.StateMessage

data class DiscoveryState(
    val isLoading: Boolean = false,
    val items: List<DiscoveryModel>? = null,
    val queue: Queue<StateMessage> = Queue(mutableListOf()),
)
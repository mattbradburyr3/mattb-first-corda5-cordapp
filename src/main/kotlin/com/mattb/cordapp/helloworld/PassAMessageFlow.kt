package com.mattb.cordapp.helloworld

import net.corda.v5.application.flows.*
import net.corda.v5.application.messaging.FlowSession
import net.corda.v5.base.annotations.Suspendable


@InitiatingFlow("pass-a-message=protocol")
class PassAMessageFlow: RPCStartableFlow {

    @Suspendable
    override fun call(requestBody: RPCRequestData): String {
        TODO("Not yet implemented")
    }
}


@InitiatedBy("pass-a-message-protocol")
class PassAMessageResponderFlow: ResponderFlow {

    @Suspendable
    override fun call(session: FlowSession) {
        TODO("Not yet implemented")
    }

}


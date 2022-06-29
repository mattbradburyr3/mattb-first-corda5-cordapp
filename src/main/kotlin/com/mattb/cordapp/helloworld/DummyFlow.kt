package com.mattb.cordapp.helloworld

import net.corda.v5.application.flows.RPCRequestData
import net.corda.v5.application.flows.RPCStartableFlow
import net.corda.v5.base.annotations.Suspendable
import net.corda.v5.base.util.contextLogger


class HelloWorldFlow: RPCStartableFlow {

    private companion object {
        val log = contextLogger()
    }

    @Suspendable
    override fun call(requestBody: RPCRequestData): String {
        log.info("MB: Hello world!")
        return "this call function returns Hello World, but is the version for Conal"
    }
}
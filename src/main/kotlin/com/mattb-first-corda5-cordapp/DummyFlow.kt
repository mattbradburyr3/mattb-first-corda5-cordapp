package com.`mattb-first-corda5-cordapp`

import net.corda.v5.application.flows.RPCRequestData
import net.corda.v5.application.flows.RPCStartableFlow
import net.corda.v5.base.util.contextLogger


class HelloWorldFlow: RPCStartableFlow {

    private companion object {
        val log = contextLogger()
    }

    override fun call(requestBody: RPCRequestData): String {
        log.info("MB: Hello world!")
        return "this call function returns Hello World"
    }
}
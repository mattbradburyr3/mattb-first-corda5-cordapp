package com.mattb.cordapp.helloworld

import net.corda.v5.application.flows.CordaInject
import net.corda.v5.application.flows.RPCRequestData
import net.corda.v5.application.flows.RPCStartableFlow
import net.corda.v5.application.marshalling.JsonMarshallingService
import net.corda.v5.base.annotations.Suspendable
import net.corda.v5.base.util.contextLogger

class ReceiveDataFromRPCFlow: RPCStartableFlow {

    private companion object {
        val log = contextLogger()
    }

    @CordaInject
    lateinit var jsonMarshallingService: JsonMarshallingService


    @Suspendable
    override fun call(requestBody: RPCRequestData): String {

        val dataString = requestBody.getRequestBody()
        log.info("MB: dataString: $dataString")
        val data = requestBody.getRequestBodyAs(jsonMarshallingService, MyRequestData::class.java )
        log.info("MB: data: $data")
        val compResult = "${data.myString} ${data.myInteger}"
        log.info("MB: compResult: $compResult")
        return "MB: compResult: $compResult"
    }
}

data class MyRequestData(
    val myString: String,
    val myInteger: Int
        ) {}
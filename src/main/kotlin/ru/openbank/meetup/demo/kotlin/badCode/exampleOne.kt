package ru.openbank.meetup.demo.kotlin.badCode

//import mu.KotlinLogging
//import org.springframework.stereotype.Service
//import org.springframework.web.context.request.async.DeferredResult
//import java.util.*
//
//@Service
//class VerificationServiceImpl
//(
//        private val deferredResultRepository: DeferredResultRepository,
//        private val tibcoRequestSender: TibcoRequestSender
//) : VerificationService {
//
//    private val log = KotlinLogging.logger {}
//    private val objectFactory = ObjectFactory()
//
//    override fun verify(request: VerificationRequestDto): DeferredResult<VerificationResponseDto> {
//        val result = DeferredResult<VerificationResponseDto>()
//        val correlationId = UUID.randomUUID()
//        deferredResultRepository.add(correlationId, result)
//        return try {
//            tibcoRequestSender.send(convertToTibcoRequest(request), correlationId.toString(),
//                    MessageType.VERIFY_APPLICATION.type)
//            result
//        } catch (ex: Exception) {
//            log.error(ex) { "Failed to send verification request for application ${request.applicationId} to TIBCO. " }
//            deferredResultRepository.remove(correlationId)
//            throw ex
//        }
//    }
//
//    private fun convertToTibcoRequest(verificationRequest: VerificationRequestDto): SOZ {
//        return buildSozRequest(verificationRequest)
//    }
//
//    private fun buildSozRequest(verificationRequest: VerificationRequestDto): SOZ {
//        return objectFactory.createSOZ().also {
//            it
//                    .apply { request = objectFactory.createSOZRequest() }
//                    .request
//                    .apply { dataRq = buildSozPayload(verificationRequest) }
//                    .dataRq
//                    .apply { client = objectFactory.createSOZRequestDataRqClient() }
//                    .client
//                    .apply { clientSystemInfo = buildClientSystemInfo(verificationRequest) }
//        }
//    }
//
//    private fun buildClientSystemInfo(verificationRequest: VerificationRequestDto): SOZ.Request.DataRq.Client.ClientSystemInfo {
//        return objectFactory.createSOZRequestDataRqClientClientSystemInfo().also {
//            it
//                    .apply { systemCode = "SOZ" }
//                    .apply { objectID = verificationRequest.applicationId!! }
//        }
//    }
//
//    private fun buildSozPayload(verificationRequest: VerificationRequestDto): SOZ.Request.DataRq {
//        return objectFactory.createSOZRequestDataRq().also {
//            it
//                    .apply { `object` = objectFactory.createSOZRequestDataRqObject() }
//                    .`object`
//                    .apply { userDefRecs = buildSozPayloadRecords(verificationRequest) }
//        }
//    }
//
//    private fun buildSozPayloadRecords(verificationRequest: VerificationRequestDto): SOZ.Request.DataRq.Object.UserDefRecs {
//        return objectFactory.createSOZRequestDataRqObjectUserDefRecs().also {
//            it
//                    .apply {
//                        recordSet.add(createRecordSet(mapOf(
//                                "Response" to verificationRequest.response)))
//                    }
//                    .apply {
//                        recordSet.add(createRecordSet(mapOf(
//                                "Name" to "AddInfoBank_ReceiveInBranch",
//                                "Value" to verificationRequest.branch,
//                                "Type" to "java.lang.String")))
//                    }
//                    .apply {
//                        recordSet.add(createRecordSet(mapOf(
//                                "Name" to "CreditContract_Date",
//                                "Value" to verificationRequest.date,
//                                "Type" to "java.util.Date")))
//                    }
//        }
//    }
//
//    private fun createRecordSet(params: Map<String, String?>): SOZ.Request.DataRq.Object.UserDefRecs.RecordSet {
//        return objectFactory.createSOZRequestDataRqObjectUserDefRecsRecordSet().apply {
//            params.entries.forEach { ps.add(createPs(it.key, it.value)) }
//        }
//    }
//
//    private fun createPs(name: String, value: String?): SOZ.Request.DataRq.Object.UserDefRecs.RecordSet.Ps {
//        return objectFactory.createSOZRequestDataRqObjectUserDefRecsRecordSetPs().also {
//            it.value = value
//            it.ns = name
//        }
//    }
//}
//
//
//@Service
//class VerificationServiceImpl(
//        private val deferredResultRepository: DeferredResultRepository,
//        private val tibcoRequestSender: TibcoRequestSender
//) : VerificationService {
//
//    private val log = KotlinLogging.logger {}
//    private val objectFactory = ObjectFactory()
//
//    override fun verify(request: VerificationRequestDto): DeferredResult<VerificationResponseDto> {
//        val result = DeferredResult<VerificationResponseDto>()
//        val correlationId = UUID.randomUUID()
//        deferredResultRepository.add(correlationId, result)
//        return try {
//            tibcoRequestSender.send(convertToTibcoRequest(request), correlationId.toString(),
//                    MessageType.VERIFY_APPLICATION.type)
//            result
//        } catch (ex: Exception) {
//            log.error(ex) { "Failed to send verification request for application ${request.applicationId} to TIBCO. " }
//            deferredResultRepository.remove(correlationId)
//            throw ex
//        }
//    }
//
//    private fun convertToTibcoRequest(request: VerificationRequestDto): SOZ {
//        val soz = objectFactory.createSOZ()
//        soz.request = objectFactory.createSOZRequest()
//        soz.request.dataRq = objectFactory.createSOZRequestDataRq()
//        soz.request.dataRq.client = objectFactory.createSOZRequestDataRqClient()
//        soz.request.dataRq.client.clientSystemInfo = objectFactory.createSOZRequestDataRqClientClientSystemInfo()
//        soz.request.dataRq.client.clientSystemInfo.systemCode = "SOZ"
//        soz.request.dataRq.client.clientSystemInfo.objectID = request.applicationId!!
//        soz.request.dataRq.`object` = objectFactory.createSOZRequestDataRqObject()
//        soz.request.dataRq.`object`.userDefRecs = objectFactory.createSOZRequestDataRqObjectUserDefRecs()
//        soz.request.dataRq.`object`.userDefRecs.recordSet.add(createRecordSet(mapOf("Response" to request.response)))
//        soz.request.dataRq.`object`.userDefRecs.recordSet.add(createRecordSet(mapOf(
//                "Name" to "AddInfoBank_ReceiveInBranch",
//                "Value" to request.branch,
//                "Type" to "java.lang.String")))
//        soz.request.dataRq.`object`.userDefRecs.recordSet.add(createRecordSet(mapOf(
//                "Name" to "CreditContract_Date",
//                "Value" to request.date,
//                "Type" to "java.util.Date")))
//        return soz
//    }
//
//    private fun createRecordSet(params: Map<String, String?>): SOZ.Request.DataRq.Object.UserDefRecs.RecordSet {
//        val recordSet = objectFactory.createSOZRequestDataRqObjectUserDefRecsRecordSet()
//        params.entries.forEach { recordSet.ps.add(createPs(it.key, it.value)) }
//        return recordSet
//    }
//
//    private fun createPs(name: String, value: String?): SOZ.Request.DataRq.Object.UserDefRecs.RecordSet.Ps {
//        val psResponse = objectFactory.createSOZRequestDataRqObjectUserDefRecsRecordSetPs()
//        psResponse.ns = name
//        psResponse.value = value
//        return psResponse
//    }
//}

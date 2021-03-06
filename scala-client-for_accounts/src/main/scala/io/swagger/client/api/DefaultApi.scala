/**
 * Account Information
 * The Account Information API is used to retrieve account data. You can retrieve transaction information, the current balance of an account or details of the account itself. The API can be used by licensed third party service providers to access ABN AMRO accounts. An account can only be accessed when ABN AMRO's account holder authorizes this through the consent application. Please note that the sandbox environment will be available in Februari
 *
 * OpenAPI spec version: 3.0.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Message
import io.swagger.client.model.balanceResponse
import io.swagger.client.model.date
import io.swagger.client.model.detailsResponse
import io.swagger.client.model.fundsResponse
import io.swagger.client.model.transactionResponse
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class DefaultApi(
  val defBasePath: String = "https://api-sandbox.abnamro.com/v1/accounts/",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DefaultApiAsyncHelper(client, config)

  /**
   * 
   * This operation allows you to retrieve the details of the account, like book balance of the account and currency.
   *
   * @param accountNumber The IBAN for which the balance is to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @return balanceResponse
   */
  def accountNumberBalancesGet(accountNumber: String, authorization: String, aPIKey: String): Option[balanceResponse] = {
    val await = Try(Await.result(accountNumberBalancesGetAsync(accountNumber, authorization, aPIKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * This operation allows you to retrieve the details of the account, like book balance of the account and currency.
   *
   * @param accountNumber The IBAN for which the balance is to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @return Future(balanceResponse)
   */
  def accountNumberBalancesGetAsync(accountNumber: String, authorization: String, aPIKey: String): Future[balanceResponse] = {
      helper.accountNumberBalancesGet(accountNumber, authorization, aPIKey)
  }

  /**
   * 
   * This operation allows you to retrieve the details of the account, like currency and account holder name.
   *
   * @param accountNumber The IBAN for which the details are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @return detailsResponse
   */
  def accountNumberDetailsGet(accountNumber: String, authorization: String, aPIKey: String): Option[detailsResponse] = {
    val await = Try(Await.result(accountNumberDetailsGetAsync(accountNumber, authorization, aPIKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * This operation allows you to retrieve the details of the account, like currency and account holder name.
   *
   * @param accountNumber The IBAN for which the details are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @return Future(detailsResponse)
   */
  def accountNumberDetailsGetAsync(accountNumber: String, authorization: String, aPIKey: String): Future[detailsResponse] = {
      helper.accountNumberDetailsGet(accountNumber, authorization, aPIKey)
  }

  /**
   * 
   * This operation will allow you to verify if the amount specified in the request is available on the account at that time (including any creditline).
   *
   * @param accountNumber The IBAN for which transactions are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @param amount Amount, decimal always a positive number and no more than 3 decimals (fractional digits) 
   * @param currency Currency of the amount, 3 characters alphabetic ISO-4217 currency code (e.g. EUR or USD) (optional)
   * @return fundsResponse
   */
  def accountNumberFundsGet(accountNumber: String, authorization: String, aPIKey: String, amount: Integer, currency: Option[String] = None): Option[fundsResponse] = {
    val await = Try(Await.result(accountNumberFundsGetAsync(accountNumber, authorization, aPIKey, amount, currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * This operation will allow you to verify if the amount specified in the request is available on the account at that time (including any creditline).
   *
   * @param accountNumber The IBAN for which transactions are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @param amount Amount, decimal always a positive number and no more than 3 decimals (fractional digits) 
   * @param currency Currency of the amount, 3 characters alphabetic ISO-4217 currency code (e.g. EUR or USD) (optional)
   * @return Future(fundsResponse)
   */
  def accountNumberFundsGetAsync(accountNumber: String, authorization: String, aPIKey: String, amount: Integer, currency: Option[String] = None): Future[fundsResponse] = {
      helper.accountNumberFundsGet(accountNumber, authorization, aPIKey, amount, currency)
  }

  /**
   * 
   * Retrieve a list of transactions for a specific account number.
   *
   * @param accountNumber The IBAN for which transactions are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @param bookDateFrom Filter, only retrieve transactions more recent than this date (Format: yyyy-mm-dd). If field or date is ommitted, last 50 transactions are retrieved (optional)
   * @param bookDateTo Filter, only retrieve transactions preceding this date (Format: yyyy-mm-dd). (optional)
   * @param nextPageKey Key parameter for fetching the next set of transactions. Value to be used is returned in a response of a previous request to the endpoint when more transactions are present (optional)
   * @return transactionResponse
   */
  def accountNumberTransactionsGet(accountNumber: String, authorization: String, aPIKey: String, bookDateFrom: Option[date] = None, bookDateTo: Option[date] = None, nextPageKey: Option[String] = None): Option[transactionResponse] = {
    val await = Try(Await.result(accountNumberTransactionsGetAsync(accountNumber, authorization, aPIKey, bookDateFrom, bookDateTo, nextPageKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * Retrieve a list of transactions for a specific account number.
   *
   * @param accountNumber The IBAN for which transactions are to be retrieved 
   * @param authorization Access token to be passed as a Bearer token. 
   * @param aPIKey Consumer key obtained after app registration on developer portal 
   * @param bookDateFrom Filter, only retrieve transactions more recent than this date (Format: yyyy-mm-dd). If field or date is ommitted, last 50 transactions are retrieved (optional)
   * @param bookDateTo Filter, only retrieve transactions preceding this date (Format: yyyy-mm-dd). (optional)
   * @param nextPageKey Key parameter for fetching the next set of transactions. Value to be used is returned in a response of a previous request to the endpoint when more transactions are present (optional)
   * @return Future(transactionResponse)
   */
  def accountNumberTransactionsGetAsync(accountNumber: String, authorization: String, aPIKey: String, bookDateFrom: Option[date] = None, bookDateTo: Option[date] = None, nextPageKey: Option[String] = None): Future[transactionResponse] = {
      helper.accountNumberTransactionsGet(accountNumber, authorization, aPIKey, bookDateFrom, bookDateTo, nextPageKey)
  }

}

class DefaultApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def accountNumberBalancesGet(accountNumber: String,
    authorization: String,
    aPIKey: String)(implicit reader: ClientResponseReader[balanceResponse]): Future[balanceResponse] = {
    // create path and map variables
    val path = (addFmt("/{accountNumber}/balances")
      replaceAll("\\{" + "accountNumber" + "\\}", accountNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountNumber == null) throw new Exception("Missing required parameter 'accountNumber' when calling DefaultApi->accountNumberBalancesGet")

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling DefaultApi->accountNumberBalancesGet")

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DefaultApi->accountNumberBalancesGet")

    headerParams += "Authorization" -> authorization.toString
    headerParams += "API-Key" -> aPIKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def accountNumberDetailsGet(accountNumber: String,
    authorization: String,
    aPIKey: String)(implicit reader: ClientResponseReader[detailsResponse]): Future[detailsResponse] = {
    // create path and map variables
    val path = (addFmt("/{accountNumber}/details")
      replaceAll("\\{" + "accountNumber" + "\\}", accountNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountNumber == null) throw new Exception("Missing required parameter 'accountNumber' when calling DefaultApi->accountNumberDetailsGet")

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling DefaultApi->accountNumberDetailsGet")

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DefaultApi->accountNumberDetailsGet")

    headerParams += "Authorization" -> authorization.toString
    headerParams += "API-Key" -> aPIKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def accountNumberFundsGet(accountNumber: String,
    authorization: String,
    aPIKey: String,
    amount: Integer,
    currency: Option[String] = None
    )(implicit reader: ClientResponseReader[fundsResponse]): Future[fundsResponse] = {
    // create path and map variables
    val path = (addFmt("/{accountNumber}/funds")
      replaceAll("\\{" + "accountNumber" + "\\}", accountNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountNumber == null) throw new Exception("Missing required parameter 'accountNumber' when calling DefaultApi->accountNumberFundsGet")

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling DefaultApi->accountNumberFundsGet")

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DefaultApi->accountNumberFundsGet")

    queryParams += "amount" -> amount.toString
    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }
    headerParams += "Authorization" -> authorization.toString
    headerParams += "API-Key" -> aPIKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def accountNumberTransactionsGet(accountNumber: String,
    authorization: String,
    aPIKey: String,
    bookDateFrom: Option[date] = None,
    bookDateTo: Option[date] = None,
    nextPageKey: Option[String] = None
    )(implicit reader: ClientResponseReader[transactionResponse]): Future[transactionResponse] = {
    // create path and map variables
    val path = (addFmt("/{accountNumber}/transactions")
      replaceAll("\\{" + "accountNumber" + "\\}", accountNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountNumber == null) throw new Exception("Missing required parameter 'accountNumber' when calling DefaultApi->accountNumberTransactionsGet")

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling DefaultApi->accountNumberTransactionsGet")

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DefaultApi->accountNumberTransactionsGet")

    bookDateFrom match {
      case Some(param) => queryParams += "bookDateFrom" -> param.toString
      case _ => queryParams
    }
    bookDateTo match {
      case Some(param) => queryParams += "bookDateTo" -> param.toString
      case _ => queryParams
    }
    nextPageKey match {
      case Some(param) => queryParams += "nextPageKey" -> param.toString
      case _ => queryParams
    }
    headerParams += "Authorization" -> authorization.toString
    headerParams += "API-Key" -> aPIKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}

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

package io.swagger.client.model


/**
 * @param accountNumber The IBAN for which the details were retrieved for example: '''NL12ABNA9999876523'''
 * @param currency Currency of the account, 3 characters alphabetic ISO currency code (e.g. EUR or USD) as per ISO 4217 for example: '''EUR'''
 * @param accountHolderName Name of the owner of the account for example: '''Firstname Lastname'''
 */
case class DetailsResponse (
  accountNumber: String,
  currency: Option[String],
  accountHolderName: Option[String]
)


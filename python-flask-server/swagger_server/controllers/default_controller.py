import connexion
import six

from swagger_server.models.balance_response import BalanceResponse  # noqa: E501
from swagger_server.models.details_response import DetailsResponse  # noqa: E501
from swagger_server.models.funds_response import FundsResponse  # noqa: E501
from swagger_server.models.message import Message  # noqa: E501
from swagger_server.models.transaction_response import TransactionResponse  # noqa: E501
from swagger_server import util


def account_number_balances_get(accountNumber, Authorization, API_Key):  # noqa: E501
    """account_number_balances_get

    This operation allows you to retrieve the details of the account, like book balance of the account and currency. # noqa: E501

    :param accountNumber: The IBAN for which the balance is to be retrieved
    :type accountNumber: str
    :param Authorization: Access token to be passed as a Bearer token.
    :type Authorization: str
    :param API_Key: Consumer key obtained after app registration on developer portal
    :type API_Key: str

    :rtype: BalanceResponse
    """
    return 'do some magic!'


def account_number_details_get(accountNumber, Authorization, API_Key):  # noqa: E501
    """account_number_details_get

    This operation allows you to retrieve the details of the account, like currency and account holder name. # noqa: E501

    :param accountNumber: The IBAN for which the details are to be retrieved
    :type accountNumber: str
    :param Authorization: Access token to be passed as a Bearer token.
    :type Authorization: str
    :param API_Key: Consumer key obtained after app registration on developer portal
    :type API_Key: str

    :rtype: DetailsResponse
    """
    return 'do some magic!'


def account_number_funds_get(accountNumber, Authorization, API_Key, amount, currency=None):  # noqa: E501
    """account_number_funds_get

    This operation will allow you to verify if the amount specified in the request is available on the account at that time (including any creditline). # noqa: E501

    :param accountNumber: The IBAN for which transactions are to be retrieved
    :type accountNumber: str
    :param Authorization: Access token to be passed as a Bearer token.
    :type Authorization: str
    :param API_Key: Consumer key obtained after app registration on developer portal
    :type API_Key: str
    :param amount: Amount, decimal always a positive number and no more than 3 decimals (fractional digits)
    :type amount: int
    :param currency: Currency of the amount, 3 characters alphabetic ISO-4217 currency code (e.g. EUR or USD)
    :type currency: str

    :rtype: FundsResponse
    """
    return 'do some magic!'


def account_number_transactions_get(accountNumber, Authorization, API_Key, bookDateFrom=None, bookDateTo=None, nextPageKey=None):  # noqa: E501
    """account_number_transactions_get

    Retrieve a list of transactions for a specific account number. # noqa: E501

    :param accountNumber: The IBAN for which transactions are to be retrieved
    :type accountNumber: str
    :param Authorization: Access token to be passed as a Bearer token.
    :type Authorization: str
    :param API_Key: Consumer key obtained after app registration on developer portal
    :type API_Key: str
    :param bookDateFrom: Filter, only retrieve transactions more recent than this date (Format: yyyy-mm-dd). If field or date is ommitted, last 50 transactions are retrieved
    :type bookDateFrom: str
    :param bookDateTo: Filter, only retrieve transactions preceding this date (Format: yyyy-mm-dd).
    :type bookDateTo: str
    :param nextPageKey: Key parameter for fetching the next set of transactions. Value to be used is returned in a response of a previous request to the endpoint when more transactions are present
    :type nextPageKey: str

    :rtype: TransactionResponse
    """
    bookDateFrom = util.deserialize_date(bookDateFrom)
    bookDateTo = util.deserialize_date(bookDateTo)
    return 'do some magic!'

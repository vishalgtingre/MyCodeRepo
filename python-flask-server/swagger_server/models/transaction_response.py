# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.transaction_response_transactions import TransactionResponseTransactions  # noqa: F401,E501
from swagger_server import util


class TransactionResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, account_number: str=None, next_page_key: str=None, transactions: List[TransactionResponseTransactions]=None):  # noqa: E501
        """TransactionResponse - a model defined in Swagger

        :param account_number: The account_number of this TransactionResponse.  # noqa: E501
        :type account_number: str
        :param next_page_key: The next_page_key of this TransactionResponse.  # noqa: E501
        :type next_page_key: str
        :param transactions: The transactions of this TransactionResponse.  # noqa: E501
        :type transactions: List[TransactionResponseTransactions]
        """
        self.swagger_types = {
            'account_number': str,
            'next_page_key': str,
            'transactions': List[TransactionResponseTransactions]
        }

        self.attribute_map = {
            'account_number': 'accountNumber',
            'next_page_key': 'nextPageKey',
            'transactions': 'transactions'
        }

        self._account_number = account_number
        self._next_page_key = next_page_key
        self._transactions = transactions

    @classmethod
    def from_dict(cls, dikt) -> 'TransactionResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The transactionResponse of this TransactionResponse.  # noqa: E501
        :rtype: TransactionResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def account_number(self) -> str:
        """Gets the account_number of this TransactionResponse.

        The IBAN for which transactions were retrieved  # noqa: E501

        :return: The account_number of this TransactionResponse.
        :rtype: str
        """
        return self._account_number

    @account_number.setter
    def account_number(self, account_number: str):
        """Sets the account_number of this TransactionResponse.

        The IBAN for which transactions were retrieved  # noqa: E501

        :param account_number: The account_number of this TransactionResponse.
        :type account_number: str
        """
        if account_number is None:
            raise ValueError("Invalid value for `account_number`, must not be `None`")  # noqa: E501

        self._account_number = account_number

    @property
    def next_page_key(self) -> str:
        """Gets the next_page_key of this TransactionResponse.

        Key parameter for fetching the next set of transactions. Value to be used is returned in a response of a previous request to the endpoint when more transactions are present.  # noqa: E501

        :return: The next_page_key of this TransactionResponse.
        :rtype: str
        """
        return self._next_page_key

    @next_page_key.setter
    def next_page_key(self, next_page_key: str):
        """Sets the next_page_key of this TransactionResponse.

        Key parameter for fetching the next set of transactions. Value to be used is returned in a response of a previous request to the endpoint when more transactions are present.  # noqa: E501

        :param next_page_key: The next_page_key of this TransactionResponse.
        :type next_page_key: str
        """

        self._next_page_key = next_page_key

    @property
    def transactions(self) -> List[TransactionResponseTransactions]:
        """Gets the transactions of this TransactionResponse.


        :return: The transactions of this TransactionResponse.
        :rtype: List[TransactionResponseTransactions]
        """
        return self._transactions

    @transactions.setter
    def transactions(self, transactions: List[TransactionResponseTransactions]):
        """Sets the transactions of this TransactionResponse.


        :param transactions: The transactions of this TransactionResponse.
        :type transactions: List[TransactionResponseTransactions]
        """

        self._transactions = transactions

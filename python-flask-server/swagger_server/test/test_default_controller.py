# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.balance_response import BalanceResponse  # noqa: E501
from swagger_server.models.details_response import DetailsResponse  # noqa: E501
from swagger_server.models.funds_response import FundsResponse  # noqa: E501
from swagger_server.models.message import Message  # noqa: E501
from swagger_server.models.transaction_response import TransactionResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_account_number_balances_get(self):
        """Test case for account_number_balances_get

        
        """
        headers = [('Authorization', 'Authorization_example'),
                   ('API_Key', 'API_Key_example')]
        response = self.client.open(
            '/v1/accounts//{accountNumber}/balances'.format(accountNumber='accountNumber_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_account_number_details_get(self):
        """Test case for account_number_details_get

        
        """
        headers = [('Authorization', 'Authorization_example'),
                   ('API_Key', 'API_Key_example')]
        response = self.client.open(
            '/v1/accounts//{accountNumber}/details'.format(accountNumber='accountNumber_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_account_number_funds_get(self):
        """Test case for account_number_funds_get

        
        """
        query_string = [('amount', 56),
                        ('currency', 'currency_example')]
        headers = [('Authorization', 'Authorization_example'),
                   ('API_Key', 'API_Key_example')]
        response = self.client.open(
            '/v1/accounts//{accountNumber}/funds'.format(accountNumber='accountNumber_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_account_number_transactions_get(self):
        """Test case for account_number_transactions_get

        
        """
        query_string = [('bookDateFrom', '2013-10-20'),
                        ('bookDateTo', '2013-10-20'),
                        ('nextPageKey', 'nextPageKey_example')]
        headers = [('Authorization', 'Authorization_example'),
                   ('API_Key', 'API_Key_example')]
        response = self.client.open(
            '/v1/accounts//{accountNumber}/transactions'.format(accountNumber='accountNumber_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()

# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "swagger_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["connexion"]

setup(
    name=NAME,
    version=VERSION,
    description="Account Information",
    author_email="",
    url="",
    keywords=["Swagger", "Account Information"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['swagger/swagger.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['swagger_server=swagger_server.__main__:main']},
    long_description="""\
    The Account Information API is used to retrieve account data. You can retrieve transaction information, the current balance of an account or details of the account itself. The API can be used by licensed third party service providers to access ABN AMRO accounts. An account can only be accessed when ABN AMRO&#39;s account holder authorizes this through the consent application. Please note that the sandbox environment will be available in Februari
    """
)


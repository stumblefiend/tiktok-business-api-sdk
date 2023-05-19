# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class PixelContent(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'content_category': 'str',
        'content_id': 'str',
        'content_name': 'str',
        'content_type': 'str',
        'price': 'float',
        'quantity': 'int',
        'status': 'str'
    }

    attribute_map = {
        'content_category': 'content_category',
        'content_id': 'content_id',
        'content_name': 'content_name',
        'content_type': 'content_type',
        'price': 'price',
        'quantity': 'quantity',
        'status': 'status'
    }

    def __init__(self, content_category=None, content_id=None, content_name=None, content_type=None, price=None, quantity=None, status=None):  # noqa: E501
        """PixelContent - a model defined in Swagger"""  # noqa: E501
        self._content_category = None
        self._content_id = None
        self._content_name = None
        self._content_type = None
        self._price = None
        self._quantity = None
        self._status = None
        self.discriminator = None
        if content_category is not None:
            self.content_category = content_category
        if content_id is not None:
            self.content_id = content_id
        if content_name is not None:
            self.content_name = content_name
        if content_type is not None:
            self.content_type = content_type
        if price is not None:
            self.price = price
        if quantity is not None:
            self.quantity = quantity
        if status is not None:
            self.status = status

    @property
    def content_category(self):
        """Gets the content_category of this PixelContent.  # noqa: E501

        Category of the page/product.  # noqa: E501

        :return: The content_category of this PixelContent.  # noqa: E501
        :rtype: str
        """
        return self._content_category

    @content_category.setter
    def content_category(self, content_category):
        """Sets the content_category of this PixelContent.

        Category of the page/product.  # noqa: E501

        :param content_category: The content_category of this PixelContent.  # noqa: E501
        :type: str
        """

        self._content_category = content_category

    @property
    def content_id(self):
        """Gets the content_id of this PixelContent.  # noqa: E501

        ID of the product item. Example `1077218`  # noqa: E501

        :return: The content_id of this PixelContent.  # noqa: E501
        :rtype: str
        """
        return self._content_id

    @content_id.setter
    def content_id(self, content_id):
        """Sets the content_id of this PixelContent.

        ID of the product item. Example `1077218`  # noqa: E501

        :param content_id: The content_id of this PixelContent.  # noqa: E501
        :type: str
        """

        self._content_id = content_id

    @property
    def content_name(self):
        """Gets the content_name of this PixelContent.  # noqa: E501

        Name of the page/product.  # noqa: E501

        :return: The content_name of this PixelContent.  # noqa: E501
        :rtype: str
        """
        return self._content_name

    @content_name.setter
    def content_name(self, content_name):
        """Sets the content_name of this PixelContent.

        Name of the page/product.  # noqa: E501

        :param content_name: The content_name of this PixelContent.  # noqa: E501
        :type: str
        """

        self._content_name = content_name

    @property
    def content_type(self):
        """Gets the content_type of this PixelContent.  # noqa: E501

        The content_type object propertys value must be set to either `product`, or `product_group`, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to `product`. If you are tracking events associated with product groups, set it to `product_group` instead.  # noqa: E501

        :return: The content_type of this PixelContent.  # noqa: E501
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """Sets the content_type of this PixelContent.

        The content_type object propertys value must be set to either `product`, or `product_group`, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to `product`. If you are tracking events associated with product groups, set it to `product_group` instead.  # noqa: E501

        :param content_type: The content_type of this PixelContent.  # noqa: E501
        :type: str
        """

        self._content_type = content_type

    @property
    def price(self):
        """Gets the price of this PixelContent.  # noqa: E501

        The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.  # noqa: E501

        :return: The price of this PixelContent.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this PixelContent.

        The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.  # noqa: E501

        :param price: The price of this PixelContent.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def quantity(self):
        """Gets the quantity of this PixelContent.  # noqa: E501

        The number of the item.   # noqa: E501

        :return: The quantity of this PixelContent.  # noqa: E501
        :rtype: int
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """Sets the quantity of this PixelContent.

        The number of the item.   # noqa: E501

        :param quantity: The quantity of this PixelContent.  # noqa: E501
        :type: int
        """

        self._quantity = quantity

    @property
    def status(self):
        """Gets the status of this PixelContent.  # noqa: E501

        Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok.  # noqa: E501

        :return: The status of this PixelContent.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this PixelContent.

        Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok.  # noqa: E501

        :param status: The status of this PixelContent.  # noqa: E501
        :type: str
        """

        self._status = status

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PixelContent, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PixelContent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
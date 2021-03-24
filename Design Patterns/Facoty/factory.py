import random

class Create(object):

  def get_random_number(self):
    number = random.random()
    return number

  def multiply_random_number(self):
    first_number = self.get_random_number()
    second_number = self.get_random_number()

    print(f'{first_number} + {second_number}')
    response = first_number + second_number

    return response
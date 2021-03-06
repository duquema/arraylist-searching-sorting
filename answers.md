1. Find a deck of cards, some jellybeans, or any group of physical objects around your home that can be assigned an order. You need about 8 to 10 items to work with.
    1. Shuffle the items, producing a randomish arrangement. Perform a normal Search algorithm, once for an item that exists in the group, and once for one that does not.
    done
    2. Arrange the items in ascending order. Perform a BinarySearch on the group, once for an item that exists in the group, and once for one that does not.
    done
    3. What do you notice about the two algorithms?
    For the Search algorithm you have to go through each card until you find the one you are looking for, which is better if the card is in the beginning, but not if it is at the end. For the binarySearch you continuously split the cards in half until you find the card, which can be more efficient if the card is not in the very beginning.

2. What does it mean for an algorithm to be efficient? Which algorithm, search or binary search is more efficient? Why?
An algorithm is efficient if it doesn't have to run very many things or run too long. The binarySearch would be more efficient in most cases, because it doesn't have to go through every single card to get to the one being searched for.

3. For the list: `["apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]`

  1. Describe, step by step, how each searching algorithm would process the list when searching for "blueberry"
  search would check apple, then banana, then banana, and so on until it went to the end of the list and realized none of the items matched blueberry and would return -1. binarySearch would choose the middle term, lime, see that blueberry was less and split the first half, going to banana, then realize blueberry was not there.
  2. How many members of the list did `search` access (look at) when looking for blueberry? How many members did `binarySearch` access?
  11, 2
  3. If the list of fruits had been 1000 items long instead, how would your answer to question ii change?
  1000, ~12

  1. Find a deck of cards, some jellybeans, or any group of physical objects around your home that can be assigned an order. You need about 8 to 10 items to work with. Shuffle the items, producing a randomish arrangement.
      1. Perform a SelectionSort on the list.
      2. Shuffle again, and perform an InsertionSort on the list.
      3. Shuffle again, and perform a BubbleSort on the list.
      4. What do you notice about the algorithms?
      selection was the fastest, then bubble, then insertion; insertion seemed highly inefficient, while selection was clearly the most efficient
  2. These algorithms are typically called `comparison sorts` because they rely on comparing two elements at a time. For each algorithm:
      1. How many comparisons would it perform for a list of 10 items that were already in order?
      selection- 55
      insertion- 10
      bubble- 9
      2. How many comparisons does it perform in the worst possible pre-arrangement of 10 items?
      selection- 55
      insertion- 45
      bubble- 90
      3. How many comparisons would you expect it to perform, approximately, on 10 random items? 100? 1000?
      selection- 55
      insertion- 27ish
      bubble- 50ish
  3. If you were searching for an element in a random list, would it be reasonable to use one of these algorithms to sort the list first and use binarySearch, or would you be better off using a normal search? Why or why not?
binary search would be more efficient if searching in a long list for a random element, because it wouldn't need to evaluate the majority of elements before finding the desired one

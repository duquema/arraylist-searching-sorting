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

Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?

1. Library:
    - 1. Overloaded addTitle Method:

Purpose: Adds a book along with its initial availability status. This allows for direct control over a book's availability when it is first added, useful in scenarios where some books might be added already checked out or reserved.

    - 2. Overloaded printCollection Method:

Purpose: Allows printing either the entire collection or only those books that are currently available or checked out, providing more tailored output useful for both staff and patrons.

2. Cafe:

    - Overloaded Constructor:

Purpose: Assume some default values for coffee ounces, sugar packets, creams, and cups but allow specifying the building details. This is useful when the internal setup is standard but the building details vary.

    - Overloaded sellCoffee:

Purpose: This method assumes no sugar or creams are needed, simplifying orders when customers want plain coffee. Provided a boolean switch for size, simplifying the interface for users who want either a standard or large cup without specifying exact ounces.

3. House:
    - 1. Overloaded Constructor:

Purpose: Allows creation of a House with a predefined list of residents. This is useful when initializing a house that isn't empty, simulating a real-world scenario where a house may already be occupied.

    - 2. Overloaded moveIn Method:

Purpose: Allows moving in multiple residents at once. This enhances usability by enabling batch operations, which is efficient when initializing or updating the house's state with multiple residents.



- What worked, what didn't, what advice would you give someone taking this course in the future?

- My overloaded methods improved the usability and functionality of the House, Library, and cafe classes, allowing for more flexible and efficient operations that are more aligned with potential real-world use cases, such as initializing with predefined data or handling bulk operations efficiently. I would advise really thinking about efficiency of code in the real world for this assignment.

Phase 1
In this phase, I created the InventoryComponent base class and the Item class. I tested two items and verified that their names and weights displayed correctly. The default methods throw UnsupportedOperationException so subclasses only need to implement operations they support. This makes the design transparent because the client can use the same component type without needing to know which operations are supported by each class.

Phase 2
In this phase, I created the Bag class to hold items and other inventory components. An Item returns its own weight, while a Bag adds its base weight to the weights of everything inside it. Polymorphism lets the Bag call getWeight() on any component, and recursion handles nested bags automatically without needing to identify each object's type.
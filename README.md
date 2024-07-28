**StringBuilder in Java **represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters. The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters. However, the StringBuilder class differs from the StringBuffer class on the basis of synchronization. The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does. Therefore this class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that StringBuffer be used. String Builder is not thread-safe and high in performance compared to String buffer.

**StringBuilder**

.append()
Appends the string representation of its argument.

.capacity()
Returns the current space available for characters in the StringBuilder.

.delete()
Removes a substring from the contents of a StringBuilder and returns the modified object.

.deleteCharAt()
Removes the character at the specified index from the contents of a StringBuilder and returns the modified object.

.indexOf()
Returns the index of the first occurrence of a substring in the StringBuilder or -1 if none are found.

.insert()
Places a sequence of characters into a StringBuilder and returns a reference to the object.

.lastIndexOf()
Returns the index of the last (rightmost) occurrence of a substring in the StringBuilder or -1 if no substring is found.


.length()
Returns the number of characters currently in the StringBuilder.

.replace()
Switches a substring in a StringBuilder with a specified String and returns the modified object.

.reverse()
Returns a modified StringBuilder object with its character sequence rearranged in the opposite order.

.substring()
Returns a String object representing a substring of the character sequence currently in a given StringBuilder.


.toString()
Returns a String representation of the character sequence currently in a given StringBuilder.


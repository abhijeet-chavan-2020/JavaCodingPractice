package main.java.org.practice;

public class StringBufferPractice {

    //StringBuffer supports a modifiable string.
    //StringBuffer may have
    //characters and substrings inserted in the middle or appended to the end.
    //StringBuffer will automatically grow to make room for such additions and
    //often has more characters preallocated than are actually needed, to allow room
    //for growth.
    //StringBuffer Constructors
    //StringBuffer defines these four constructors:
    //StringBuffer( )
    //StringBuffer(int size)
    //StringBuffer(String str)
    //StringBuffer(CharSequence chars)
    //The default constructor (the one with no parameters) reserves room for 16
    //characters without reallocation.
    //length( ) and capacity( )
    //The current length of a StringBuffer can be found via the length( ) method,
    //while the total allocated capacity can be found through the capacity( ) method.
    //They have the following general forms:
    //int length( )
    //int capacity( ) = length + room for 16 additional chars.
    //If "Hello" has length= 5 thn capacity will be = 21
    //ensureCapacity( )
    //If you want to preallocate room for a certain number of characters after a
    //StringBuffer has been constructed, you can use ensureCapacity( ) to set the
    //size of the buffer.
}

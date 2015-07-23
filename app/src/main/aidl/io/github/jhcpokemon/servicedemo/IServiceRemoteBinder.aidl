// IServiceRemoteBinder.aidl
package io.github.jhcpokemon.servicedemo;

// Declare any non-default types here with import statements

interface IServiceRemoteBinder {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
    void setData(String data);
}

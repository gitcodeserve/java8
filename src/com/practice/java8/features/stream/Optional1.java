package com.practice.java8.features.stream;

import java.util.Optional;

/**
 * @author sahays
 */
public class Optional1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
        
        optional = Optional.empty();

        System.out.println(optional.isPresent());           // false
        //optional.get();                 // null
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "f"
    }

}
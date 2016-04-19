package io.github.benas.unixstream.components;

import io.github.benas.unixstream.Functions;
import io.github.benas.unixstream.Stage;

import java.util.stream.Stream;

/**
 * Replace spaces with tabs in a String.
 * This is the opposite behavior of {@link Expand}.
 *
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public class UnExpand implements Stage<String, String> {

    /**
     * Create a new {@link UnExpand} instance.
     */
    public UnExpand() {
    }

    /**
     * Create a new {@link UnExpand} instance.
     *
     * @return a new {@link UnExpand} instance.
     */
    public static UnExpand unexpand() {
        return new UnExpand();
    }

    @Override
    public Stream<String> apply(Stream<String> input) {
        return input.map(Functions.unexpand());
    }

}

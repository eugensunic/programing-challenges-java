package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawFunctionLineTest {

    @ParameterizedTest(name = "{index} => s={0}, depth={1}, expected={2}")
    @MethodSource("generateData")
    @DisplayName("Should check correct output of ZickZack method")
    void checkGenerateZickZack(String s, int depth, List<String> expected) {
        List<String> actual = DrawFunctionLine.generateZickZack(s, depth);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(
                        "a very warm welcome in the automated system testing team",
                        5,
                        Arrays.asList(
                                "a-------a-------o-------h-------a-------t-------i-------",
                                "- -----w-r-----c-m-----t-e-----m-t-----s-e-----t-n-----m",
                                "--v--- ---m---l---e--- --- ---o---e---y---m---s---g---a-",
                                "---e-y----- -e----- -n-----a-t-----d-s----- -e----- -e--",
                                "----r-------w-------i-------u------- -------t-------t---"
                        )
                )

        );
    }
}

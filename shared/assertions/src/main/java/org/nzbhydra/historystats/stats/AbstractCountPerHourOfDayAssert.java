package org.nzbhydra.historystats.stats;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link CountPerHourOfDay} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCountPerHourOfDayAssert<S extends AbstractCountPerHourOfDayAssert<S, A>, A extends CountPerHourOfDay> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCountPerHourOfDayAssert}</code> to make assertions on actual CountPerHourOfDay.
     *
     * @param actual the CountPerHourOfDay we want to make assertions on.
     */
    protected AbstractCountPerHourOfDayAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CountPerHourOfDay's count is equal to the given one.
     *
     * @param count the given count to compare the actual CountPerHourOfDay's count to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CountPerHourOfDay's count is not equal to the given one.
     */
    public S hasCount(Integer count) {
        // check that actual CountPerHourOfDay we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting count of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualCount = actual.getCount();
        if (!Objects.areEqual(actualCount, count)) {
            failWithMessage(assertjErrorMessage, actual, count, actualCount);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CountPerHourOfDay's hour is equal to the given one.
     *
     * @param hour the given hour to compare the actual CountPerHourOfDay's hour to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CountPerHourOfDay's hour is not equal to the given one.
     */
    public S hasHour(Integer hour) {
        // check that actual CountPerHourOfDay we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting hour of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualHour = actual.getHour();
        if (!Objects.areEqual(actualHour, hour)) {
            failWithMessage(assertjErrorMessage, actual, hour, actualHour);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

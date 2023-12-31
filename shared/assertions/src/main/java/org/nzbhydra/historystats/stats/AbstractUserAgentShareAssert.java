package org.nzbhydra.historystats.stats;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link UserAgentShare} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractUserAgentShareAssert<S extends AbstractUserAgentShareAssert<S, A>, A extends UserAgentShare> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractUserAgentShareAssert}</code> to make assertions on actual UserAgentShare.
     *
     * @param actual the UserAgentShare we want to make assertions on.
     */
    protected AbstractUserAgentShareAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual UserAgentShare's count is equal to the given one.
     *
     * @param count the given count to compare the actual UserAgentShare's count to.
     * @return this assertion object.
     * @throws AssertionError - if the actual UserAgentShare's count is not equal to the given one.
     */
    public S hasCount(int count) {
        // check that actual UserAgentShare we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting count of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualCount = actual.getCount();
        if (actualCount != count) {
            failWithMessage(assertjErrorMessage, actual, count, actualCount);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual UserAgentShare's percentage is equal to the given one.
     *
     * @param percentage the given percentage to compare the actual UserAgentShare's percentage to.
     * @return this assertion object.
     * @throws AssertionError - if the actual UserAgentShare's percentage is not equal to the given one.
     */
    public S hasPercentage(float percentage) {
        // check that actual UserAgentShare we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check value for percentage
        float actualPercentage = actual.getPercentage();
        if (actualPercentage != percentage) {
            failWithMessage(assertjErrorMessage, actual, percentage, actualPercentage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual UserAgentShare's percentage is close to the given value by less than the given offset.
     * <p>
     * If difference is equal to the offset value, assertion is considered successful.
     *
     * @param percentage    the value to compare the actual UserAgentShare's percentage to.
     * @param assertjOffset the given offset.
     * @return this assertion object.
     * @throws AssertionError - if the actual UserAgentShare's percentage is not close enough to the given value.
     */
    public S hasPercentageCloseTo(float percentage, float assertjOffset) {
        // check that actual UserAgentShare we want to make assertions on is not null.
        isNotNull();

        float actualPercentage = actual.getPercentage();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = String.format("\nExpecting percentage:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
            actualPercentage, percentage, assertjOffset, Math.abs(percentage - actualPercentage));

        // check
        Assertions.assertThat(actualPercentage).overridingErrorMessage(assertjErrorMessage).isCloseTo(percentage, Assertions.within(assertjOffset));

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual UserAgentShare's userAgent is equal to the given one.
     *
     * @param userAgent the given userAgent to compare the actual UserAgentShare's userAgent to.
     * @return this assertion object.
     * @throws AssertionError - if the actual UserAgentShare's userAgent is not equal to the given one.
     */
    public S hasUserAgent(String userAgent) {
        // check that actual UserAgentShare we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting userAgent of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualUserAgent = actual.getUserAgent();
        if (!Objects.areEqual(actualUserAgent, userAgent)) {
            failWithMessage(assertjErrorMessage, actual, userAgent, actualUserAgent);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

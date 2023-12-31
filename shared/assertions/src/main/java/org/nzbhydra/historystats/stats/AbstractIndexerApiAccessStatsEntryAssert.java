package org.nzbhydra.historystats.stats;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link IndexerApiAccessStatsEntry} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractIndexerApiAccessStatsEntryAssert<S extends AbstractIndexerApiAccessStatsEntryAssert<S, A>, A extends IndexerApiAccessStatsEntry> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractIndexerApiAccessStatsEntryAssert}</code> to make assertions on actual IndexerApiAccessStatsEntry.
     *
     * @param actual the IndexerApiAccessStatsEntry we want to make assertions on.
     */
    protected AbstractIndexerApiAccessStatsEntryAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's averageAccessesPerDay is equal to the given one.
     *
     * @param averageAccessesPerDay the given averageAccessesPerDay to compare the actual IndexerApiAccessStatsEntry's averageAccessesPerDay to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's averageAccessesPerDay is not equal to the given one.
     */
    public S hasAverageAccessesPerDay(Double averageAccessesPerDay) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting averageAccessesPerDay of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Double actualAverageAccessesPerDay = actual.getAverageAccessesPerDay();
        if (!Objects.areEqual(actualAverageAccessesPerDay, averageAccessesPerDay)) {
            failWithMessage(assertjErrorMessage, actual, averageAccessesPerDay, actualAverageAccessesPerDay);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's averageAccessesPerDay is close to the given value by less than the given offset.
     * <p>
     * If difference is equal to the offset value, assertion is considered successful.
     *
     * @param averageAccessesPerDay the value to compare the actual IndexerApiAccessStatsEntry's averageAccessesPerDay to.
     * @param assertjOffset         the given offset.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's averageAccessesPerDay is not close enough to the given value.
     */
    public S hasAverageAccessesPerDayCloseTo(Double averageAccessesPerDay, Double assertjOffset) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        Double actualAverageAccessesPerDay = actual.getAverageAccessesPerDay();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = String.format("\nExpecting averageAccessesPerDay:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
            actualAverageAccessesPerDay, averageAccessesPerDay, assertjOffset, Math.abs(averageAccessesPerDay - actualAverageAccessesPerDay));

        // check
        Assertions.assertThat(actualAverageAccessesPerDay).overridingErrorMessage(assertjErrorMessage).isCloseTo(averageAccessesPerDay, Assertions.within(assertjOffset));

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's indexerName is equal to the given one.
     *
     * @param indexerName the given indexerName to compare the actual IndexerApiAccessStatsEntry's indexerName to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's indexerName is not equal to the given one.
     */
    public S hasIndexerName(String indexerName) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexerName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIndexerName = actual.getIndexerName();
        if (!Objects.areEqual(actualIndexerName, indexerName)) {
            failWithMessage(assertjErrorMessage, actual, indexerName, actualIndexerName);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's percentConnectionError is equal to the given one.
     *
     * @param percentConnectionError the given percentConnectionError to compare the actual IndexerApiAccessStatsEntry's percentConnectionError to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's percentConnectionError is not equal to the given one.
     */
    public S hasPercentConnectionError(Double percentConnectionError) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentConnectionError of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Double actualPercentConnectionError = actual.getPercentConnectionError();
        if (!Objects.areEqual(actualPercentConnectionError, percentConnectionError)) {
            failWithMessage(assertjErrorMessage, actual, percentConnectionError, actualPercentConnectionError);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's percentConnectionError is close to the given value by less than the given offset.
     * <p>
     * If difference is equal to the offset value, assertion is considered successful.
     *
     * @param percentConnectionError the value to compare the actual IndexerApiAccessStatsEntry's percentConnectionError to.
     * @param assertjOffset          the given offset.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's percentConnectionError is not close enough to the given value.
     */
    public S hasPercentConnectionErrorCloseTo(Double percentConnectionError, Double assertjOffset) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        Double actualPercentConnectionError = actual.getPercentConnectionError();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = String.format("\nExpecting percentConnectionError:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
            actualPercentConnectionError, percentConnectionError, assertjOffset, Math.abs(percentConnectionError - actualPercentConnectionError));

        // check
        Assertions.assertThat(actualPercentConnectionError).overridingErrorMessage(assertjErrorMessage).isCloseTo(percentConnectionError, Assertions.within(assertjOffset));

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's percentSuccessful is equal to the given one.
     *
     * @param percentSuccessful the given percentSuccessful to compare the actual IndexerApiAccessStatsEntry's percentSuccessful to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's percentSuccessful is not equal to the given one.
     */
    public S hasPercentSuccessful(Double percentSuccessful) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentSuccessful of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Double actualPercentSuccessful = actual.getPercentSuccessful();
        if (!Objects.areEqual(actualPercentSuccessful, percentSuccessful)) {
            failWithMessage(assertjErrorMessage, actual, percentSuccessful, actualPercentSuccessful);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerApiAccessStatsEntry's percentSuccessful is close to the given value by less than the given offset.
     * <p>
     * If difference is equal to the offset value, assertion is considered successful.
     *
     * @param percentSuccessful the value to compare the actual IndexerApiAccessStatsEntry's percentSuccessful to.
     * @param assertjOffset     the given offset.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerApiAccessStatsEntry's percentSuccessful is not close enough to the given value.
     */
    public S hasPercentSuccessfulCloseTo(Double percentSuccessful, Double assertjOffset) {
        // check that actual IndexerApiAccessStatsEntry we want to make assertions on is not null.
        isNotNull();

        Double actualPercentSuccessful = actual.getPercentSuccessful();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = String.format("\nExpecting percentSuccessful:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
            actualPercentSuccessful, percentSuccessful, assertjOffset, Math.abs(percentSuccessful - actualPercentSuccessful));

        // check
        Assertions.assertThat(actualPercentSuccessful).overridingErrorMessage(assertjErrorMessage).isCloseTo(percentSuccessful, Assertions.within(assertjOffset));

        // return the current assertion for method chaining
        return myself;
    }

}

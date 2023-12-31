package org.nzbhydra.downloading;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link FileZipResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractFileZipResponseAssert<S extends AbstractFileZipResponseAssert<S, A>, A extends FileZipResponse> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractFileZipResponseAssert}</code> to make assertions on actual FileZipResponse.
     *
     * @param actual the FileZipResponse we want to make assertions on.
     */
    protected AbstractFileZipResponseAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds contains the given Long elements.
     *
     * @param addedIds the given elements that should be contained in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds does not contain all given Long elements.
     */
    public S hasAddedIds(Long... addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getAddedIds(), addedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds contains the given Long elements in Collection.
     *
     * @param addedIds the given elements that should be contained in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds does not contain all given Long elements.
     */
    public S hasAddedIds(java.util.Collection<? extends Long> addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getAddedIds(), addedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds contains <b>only</b> the given Long elements and nothing else in whatever order.
     *
     * @param addedIds the given elements that should be contained in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds does not contain all given Long elements.
     */
    public S hasOnlyAddedIds(Long... addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getAddedIds(), addedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds contains <b>only</b> the given Long elements in Collection and nothing else in whatever order.
     *
     * @param addedIds the given elements that should be contained in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds does not contain all given Long elements.
     */
    public S hasOnlyAddedIds(java.util.Collection<? extends Long> addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getAddedIds(), addedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds does not contain the given Long elements.
     *
     * @param addedIds the given elements that should not be in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds contains any given Long elements.
     */
    public S doesNotHaveAddedIds(Long... addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getAddedIds(), addedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's addedIds does not contain the given Long elements in Collection.
     *
     * @param addedIds the given elements that should not be in actual FileZipResponse's addedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds contains any given Long elements.
     */
    public S doesNotHaveAddedIds(java.util.Collection<? extends Long> addedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (addedIds == null) {
            failWithMessage("Expecting addedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getAddedIds(), addedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse has no addedIds.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's addedIds is not empty.
     */
    public S hasNoAddedIds() {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have addedIds but had :\n  <%s>";

        // check
        if (actual.getAddedIds().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getAddedIds());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual FileZipResponse's message is equal to the given one.
     *
     * @param message the given message to compare the actual FileZipResponse's message to.
     * @return this assertion object.
     * @throws AssertionError - if the actual FileZipResponse's message is not equal to the given one.
     */
    public S hasMessage(String message) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting message of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualMessage = actual.getMessage();
        if (!Objects.areEqual(actualMessage, message)) {
            failWithMessage(assertjErrorMessage, actual, message, actualMessage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds contains the given Long elements.
     *
     * @param missedIds the given elements that should be contained in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds does not contain all given Long elements.
     */
    public S hasMissedIds(Long... missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getMissedIds(), missedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds contains the given Long elements in Collection.
     *
     * @param missedIds the given elements that should be contained in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds does not contain all given Long elements.
     */
    public S hasMissedIds(java.util.Collection<? extends Long> missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getMissedIds(), missedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds contains <b>only</b> the given Long elements and nothing else in whatever order.
     *
     * @param missedIds the given elements that should be contained in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds does not contain all given Long elements.
     */
    public S hasOnlyMissedIds(Long... missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getMissedIds(), missedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds contains <b>only</b> the given Long elements in Collection and nothing else in whatever order.
     *
     * @param missedIds the given elements that should be contained in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds does not contain all given Long elements.
     */
    public S hasOnlyMissedIds(java.util.Collection<? extends Long> missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getMissedIds(), missedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds does not contain the given Long elements.
     *
     * @param missedIds the given elements that should not be in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds contains any given Long elements.
     */
    public S doesNotHaveMissedIds(Long... missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long varargs is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getMissedIds(), missedIds);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's missedIds does not contain the given Long elements in Collection.
     *
     * @param missedIds the given elements that should not be in actual FileZipResponse's missedIds.
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds contains any given Long elements.
     */
    public S doesNotHaveMissedIds(java.util.Collection<? extends Long> missedIds) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that given Long collection is not null.
        if (missedIds == null) {
            failWithMessage("Expecting missedIds parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getMissedIds(), missedIds.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse has no missedIds.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual FileZipResponse's missedIds is not empty.
     */
    public S hasNoMissedIds() {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have missedIds but had :\n  <%s>";

        // check
        if (actual.getMissedIds().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getMissedIds());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual FileZipResponse is successful.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual FileZipResponse is not successful.
     */
    public S isSuccessful() {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isSuccessful()) {
            failWithMessage("\nExpecting that actual FileZipResponse is successful but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse is not successful.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual FileZipResponse is successful.
     */
    public S isNotSuccessful() {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isSuccessful()) {
            failWithMessage("\nExpecting that actual FileZipResponse is not successful but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual FileZipResponse's zipFilepath is equal to the given one.
     *
     * @param zipFilepath the given zipFilepath to compare the actual FileZipResponse's zipFilepath to.
     * @return this assertion object.
     * @throws AssertionError - if the actual FileZipResponse's zipFilepath is not equal to the given one.
     */
    public S hasZipFilepath(String zipFilepath) {
        // check that actual FileZipResponse we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting zipFilepath of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualZipFilepath = actual.getZipFilepath();
        if (!Objects.areEqual(actualZipFilepath, zipFilepath)) {
            failWithMessage(assertjErrorMessage, actual, zipFilepath, actualZipFilepath);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

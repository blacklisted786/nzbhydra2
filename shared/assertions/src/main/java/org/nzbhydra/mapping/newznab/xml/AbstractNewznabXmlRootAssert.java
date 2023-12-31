package org.nzbhydra.mapping.newznab.xml;

import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link NewznabXmlRoot} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractNewznabXmlRootAssert<S extends AbstractNewznabXmlRootAssert<S, A>, A extends NewznabXmlRoot> extends AbstractXmlAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractNewznabXmlRootAssert}</code> to make assertions on actual NewznabXmlRoot.
     *
     * @param actual the NewznabXmlRoot we want to make assertions on.
     */
    protected AbstractNewznabXmlRootAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual NewznabXmlRoot's error is equal to the given one.
     *
     * @param error the given error to compare the actual NewznabXmlRoot's error to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlRoot's error is not equal to the given one.
     */
    public S hasError(NewznabXmlError error) {
        // check that actual NewznabXmlRoot we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting error of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabXmlError actualError = actual.getError();
        if (!Objects.areEqual(actualError, error)) {
            failWithMessage(assertjErrorMessage, actual, error, actualError);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlRoot's rssChannel is equal to the given one.
     *
     * @param rssChannel the given rssChannel to compare the actual NewznabXmlRoot's rssChannel to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlRoot's rssChannel is not equal to the given one.
     */
    public S hasRssChannel(NewznabXmlChannel rssChannel) {
        // check that actual NewznabXmlRoot we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting rssChannel of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabXmlChannel actualRssChannel = actual.getRssChannel();
        if (!Objects.areEqual(actualRssChannel, rssChannel)) {
            failWithMessage(assertjErrorMessage, actual, rssChannel, actualRssChannel);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlRoot's version is equal to the given one.
     *
     * @param version the given version to compare the actual NewznabXmlRoot's version to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlRoot's version is not equal to the given one.
     */
    public S hasVersion(String version) {
        // check that actual NewznabXmlRoot we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting version of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualVersion = actual.getVersion();
        if (!Objects.areEqual(actualVersion, version)) {
            failWithMessage(assertjErrorMessage, actual, version, actualVersion);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

package org.nzbhydra.mapping.newznab.json;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link NewznabJsonChannel} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractNewznabJsonChannelAssert<S extends AbstractNewznabJsonChannelAssert<S, A>, A extends NewznabJsonChannel> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractNewznabJsonChannelAssert}</code> to make assertions on actual NewznabJsonChannel.
     *
     * @param actual the NewznabJsonChannel we want to make assertions on.
     */
    protected AbstractNewznabJsonChannelAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual NewznabJsonChannel's category is equal to the given one.
     *
     * @param category the given category to compare the actual NewznabJsonChannel's category to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's category is not equal to the given one.
     */
    public S hasCategory(java.util.Map category) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        java.util.Map actualCategory = actual.getCategory();
        if (!Objects.areEqual(actualCategory, category)) {
            failWithMessage(assertjErrorMessage, actual, category, actualCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's description is equal to the given one.
     *
     * @param description the given description to compare the actual NewznabJsonChannel's description to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's description is not equal to the given one.
     */
    public S hasDescription(String description) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDescription = actual.getDescription();
        if (!Objects.areEqual(actualDescription, description)) {
            failWithMessage(assertjErrorMessage, actual, description, actualDescription);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's generator is equal to the given one.
     *
     * @param generator the given generator to compare the actual NewznabJsonChannel's generator to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's generator is not equal to the given one.
     */
    public S hasGenerator(String generator) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting generator of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualGenerator = actual.getGenerator();
        if (!Objects.areEqual(actualGenerator, generator)) {
            failWithMessage(assertjErrorMessage, actual, generator, actualGenerator);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's image is equal to the given one.
     *
     * @param image the given image to compare the actual NewznabJsonChannel's image to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's image is not equal to the given one.
     */
    public S hasImage(NewznabJsonImage image) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting image of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabJsonImage actualImage = actual.getImage();
        if (!Objects.areEqual(actualImage, image)) {
            failWithMessage(assertjErrorMessage, actual, image, actualImage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item contains the given NewznabJsonItem elements.
     *
     * @param item the given elements that should be contained in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item does not contain all given NewznabJsonItem elements.
     */
    public S hasItem(NewznabJsonItem... item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem varargs is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getItem(), item);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item contains the given NewznabJsonItem elements in Collection.
     *
     * @param item the given elements that should be contained in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item does not contain all given NewznabJsonItem elements.
     */
    public S hasItem(java.util.Collection<? extends NewznabJsonItem> item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem collection is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getItem(), item.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item contains <b>only</b> the given NewznabJsonItem elements and nothing else in whatever order.
     *
     * @param item the given elements that should be contained in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item does not contain all given NewznabJsonItem elements.
     */
    public S hasOnlyItem(NewznabJsonItem... item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem varargs is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getItem(), item);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item contains <b>only</b> the given NewznabJsonItem elements in Collection and nothing else in whatever order.
     *
     * @param item the given elements that should be contained in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item does not contain all given NewznabJsonItem elements.
     */
    public S hasOnlyItem(java.util.Collection<? extends NewznabJsonItem> item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem collection is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getItem(), item.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item does not contain the given NewznabJsonItem elements.
     *
     * @param item the given elements that should not be in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item contains any given NewznabJsonItem elements.
     */
    public S doesNotHaveItem(NewznabJsonItem... item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem varargs is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getItem(), item);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's item does not contain the given NewznabJsonItem elements in Collection.
     *
     * @param item the given elements that should not be in actual NewznabJsonChannel's item.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item contains any given NewznabJsonItem elements.
     */
    public S doesNotHaveItem(java.util.Collection<? extends NewznabJsonItem> item) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabJsonItem collection is not null.
        if (item == null) {
            failWithMessage("Expecting item parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getItem(), item.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel has no item.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabJsonChannel's item is not empty.
     */
    public S hasNoItem() {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have item but had :\n  <%s>";

        // check
        if (actual.getItem().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getItem());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual NewznabJsonChannel's language is equal to the given one.
     *
     * @param language the given language to compare the actual NewznabJsonChannel's language to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's language is not equal to the given one.
     */
    public S hasLanguage(String language) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting language of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualLanguage = actual.getLanguage();
        if (!Objects.areEqual(actualLanguage, language)) {
            failWithMessage(assertjErrorMessage, actual, language, actualLanguage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's link is equal to the given one.
     *
     * @param link the given link to compare the actual NewznabJsonChannel's link to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's link is not equal to the given one.
     */
    public S hasLink(String link) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting link of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualLink = actual.getLink();
        if (!Objects.areEqual(actualLink, link)) {
            failWithMessage(assertjErrorMessage, actual, link, actualLink);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's response is equal to the given one.
     *
     * @param response the given response to compare the actual NewznabJsonChannel's response to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's response is not equal to the given one.
     */
    public S hasResponse(NewznabJsonChannelResponse response) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting response of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabJsonChannelResponse actualResponse = actual.getResponse();
        if (!Objects.areEqual(actualResponse, response)) {
            failWithMessage(assertjErrorMessage, actual, response, actualResponse);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's title is equal to the given one.
     *
     * @param title the given title to compare the actual NewznabJsonChannel's title to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's title is not equal to the given one.
     */
    public S hasTitle(String title) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTitle = actual.getTitle();
        if (!Objects.areEqual(actualTitle, title)) {
            failWithMessage(assertjErrorMessage, actual, title, actualTitle);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabJsonChannel's webMaster is equal to the given one.
     *
     * @param webMaster the given webMaster to compare the actual NewznabJsonChannel's webMaster to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabJsonChannel's webMaster is not equal to the given one.
     */
    public S hasWebMaster(String webMaster) {
        // check that actual NewznabJsonChannel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting webMaster of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualWebMaster = actual.getWebMaster();
        if (!Objects.areEqual(actualWebMaster, webMaster)) {
            failWithMessage(assertjErrorMessage, actual, webMaster, actualWebMaster);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

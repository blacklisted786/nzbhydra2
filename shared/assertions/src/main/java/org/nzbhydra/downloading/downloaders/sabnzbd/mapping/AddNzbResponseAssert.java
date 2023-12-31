package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

/**
 * {@link AddNzbResponse} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractAddNzbResponseAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class AddNzbResponseAssert extends AbstractAddNzbResponseAssert<AddNzbResponseAssert, AddNzbResponse> {

    /**
     * Creates a new <code>{@link AddNzbResponseAssert}</code> to make assertions on actual AddNzbResponse.
     *
     * @param actual the AddNzbResponse we want to make assertions on.
     */
    public AddNzbResponseAssert(AddNzbResponse actual) {
        super(actual, AddNzbResponseAssert.class);
    }

    /**
     * An entry point for AddNzbResponseAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myAddNzbResponse)</code> and get specific assertion with code completion.
     *
     * @param actual the AddNzbResponse we want to make assertions on.
     * @return a new <code>{@link AddNzbResponseAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static AddNzbResponseAssert assertThat(AddNzbResponse actual) {
        return new AddNzbResponseAssert(actual);
    }
}

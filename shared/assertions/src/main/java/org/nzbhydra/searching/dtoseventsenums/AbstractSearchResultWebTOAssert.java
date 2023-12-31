package org.nzbhydra.searching.dtoseventsenums;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link SearchResultWebTO} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractSearchResultWebTOAssert<S extends AbstractSearchResultWebTOAssert<S, A>, A extends SearchResultWebTO> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractSearchResultWebTOAssert}</code> to make assertions on actual SearchResultWebTO.
     *
     * @param actual the SearchResultWebTO we want to make assertions on.
     */
    protected AbstractSearchResultWebTOAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual SearchResultWebTO's age is equal to the given one.
     *
     * @param age the given age to compare the actual SearchResultWebTO's age to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's age is not equal to the given one.
     */
    public S hasAge(String age) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting age of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualAge = actual.getAge();
        if (!Objects.areEqual(actualAge, age)) {
            failWithMessage(assertjErrorMessage, actual, age, actualAge);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's age_precise is equal to the given one.
     *
     * @param age_precise the given age_precise to compare the actual SearchResultWebTO's age_precise to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's age_precise is not equal to the given one.
     */
    public S hasAge_precise(Boolean age_precise) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting age_precise of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Boolean actualAge_precise = actual.getAge_precise();
        if (!Objects.areEqual(actualAge_precise, age_precise)) {
            failWithMessage(assertjErrorMessage, actual, age_precise, actualAge_precise);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's category is equal to the given one.
     *
     * @param category the given category to compare the actual SearchResultWebTO's category to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's category is not equal to the given one.
     */
    public S hasCategory(String category) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCategory = actual.getCategory();
        if (!Objects.areEqual(actualCategory, category)) {
            failWithMessage(assertjErrorMessage, actual, category, actualCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's comments is equal to the given one.
     *
     * @param comments the given comments to compare the actual SearchResultWebTO's comments to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's comments is not equal to the given one.
     */
    public S hasComments(Integer comments) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting comments of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualComments = actual.getComments();
        if (!Objects.areEqual(actualComments, comments)) {
            failWithMessage(assertjErrorMessage, actual, comments, actualComments);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's cover is equal to the given one.
     *
     * @param cover the given cover to compare the actual SearchResultWebTO's cover to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's cover is not equal to the given one.
     */
    public S hasCover(String cover) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting cover of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCover = actual.getCover();
        if (!Objects.areEqual(actualCover, cover)) {
            failWithMessage(assertjErrorMessage, actual, cover, actualCover);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's date is equal to the given one.
     *
     * @param date the given date to compare the actual SearchResultWebTO's date to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's date is not equal to the given one.
     */
    public S hasDate(String date) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting date of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDate = actual.getDate();
        if (!Objects.areEqual(actualDate, date)) {
            failWithMessage(assertjErrorMessage, actual, date, actualDate);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's details_link is equal to the given one.
     *
     * @param details_link the given details_link to compare the actual SearchResultWebTO's details_link to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's details_link is not equal to the given one.
     */
    public S hasDetails_link(String details_link) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting details_link of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDetails_link = actual.getDetails_link();
        if (!Objects.areEqual(actualDetails_link, details_link)) {
            failWithMessage(assertjErrorMessage, actual, details_link, actualDetails_link);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's downloadType is equal to the given one.
     *
     * @param downloadType the given downloadType to compare the actual SearchResultWebTO's downloadType to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's downloadType is not equal to the given one.
     */
    public S hasDownloadType(String downloadType) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting downloadType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDownloadType = actual.getDownloadType();
        if (!Objects.areEqual(actualDownloadType, downloadType)) {
            failWithMessage(assertjErrorMessage, actual, downloadType, actualDownloadType);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's downloadedAt is equal to the given one.
     *
     * @param downloadedAt the given downloadedAt to compare the actual SearchResultWebTO's downloadedAt to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's downloadedAt is not equal to the given one.
     */
    public S hasDownloadedAt(String downloadedAt) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting downloadedAt of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDownloadedAt = actual.getDownloadedAt();
        if (!Objects.areEqual(actualDownloadedAt, downloadedAt)) {
            failWithMessage(assertjErrorMessage, actual, downloadedAt, actualDownloadedAt);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's episode is equal to the given one.
     *
     * @param episode the given episode to compare the actual SearchResultWebTO's episode to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's episode is not equal to the given one.
     */
    public S hasEpisode(String episode) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting episode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualEpisode = actual.getEpisode();
        if (!Objects.areEqual(actualEpisode, episode)) {
            failWithMessage(assertjErrorMessage, actual, episode, actualEpisode);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's epoch is equal to the given one.
     *
     * @param epoch the given epoch to compare the actual SearchResultWebTO's epoch to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's epoch is not equal to the given one.
     */
    public S hasEpoch(Long epoch) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting epoch of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualEpoch = actual.getEpoch();
        if (!Objects.areEqual(actualEpoch, epoch)) {
            failWithMessage(assertjErrorMessage, actual, epoch, actualEpoch);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's files is equal to the given one.
     *
     * @param files the given files to compare the actual SearchResultWebTO's files to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's files is not equal to the given one.
     */
    public S hasFiles(Integer files) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting files of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualFiles = actual.getFiles();
        if (!Objects.areEqual(actualFiles, files)) {
            failWithMessage(assertjErrorMessage, actual, files, actualFiles);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's grabs is equal to the given one.
     *
     * @param grabs the given grabs to compare the actual SearchResultWebTO's grabs to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's grabs is not equal to the given one.
     */
    public S hasGrabs(Integer grabs) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting grabs of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualGrabs = actual.getGrabs();
        if (!Objects.areEqual(actualGrabs, grabs)) {
            failWithMessage(assertjErrorMessage, actual, grabs, actualGrabs);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's hasNfo is equal to the given one.
     *
     * @param hasNfo the given hasNfo to compare the actual SearchResultWebTO's hasNfo to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's hasNfo is not equal to the given one.
     */
    public S hasHasNfo(String hasNfo) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting hasNfo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualHasNfo = actual.getHasNfo();
        if (!Objects.areEqual(actualHasNfo, hasNfo)) {
            failWithMessage(assertjErrorMessage, actual, hasNfo, actualHasNfo);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's hash is equal to the given one.
     *
     * @param hash the given hash to compare the actual SearchResultWebTO's hash to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's hash is not equal to the given one.
     */
    public S hasHash(Integer hash) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting hash of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualHash = actual.getHash();
        if (!Objects.areEqual(actualHash, hash)) {
            failWithMessage(assertjErrorMessage, actual, hash, actualHash);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's indexer is equal to the given one.
     *
     * @param indexer the given indexer to compare the actual SearchResultWebTO's indexer to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's indexer is not equal to the given one.
     */
    public S hasIndexer(String indexer) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexer of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIndexer = actual.getIndexer();
        if (!Objects.areEqual(actualIndexer, indexer)) {
            failWithMessage(assertjErrorMessage, actual, indexer, actualIndexer);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's indexerguid is equal to the given one.
     *
     * @param indexerguid the given indexerguid to compare the actual SearchResultWebTO's indexerguid to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's indexerguid is not equal to the given one.
     */
    public S hasIndexerguid(String indexerguid) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexerguid of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIndexerguid = actual.getIndexerguid();
        if (!Objects.areEqual(actualIndexerguid, indexerguid)) {
            failWithMessage(assertjErrorMessage, actual, indexerguid, actualIndexerguid);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's indexerscore is equal to the given one.
     *
     * @param indexerscore the given indexerscore to compare the actual SearchResultWebTO's indexerscore to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's indexerscore is not equal to the given one.
     */
    public S hasIndexerscore(Integer indexerscore) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexerscore of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualIndexerscore = actual.getIndexerscore();
        if (!Objects.areEqual(actualIndexerscore, indexerscore)) {
            failWithMessage(assertjErrorMessage, actual, indexerscore, actualIndexerscore);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's link is equal to the given one.
     *
     * @param link the given link to compare the actual SearchResultWebTO's link to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's link is not equal to the given one.
     */
    public S hasLink(String link) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
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
     * Verifies that the actual SearchResultWebTO's originalCategory is equal to the given one.
     *
     * @param originalCategory the given originalCategory to compare the actual SearchResultWebTO's originalCategory to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's originalCategory is not equal to the given one.
     */
    public S hasOriginalCategory(String originalCategory) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting originalCategory of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualOriginalCategory = actual.getOriginalCategory();
        if (!Objects.areEqual(actualOriginalCategory, originalCategory)) {
            failWithMessage(assertjErrorMessage, actual, originalCategory, actualOriginalCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's peers is equal to the given one.
     *
     * @param peers the given peers to compare the actual SearchResultWebTO's peers to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's peers is not equal to the given one.
     */
    public S hasPeers(Integer peers) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting peers of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualPeers = actual.getPeers();
        if (!Objects.areEqual(actualPeers, peers)) {
            failWithMessage(assertjErrorMessage, actual, peers, actualPeers);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's poster is equal to the given one.
     *
     * @param poster the given poster to compare the actual SearchResultWebTO's poster to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's poster is not equal to the given one.
     */
    public S hasPoster(String poster) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting poster of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualPoster = actual.getPoster();
        if (!Objects.areEqual(actualPoster, poster)) {
            failWithMessage(assertjErrorMessage, actual, poster, actualPoster);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's searchResultId is equal to the given one.
     *
     * @param searchResultId the given searchResultId to compare the actual SearchResultWebTO's searchResultId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's searchResultId is not equal to the given one.
     */
    public S hasSearchResultId(String searchResultId) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting searchResultId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualSearchResultId = actual.getSearchResultId();
        if (!Objects.areEqual(actualSearchResultId, searchResultId)) {
            failWithMessage(assertjErrorMessage, actual, searchResultId, actualSearchResultId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's season is equal to the given one.
     *
     * @param season the given season to compare the actual SearchResultWebTO's season to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's season is not equal to the given one.
     */
    public S hasSeason(String season) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting season of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualSeason = actual.getSeason();
        if (!Objects.areEqual(actualSeason, season)) {
            failWithMessage(assertjErrorMessage, actual, season, actualSeason);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's seeders is equal to the given one.
     *
     * @param seeders the given seeders to compare the actual SearchResultWebTO's seeders to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's seeders is not equal to the given one.
     */
    public S hasSeeders(Integer seeders) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting seeders of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualSeeders = actual.getSeeders();
        if (!Objects.areEqual(actualSeeders, seeders)) {
            failWithMessage(assertjErrorMessage, actual, seeders, actualSeeders);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's showtitle is equal to the given one.
     *
     * @param showtitle the given showtitle to compare the actual SearchResultWebTO's showtitle to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's showtitle is not equal to the given one.
     */
    public S hasShowtitle(String showtitle) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting showtitle of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualShowtitle = actual.getShowtitle();
        if (!Objects.areEqual(actualShowtitle, showtitle)) {
            failWithMessage(assertjErrorMessage, actual, showtitle, actualShowtitle);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's size is equal to the given one.
     *
     * @param size the given size to compare the actual SearchResultWebTO's size to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's size is not equal to the given one.
     */
    public S hasSize(Long size) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting size of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualSize = actual.getSize();
        if (!Objects.areEqual(actualSize, size)) {
            failWithMessage(assertjErrorMessage, actual, size, actualSize);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's source is equal to the given one.
     *
     * @param source the given source to compare the actual SearchResultWebTO's source to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's source is not equal to the given one.
     */
    public S hasSource(String source) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting source of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualSource = actual.getSource();
        if (!Objects.areEqual(actualSource, source)) {
            failWithMessage(assertjErrorMessage, actual, source, actualSource);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchResultWebTO's title is equal to the given one.
     *
     * @param title the given title to compare the actual SearchResultWebTO's title to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's title is not equal to the given one.
     */
    public S hasTitle(String title) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
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
     * Verifies that the actual SearchResultWebTO's torrentDownloadFactor is equal to the given one.
     *
     * @param torrentDownloadFactor the given torrentDownloadFactor to compare the actual SearchResultWebTO's torrentDownloadFactor to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchResultWebTO's torrentDownloadFactor is not equal to the given one.
     */
    public S hasTorrentDownloadFactor(String torrentDownloadFactor) {
        // check that actual SearchResultWebTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting torrentDownloadFactor of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTorrentDownloadFactor = actual.getTorrentDownloadFactor();
        if (!Objects.areEqual(actualTorrentDownloadFactor, torrentDownloadFactor)) {
            failWithMessage(assertjErrorMessage, actual, torrentDownloadFactor, actualTorrentDownloadFactor);
        }

        // return the current assertion for method chaining
        return myself;
    }

}

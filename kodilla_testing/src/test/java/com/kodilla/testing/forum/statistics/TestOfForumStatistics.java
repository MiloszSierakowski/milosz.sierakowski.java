package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DisplayName("TDD: Forum Test Suite")
public class TestOfForumStatistics {

    private Statistics statistics;

    private ForumStatistics forumStatistics;

    @BeforeEach
    void setUp() {
        statistics = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Nested
    class PostsTests {
        @Test
        void testCalculateAdvStatisticsWhenNumberOfPostIs0() {
            when(statistics.postsCount()).thenReturn(0);
            forumStatistics.calculateAdvStatistics(statistics);

            assertEquals(0, forumStatistics.getNumberOfPosts());
            assertEquals(0, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost());
        }

        @Test
        void testCalculateAdvStatisticsWhenNumberOfPostIs1000() {
            when(statistics.postsCount()).thenReturn(1000);
            forumStatistics.calculateAdvStatistics(statistics);

            assertEquals(1000, forumStatistics.getNumberOfPosts());
        }
    }

    @Nested
    class UsersTest {

        private List<String> generateListOfUsers(int numberOfUser) {
            List<String> listOfUsers = new ArrayList<>();

            for (int i = 0; i < numberOfUser; i++) {
                String user = "User number " + i;
                listOfUsers.add(user);
            }

            return listOfUsers;
        }

        @Test
        void testCalculateAdvStatisticsWhenNumberOfUserIs0() {
            List<String> listOfUserUsedForTest = generateListOfUsers(0);

            when(statistics.usersNames()).thenReturn(listOfUserUsedForTest);
            forumStatistics.calculateAdvStatistics(statistics);

            assertEquals(0, forumStatistics.getNumberOfUsers());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfPostsPerUser());
        }

        @Test
        void testCalculateAdvStatisticsWhenNumberOfUserIs100() {
            List<String> listOfUserUsedForTest = generateListOfUsers(100);

            when(statistics.usersNames()).thenReturn(listOfUserUsedForTest);
            forumStatistics.calculateAdvStatistics(statistics);

            assertEquals(100, forumStatistics.getNumberOfUsers());
        }
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIs0() {
        when(statistics.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statistics);

        assertEquals(0, forumStatistics.getNumberOfComments());
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIsSmallerThanNumberOfPosts() {
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        forumStatistics.calculateAdvStatistics(statistics);

        assertEquals(10,forumStatistics.getNumberOfComments());
        assertEquals(100,forumStatistics.getNumberOfPosts());
        assertEquals(0.1,forumStatistics.getAverageNumberOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIsHigherThanNumberOfPosts() {
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        forumStatistics.calculateAdvStatistics(statistics);

        assertEquals(100,forumStatistics.getNumberOfComments());
        assertEquals(10,forumStatistics.getNumberOfPosts());
        assertEquals(10,forumStatistics.getAverageNumberOfCommentsPerPost());
    }
}

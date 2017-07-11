package com.fstyle.structure_android.data.source;

import com.fstyle.structure_android.data.source.local.realm.UserLocalDataSource;
import com.fstyle.structure_android.data.source.remote.UserRemoteDataSource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by Sun on 3/11/2017.
 */
public class UserRepositoryTest {

    private static final String USER_LOGIN_1 = "abc";
    private static final String USER_LOGIN_2 = "def";

    @InjectMocks
    private UserRepositoryImpl mUserRepository;
    @Mock
    UserLocalDataSource mLocalDataSource;
    @Mock
    UserRemoteDataSource mRemoteDataSource;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void searchUsers_200ResponseCode_InvokesCorrectApiCalls() {
//        User user = new User(USER_LOGIN_1);
//        User user2 = new User(USER_LOGIN_2);
//
//        List<User> userReturns = new ArrayList<>();
//        userReturns.add(user);
//        userReturns.add(user2);
//        // Given
//        Mockito.when(mRemoteDataSource.searchUsers(ArgumentMatchers.anyInt(),
//                ArgumentMatchers.anyString())).thenReturn(Observable.just(userReturns));
//
//        // When
//        TestSubscriber<List<User>> subscriber = new TestSubscriber<>();
//        mUserRepository.searchUsers(2, USER_LOGIN_1).subscribe(subscriber);
//
//        // Then
//        subscriber.awaitTerminalEvent();
//        subscriber.assertNoErrors();
//
//        List<List<User>> onNextEvents = subscriber.getOnNextEvents();
//        List<User> users = onNextEvents.get(0);
//        Assert.assertEquals(USER_LOGIN_1, users.get(0).getLogin());
//        Assert.assertEquals(USER_LOGIN_2, users.get(1).getLogin());
//        Mockito.verify(mRemoteDataSource).searchUsers(2, USER_LOGIN_1);
    }

    @Test
    public void searchUsers_OtherHttpError_SearchTerminatedWithError() {
//        // Given
//        Mockito.when(mRemoteDataSource.searchUsers(ArgumentMatchers.anyInt(),
//                ArgumentMatchers.anyString()))
//                .thenReturn(Observable.<List<User>>error(new HttpException(Response.error(403,
//                        ResponseBody.create(MediaType.parse("application/json"), "Forbidden")))));
//
//        // When
//        TestSubscriber<List<User>> subscriber = new TestSubscriber<>();
//        mUserRepository.searchUsers(2, USER_LOGIN_1).subscribe(subscriber);
//
//        // Then
//        subscriber.awaitTerminalEvent();
//        subscriber.assertError(HttpException.class);
//
//        Mockito.verify(mRemoteDataSource).searchUsers(2, USER_LOGIN_1);
//        Mockito.verify(mRemoteDataSource, Mockito.never()).searchUsers(2, USER_LOGIN_2);
    }
}

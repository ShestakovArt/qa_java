package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LeoAlexParameterizedTest {

    private final String typeAnimalFriend;
    private final String friendsName;

    public LeoAlexParameterizedTest(String typeAnimalFriend, String friendsName) {
        this.typeAnimalFriend = typeAnimalFriend;
        this.friendsName = friendsName;
    }

    @Parameterized.Parameters
    public static Object[][] getFriendsData() {
        return new Object[][] {
                { "Зебра", "Марти"},
                { "Бегемот", "Глория"},
                { "Жираф", "Мелман"},
        };
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        LeoAlex alex = new LeoAlex(feline);
        assertEquals(friendsName, alex.getFriends().get(typeAnimalFriend));
    }
}
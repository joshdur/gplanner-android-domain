package com.drk.tools.contextandroid.planner.atoms;

import com.drk.tools.contextandroid.planner.variables.*;
import com.drk.tools.gplannercore.core.Atom;

public class MainAtoms {
    public static AddedElement addedElement = new AddedElement();
    public static MockPending mockPending = new MockPending();
    public static LaunchPending launchPending = new LaunchPending();
    public static ScreenNavigationPending screenNavigationPending = new ScreenNavigationPending();
    public static IsSearchFinished isSearchFinished = new IsSearchFinished();
    public static LaunchIntentPending launchIntentPending = new LaunchIntentPending();
    public static Mocked mocked = new Mocked();
    public static At at = new At();
    public static NavigateTo navigateTo = new NavigateTo();
    public static IntentTo intentTo = new IntentTo();
    public static IntentChecked intentChecked = new IntentChecked();
    public static ScreenChecked screenChecked = new ScreenChecked();
    public static ElementVisible elementVisible = new ElementVisible();
    public static ElementStateChecked elementStateChecked = new ElementStateChecked();
    public static PagerElementVisible pagerElementVisible = new PagerElementVisible();
    public static ElementTextChecked elementTextChecked = new ElementTextChecked();
    public static ElementClicked elementClicked = new ElementClicked();
    public static ElementTextSet elementTextSet = new ElementTextSet();
    public static BackAt backAt = new BackAt();

    public static class AddedElement extends Atom<Element> {

    }

    public static class MockPending extends Atom<Bool> {

    }

    public static class Mocked extends Atom<Mock> {

    }

    public static class LaunchPending extends Atom<Bool> {

    }

    public static class ScreenNavigationPending extends Atom<Bool> {

    }

    public static class LaunchIntentPending extends Atom<Bool> {

    }


    public static class IsSearchFinished extends Atom<Bool> {

    }

    public static class At extends Atom<Screen> {

    }

    public static class NavigateTo extends Atom<Screen> {

    }

    public static class IntentTo extends Atom<Intent> {

    }

    public static class IntentChecked extends Atom<Intent> {

    }

    public static class ElementVisible extends Atom<Element> {

    }

    public static class ElementStateChecked extends Atom<Element> {

    }

    public static class PagerElementVisible extends Atom<PagerElement> {

    }

    public static class ElementTextChecked extends Atom<Element> {

    }

    public static class ElementClicked extends Atom<Element> {

    }

    public static class ElementTextSet extends Atom<Element> {

    }

    public static class BackAt extends Atom<Screen> {

    }

    public static class ScreenChecked extends Atom<Screen> {

    }
}

# PreferenceApp
This an Android demonstration App how to use `PreferenceFragmentCompat`.

**What works so far**
- Create an `Activity` which host a `PreferenceFragmentCompat`.
- Use an `xml` file for the preferences that contains a `PreferenceScreen` with and inner `PreferenceScreen`
- Handles the `PreferenceScreen` open
- Handles orientation changes without retain-instance on fragment or locking the `Activity`
- Handles android back button for going to previous screen

**Pending. TODO**
- Hanlde home action for navigation back.

**Implementation Info**

`PreferenceFragmentCompat` is part of the android extended support library, you can use it by adding to your `build.gradle`:

    compile 'com.android.support:preference-v7:23.0.1'

The purpose of this project is to implement `onPreferenceStartScreen` so as to show how you can make your preference sub-screens work when they are part of other `PreferenceScreen`s

`onPreferenceStartScreen` should be implemented by the Activity that hosts our fragment. The implementation should use the `FragmentManager` in order to add one more fragment to the backstack and not just switch the PreferenceFragment screen. 

In order to achieve code re-usuability and also keep the older logic where the whole code of handling preferences was in one java class you should take care of the `ARG_PREFERENCE_ROOT` that is used by the parent of the `PreferenceFragmentCompat` in order to re-create your fragment in different states. This can be done with the `setPreferencesFromResource(@XmlRes int preferencesResId, @Nullable String key) ` that are provided by `onCreatePreferences` method.


**Related links**

- https://code.google.com/p/android/issues/detail?id=185849
- http://stackoverflow.com/a/32540395/944070

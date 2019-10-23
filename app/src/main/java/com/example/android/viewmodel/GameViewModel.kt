package com.example.android.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.navigation.GameFragment
import timber.log.Timber


//For every configuration change,
// new ViewModel is created, if we create ViewModel from constructor
// instead create ViewModel instance using a ViewModelProvider
// ViewModel is retained as long as the scope is alive. If the scope is a fragment, then ViewModel is
// retained until the fragment is detached

class GameViewModel : ViewModel() {

    // The first answer is the correct one.  We randomize the answers before showing the text.
    // All questions must have four answers.  We'd want these to contain references to string
    // resources so we could internationalize. (Or better yet, don't define the questions in code...)
    val questions: MutableList<GameFragment.Question> = mutableListOf(
        GameFragment.Question(
            text = "What is Android Jetpack?",
            answers = listOf("All of these", "Tools", "Documentation", "Libraries")
        ),
        GameFragment.Question(
            text = "What is the base class for layouts?",
            answers = listOf("ViewGroup", "ViewSet", "ViewCollection", "ViewRoot")
        ),
        GameFragment.Question(
            text = "What layout do you use for complex screens?",
            answers = listOf("ConstraintLayout", "GridLayout", "LinearLayout", "FrameLayout")
        ),
        GameFragment.Question(
            text = "What do you use to push structured data into a layout?",
            answers = listOf("Data binding", "Data pushing", "Set text", "An OnClick method")
        ),
        GameFragment.Question(
            text = "What method do you use to inflate layouts in fragments?",
            answers = listOf(
                "onCreateView()",
                "onActivityCreated()",
                "onCreateLayout()",
                "onInflateLayout()"
            )
        ),
        GameFragment.Question(
            text = "What's the build system for Android?",
            answers = listOf("Gradle", "Graddle", "Grodle", "Groyle")
        ),
        GameFragment.Question(
            text = "Which class do you use to create a vector drawable?",
            answers = listOf(
                "VectorDrawable",
                "AndroidVectorDrawable",
                "DrawableVector",
                "AndroidVector"
            )
        ),
        GameFragment.Question(
            text = "Which one of these is an Android navigation component?",
            answers = listOf("NavController", "NavCentral", "NavMaster", "NavSwitcher")
        ),
        GameFragment.Question(
            text = "Which XML element lets you register an activity with the launcher activity?",
            answers = listOf("intent-filter", "app-registry", "launcher-registry", "app-launcher")
        ),
        GameFragment.Question(
            text = "What do you use to mark a layout for data binding?",
            answers = listOf("<layout>", "<binding>", "<data-binding>", "<dbinding>")
        )
    )

    //ViewModel - onCleared() callback is called to clean up the resources
    override fun onCleared() {
        super.onCleared()
        Timber.i("GameViewModel onCleared")
    }

}
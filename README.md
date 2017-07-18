## Structure_Android
[![CircleCI](https://circleci.com/gh/daolq3012/Structure_Android/tree/master.svg?style=shield)](https://circleci.com/gh/daolq3012/Structure_Android/tree/master)
[![License: CC BY 4.0](https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by/4.0/)

A Project common structure on Android used based on [googlesamples/android-architecture](https://github.com/googlesamples/android-architecture) :

- Create 4 architect **MVP, MVC, MVVM, MVP-VM** and templates for each.
- This Project demo request API search user github and show result using [retrofit](https://github.com/square/retrofit) and save data to local using [Realm](https://github.com/realm/realm-java) And [SQLite](https://www.sqlite.org/)
- Using Reactive library: [RxJava](https://github.com/ReactiveX/RxJava),[RxAndroid](https://github.com/ReactiveX/RxAndroid)

### 1. MVP
Diagram:

![alt text](https://github.com/daolq3012/Structure_Android/blob/master/images/mvp.png?raw=true)

Source Code

**Branch:** [mvp-architecture](https://github.com/daolq3012/Structure_Android/tree/mvp-architecture)


### 2. MVC
Diagram:

![alt text](https://github.com/daolq3012/Structure_Android/blob/master/images/mvc.png?raw=true)

Source Code:

**Branch:** [mvc-architecture](https://github.com/daolq3012/Structure_Android/tree/mvc-architecture)


### 3. MVVM
The same MVP structure in this **MVVM** structure _ViewModel_ as a _Presenter_ in **MVP**
Diagram:

![alt text](https://github.com/daolq3012/Structure_Android/blob/master/images/mvvm.png?raw=true)

Source Code:

**Branch:** [mvvm-architecture](https://github.com/daolq3012/Structure_Android/tree/mvvm-architecture)


### 4. MVP-VM
MVP-VM is a structure mixing between [MVP](https://github.com/daolq3012/Structure_Android/tree/mvp-architecture) and [MVVM](https://github.com/daolq3012/Structure_Android/tree/mvvm-architecture)
- Split _ViewModel_ to 2 components _ViewModel_ And _Presenter_
  * ViewModel binding data with view(layout), Logic processing not using in here
  * Presenter reponsible for logic and reflected up ViewModel

Diagram:

![alt text](https://github.com/daolq3012/Structure_Android/blob/master/images/mvvmp.png?raw=true)

Source Code:

**Branch:** [mvp-vm-architecture](https://github.com/daolq3012/Structure_Android/tree/mvvmp-architecture)

  
### 5. MVP-VM using Dagger 2
This Architechture apply Java 8 & RxJava 2.0.1

Diagram:

- The same with MVP-VM structure

Source Code:

**Branch:** [mvp-vm-dagger-architecture](https://github.com/daolq3012/Structure_Android/tree/mvvmp-dagger-architecture)

### 6. MVP-VM-Kotlin
This architecture apply:
- Kotlin 1.1.3-2
- RxJava 2.1.1
- Dagger 2.11
- Retrofit 2.3.0
- DataBinding

Diagram:

- The same with MVP structure but in this case View (Activity, Fragment) also is ViewModel

![alt text](https://github.com/daolq3012/Structure_Android/blob/master/images/mvp.png?raw=true)

Source Code:

**Branch:** [mvp-vm-kotlin-architecture](https://github.com/daolq3012/Structure_Android/tree/kotlin-mvvmp-dagger-architecture)


### Code style
- Download and import to Android studio [codestyle.jar](https://github.com/daolq3012/Structure_Android/blob/master/codestyle/codestyle.jar?raw=true)

## ☑ TODO

- [X] Add MVP Examples
- [X] Add MVC Examples
- [X] Add MVVM Examples
- [X] Add MVP-VM Examples
- [X] Add MVP-VM-Dagger Examples
- [X] Update documentation for each
- [X] Add MVP-VM-Dagger Examples include Unit Test using **Kotlin**
- [ ] Add test UI using [Cucumber](https://cucumber.io/) and [Espresso](https://google.github.io/android-testing-support-library/docs/espresso/setup/) (BDD technical)

## 👬 Contribution

The Example are built using [Android studio](https://developer.android.com/studio/index.html)

- Open pull request with improvements
- Discuss ideas in issues
- Spread the word
- Reach out to me directly at dao.le.2511@gmail.com


## License

The content of this project itself is licensed under the Creative Commons Attribution 4.0 International (CC BY 4.0)
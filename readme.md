#ExProgressFragment

Another ProgressFragment which support [AndroidAnnotation](androidannotations.org) and error layout.

Base on [Android-ProgressFragment](https://github.com/johnkil/Android-ProgressFragment?source=c)

##Compatibility

This library is compatible from API 4 (Android 1.6).

##Usage

* Implement ExProgressFragment

```java
	public class ExampleExProgressFragment extends ExProgressFragment {
	}
```

* if you are using ActionBarSherlock, change ExProgressFragment by extend SherlockFragment

```java
	public class ExProgressFragment extends SherlockFragment {
	
	}
```

* if you wanna use AndroidAnnotation, you have nothing to worry about, just add @EFragment annotation.

```java
	@EFragment
	public class ExampleExProgressFragment extends ExProgressFragment {
	}
```

 btw, the sample project demo how to use ExProgressFragment with AndroidAnnotation.

as you can see in the sample project, @ViewById, @Click function, provided by AndroidAnnotation, can be used as usual.

```java
	@EFragment
	public class ExampleExProgressFragment extends ExProgressFragment {
	 	@ViewById
	    TextView tvEmpty, tvError, tvContent;
	
	    @AfterViews
	    void init() {
	        tvEmpty.setText("Custom text from java code");
	    }
	
	    @Click
	    void btnReloadClicked() {
	        showProgress(false);
	        showContent();
	        showEmpty();
	        showError();
	    }
	}
```
* You can easily custom empty, content, progress and error view by override the "onCreate*View" methods

```java
	@EFragment
	public class ExampleExProgressFragment extends ExProgressFragment {
	
	    @Override
	    public View onCreateContentEmptyView(LayoutInflater inflater) {
	        return inflater.inflate(R.layout.sample_custom_empty, null);
	    }
	
	    @Override
	    public View onCreateContentView(LayoutInflater inflater) {
	        return inflater.inflate(R.layout.sample_custom_content, null);
	    }
	
	    @Override
	    public View onCreateContentErrorView(LayoutInflater inflater) {
	        return inflater.inflate(R.layout.sample_custom_error, null);
	    }
	
	    @Override
	    public View onCreateProgressView(LayoutInflater inflater) {
	        return inflater.inflate(R.layout.sample_custom_progress, null);
	    }
	}
```

all views will be added to content view, so you can use @ViewById find views.

##Developed by

fanxu123 - <fanxu.china@gmail.com>

##License

    Copyright 2013 fanxu123
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

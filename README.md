
## Overview
This is a live coding exercise for a Senior Android Engineer position. You will implement a product search feature using modern Android development practices.

**Time allocated: 40-45 minutes**

## What's Already Provided

This project includes:
- ✅ Gradle configuration and dependencies (Hilt, Compose, Coroutines, etc.)
- ⚠️ `ProductService` interface with search method. TBD.
- ✅ `Product` data class
- ✅ `Result` sealed class for handling states (Loading, Success, Error)
- ✅ Basic Hilt setup (`@HiltAndroidApp`, component configuration)
- ✅ Empty `SearchViewModel` with Hilt injection
- ✅ Empty `SearchScreen` composable function
- ✅ MainActivity that hosts the SearchScreen

## Your Task

Implement a product search feature with the following requirements:

### UI Requirements (SearchScreen)
1. **TextField** - For users to enter search queries
2. **Search Button** - To trigger the search action
3. **Results List** - Display search results (product name and price)
4. **Loading State** - Show progress indicator during search
5. **Error State** - Display error messages when search fails
6. **Empty State** (optional but recommended) - Handle no results scenario

### ViewModel Requirements (SearchViewModel)
1. Create a UI state model to represent the screen state
2. Use `StateFlow` for state management
3. Implement the search logic:
    - Call `productService.searchProducts(query)`
    - Handle Loading, Success, and Error states appropriately
    - Use `viewModelScope` for coroutine management

### Technical Constraints
- ✅ Use **Jetpack Compose** for UI
- ✅ Use **StateFlow** for state management (not LiveData)
- ✅ Use **Coroutines** for async operations
- ✅ Hilt is already configured - `SearchViewModel` is already annotated with `@HiltViewModel`
- ❌ **Do NOT** create repositories, use cases, or additional layers (keep it simple)
- ❌ **Do NOT** implement actual network calls (ProductService is already mocked)

## Project Structure
```
app/src/main/java/com/company/productsearch/
├── data/
│   └── ProductService.kt          // ✅ Already implemented
├── model/
│   ├── Product.kt                 // ✅ Already implemented
│   └── Result.kt                  // ✅ Already implemented
├── ui/
│   ├── SearchViewModel.kt         // ⚠️ YOU IMPLEMENT THIS
│   └── SearchScreen.kt            // ⚠️ YOU IMPLEMENT THIS
└── MainActivity.kt                // ✅ Already implemented
```

## How to Run

1. The project is already set up and should compile
2. Run the app on an emulator or device
3. Implement the required functionality
4. Test your implementation

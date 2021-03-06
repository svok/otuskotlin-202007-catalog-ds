package ru.otus.otuskotlin.catalogue.backend.common.contexts

import ru.otus.otuskotlin.catalogue.backend.common.models.IErrorModel
import ru.otus.otuskotlin.catalogue.backend.common.models.categories.*
import ru.otus.otuskotlin.catalogue.backend.common.models.items.ItemCreateStubCases
import ru.otus.otuskotlin.catalogue.backend.common.models.items.ItemDeleteStubCases
import ru.otus.otuskotlin.catalogue.backend.common.models.items.ItemModel
import ru.otus.otuskotlin.catalogue.backend.common.repositories.ICategoryRepository

data class CategoryContext(
        override var workMode: WorkModes = WorkModes.DEFAULT,
        override var categoryRepo: ICategoryRepository = ICategoryRepository.NONE,
        override var categoryRepoTest: ICategoryRepository = ICategoryRepository.NONE,
        override var categoryRepoProd: ICategoryRepository = ICategoryRepository.NONE,
        override var errors: MutableList<IErrorModel> = mutableListOf(),
        override var status: ContextStatus = ContextStatus.NONE,
        var requestCategoryId: String = "",
        var requestLabel: String = "",
        var requestCategory: CategoryModel = CategoryModel.NONE,
        var responseCategory: CategoryModel = CategoryModel.NONE,
        var responseMap: CategoryInfoModel = CategoryInfoModel.NONE,
        var stubCGetCase: CategoryGetStubCases = CategoryGetStubCases.NONE,
        var stubCCreateCase: CategoryCreateStubCases = CategoryCreateStubCases.NONE,
        var stubCDeleteCase: CategoryDeleteStubCases = CategoryDeleteStubCases.NONE,
        var stubCGetMapCase: CategoryGetMapStubCases = CategoryGetMapStubCases.NONE,
        var stubCRenameCase: CategoryRenameStubCases = CategoryRenameStubCases.NONE
): BaseContext(
        workMode = workMode,
        categoryRepo = categoryRepo,
        categoryRepoTest = categoryRepoTest,
        categoryRepoProd = categoryRepoProd,
        errors = errors,
        status = status
)
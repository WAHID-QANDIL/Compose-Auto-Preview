package com.google.android.ksp
import com.google.android.library.AutoPreview
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import com.squareup.kotlinpoet.*
import java.io.OutputStreamWriter

class AutoPreviewProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        // Find all functions annotated with @AutoPreview
        val symbols = resolver.getSymbolsWithAnnotation(AutoPreview::class.qualifiedName!!)
        symbols.filterIsInstance<KSFunctionDeclaration>().forEach { function ->
            generatePreviewFunction(function)
        }
        return emptyList()
    }

    private fun generateFileWithoutKotlinPoetKsp(packageName: String, fileName: String) {
        val fileSpec = FileSpec.builder(packageName, fileName)
            .addFunction(
                FunSpec.builder("GeneratedFunction")
                    .addStatement("println(%S)", "Hello from generated code!")
                    .build()
            ).build()

        // Manually write to KSP code generator's output
        val outputStream = codeGenerator.createNewFile(
            dependencies = Dependencies(false),
            packageName = packageName,
            fileName = fileName
        )
        OutputStreamWriter(outputStream).use { writer -> fileSpec.writeTo(writer) }
    }

    private fun generatePreviewFunction(function: KSFunctionDeclaration) {
        // Get function details
        val packageName = function.packageName.asString()
        val functionName = function.simpleName.asString()
        val previewFunctionName = "${functionName}Preview"

        // Build the preview function
        val previewFunction = FunSpec.builder(previewFunctionName)
            .addAnnotation(ClassName("androidx.compose.ui.tooling.preview", "Preview"))
            .addModifiers(KModifier.PUBLIC)
            .addStatement("$functionName()") // Calls the annotated composable
            .build()

        // Write the function to a file
        val fileSpec = FileSpec.builder(packageName, previewFunctionName)
            .addFunction(previewFunction)
            .build()

        generateFileWithoutKotlinPoetKsp(packageName,"GeneratedFile")

    }

}


package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Folder-fill`: ImageVector
    get() {
        if (`_folder-fill` != null) {
            return `_folder-fill`!!
        }
        `_folder-fill` = Builder(name = "Folder-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                horizontalLineTo(131.31f)
                lineTo(104.0f, 44.69f)
                arcTo(15.88f, 15.88f, 0.0f, false, false, 92.69f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.62f)
                arcTo(15.41f, 15.41f, 0.0f, false, false, 39.39f, 216.0f)
                horizontalLineToRelative(177.5f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 232.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(40.0f, 56.0f)
                horizontalLineTo(92.69f)
                lineToRelative(16.0f, 16.0f)
                horizontalLineTo(40.0f)
                close()
            }
        }
        .build()
        return `_folder-fill`!!
    }

private var `_folder-fill`: ImageVector? = null

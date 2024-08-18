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

public val FillGroup.`Folder-open-fill`: ImageVector
    get() {
        if (`_folder-open-fill` != null) {
            return `_folder-open-fill`!!
        }
        `_folder-open-fill` = Builder(name = "Folder-open-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.0f, 110.64f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f)
                horizontalLineTo(216.0f)
                verticalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(130.67f)
                lineTo(102.94f, 51.2f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, -9.6f, -3.2f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(211.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f)
                lineToRelative(28.49f, -85.47f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 245.0f, 110.64f)
                close()
                moveTo(93.34f, 64.0f)
                lineTo(123.2f, 86.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 88.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(69.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.18f, 10.94f)
                lineTo(40.0f, 158.7f)
                verticalLineTo(64.0f)
                close()
            }
        }
        .build()
        return `_folder-open-fill`!!
    }

private var `_folder-open-fill`: ImageVector? = null

package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Folder-duotone`: ImageVector
    get() {
        if (`_folder-duotone` != null) {
            return `_folder-duotone`!!
        }
        `_folder-duotone` = Builder(name = "Folder-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(92.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                horizontalLineTo(131.31f)
                lineTo(104.0f, 44.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 92.69f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.62f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 39.38f, 216.0f)
                horizontalLineTo(216.89f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 232.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(92.69f, 56.0f)
                lineToRelative(16.0f, 16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(56.0f)
                close()
                moveTo(216.0f, 200.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(216.0f)
                close()
            }
        }
        .build()
        return `_folder-duotone`!!
    }

private var `_folder-duotone`: ImageVector? = null

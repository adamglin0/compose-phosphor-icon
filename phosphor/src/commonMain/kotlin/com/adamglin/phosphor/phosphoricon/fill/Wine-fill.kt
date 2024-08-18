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

public val FillGroup.`Wine-fill`: ImageVector
    get() {
        if (`_wine-fill` != null) {
            return `_wine-fill`!!
        }
        `_wine-fill` = Builder(name = "Wine-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.33f, 103.67f)
                lineTo(183.56f, 29.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 175.89f, 24.0f)
                horizontalLineTo(80.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.67f, 5.74f)
                lineTo(50.67f, 103.67f)
                arcToRelative(63.46f, 63.46f, 0.0f, false, false, 17.42f, 64.67f)
                arcTo(87.41f, 87.41f, 0.0f, false, false, 120.0f, 191.63f)
                verticalLineTo(232.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(191.63f)
                arcToRelative(87.39f, 87.39f, 0.0f, false, false, 51.91f, -23.29f)
                arcTo(63.48f, 63.48f, 0.0f, false, false, 205.33f, 103.67f)
                close()
                moveTo(86.09f, 40.0f)
                horizontalLineToRelative(83.82f)
                lineTo(190.0f, 108.19f)
                curveToRelative(0.09f, 0.3f, 0.17f, 0.6f, 0.25f, 0.9f)
                curveToRelative(-21.42f, 7.68f, -45.54f, -1.6f, -58.63f, -8.23f)
                curveTo(106.43f, 88.11f, 86.43f, 86.49f, 71.68f, 88.93f)
                close()
            }
        }
        .build()
        return `_wine-fill`!!
    }

private var `_wine-fill`: ImageVector? = null

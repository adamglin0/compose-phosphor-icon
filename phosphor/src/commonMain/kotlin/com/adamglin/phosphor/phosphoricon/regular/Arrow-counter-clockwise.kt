package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Arrow-counter-clockwise`: ImageVector
    get() {
        if (`_arrow-counter-clockwise` != null) {
            return `_arrow-counter-clockwise`!!
        }
        `_arrow-counter-clockwise` = Builder(name = "Arrow-counter-clockwise", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -94.71f, 96.0f)
                horizontalLineTo(128.0f)
                arcTo(95.38f, 95.38f, 0.0f, false, true, 62.1f, 197.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.0f, -11.63f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 71.43f, 71.39f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, -0.26f, 0.25f)
                lineTo(44.59f, 96.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(85.8f)
                lineTo(60.25f, 60.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_arrow-counter-clockwise`!!
    }

private var `_arrow-counter-clockwise`: ImageVector? = null

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

public val RegularGroup.`Arrow-clockwise`: ImageVector
    get() {
        if (`_arrow-clockwise` != null) {
            return `_arrow-clockwise`!!
        }
        `_arrow-clockwise` = Builder(name = "Arrow-clockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(211.4f)
                lineTo(184.81f, 71.64f)
                lineToRelative(-0.25f, -0.24f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -1.67f, 114.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.0f, 11.63f)
                arcTo(95.44f, 95.44f, 0.0f, false, true, 128.0f, 224.0f)
                horizontalLineToRelative(-1.32f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 195.75f, 60.0f)
                lineTo(224.0f, 85.8f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_arrow-clockwise`!!
    }

private var `_arrow-clockwise`: ImageVector? = null

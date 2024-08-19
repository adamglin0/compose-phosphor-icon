package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Stack-minus`: ImageVector
    get() {
        if (`_stack-minus` != null) {
            return `_stack-minus`!!
        }
        `_stack-minus` = Builder(name = "Stack-minus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.91f, 124.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 134.91f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.06f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 36.0f, 121.09f)
                lineToRelative(92.0f, 53.65f)
                lineToRelative(92.0f, -53.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.91f, 124.0f)
                close()
                moveTo(24.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, -6.91f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.06f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.82f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.06f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 80.0f)
                close()
                moveTo(47.88f, 80.0f)
                lineTo(128.0f, 126.74f)
                lineTo(208.12f, 80.0f)
                lineTo(128.0f, 33.26f)
                close()
                moveTo(232.0f, 192.0f)
                lineTo(184.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(140.0f, 215.76f)
                lineTo(128.0f, 222.76f)
                lineTo(36.0f, 169.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 182.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(16.0f, -9.33f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 140.0f, 215.76f)
                close()
            }
        }
        .build()
        return `_stack-minus`!!
    }

private var `_stack-minus`: ImageVector? = null

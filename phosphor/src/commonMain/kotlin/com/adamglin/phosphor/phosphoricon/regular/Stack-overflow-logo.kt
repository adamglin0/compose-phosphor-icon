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

public val RegularGroup.`Stack-overflow-logo`: ImageVector
    get() {
        if (`_stack-overflow-logo` != null) {
            return `_stack-overflow-logo`!!
        }
        `_stack-overflow-logo` = Builder(name = "Stack-overflow-logo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.09f)
                lineTo(216.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 152.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(56.0f, 208.0f)
                lineTo(200.0f, 208.0f)
                lineTo(200.0f, 152.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(88.0f, 184.09f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                lineTo(88.0f, 168.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                close()
                moveTo(92.88f, 131.09f)
                lineTo(170.15f, 151.77f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, 2.08f, 0.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.07f, -15.71f)
                lineTo(97.0f, 115.61f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 92.88f, 131.0f)
                close()
                moveTo(111.33f, 81.16f)
                lineTo(180.61f, 121.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.93f, -2.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.93f, -10.91f)
                lineTo(119.33f, 67.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.84f)
                close()
                moveTo(198.66f, 94.16f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 210.0f, 82.84f)
                lineToRelative(-56.57f, -56.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.3f)
                close()
            }
        }
        .build()
        return `_stack-overflow-logo`!!
    }

private var `_stack-overflow-logo`: ImageVector? = null

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

public val RegularGroup.`Star-four`: ImageVector
    get() {
        if (`_star-four` != null) {
            return `_star-four`!!
        }
        `_star-four` = Builder(name = "Star-four", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.5f, 113.0f)
                lineTo(166.06f, 89.94f)
                lineTo(143.0f, 26.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.0f, 0.0f)
                lineTo(89.94f, 89.94f)
                lineTo(26.5f, 113.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 30.0f)
                lineToRelative(63.44f, 23.07f)
                lineTo(113.0f, 229.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 30.0f, 0.0f)
                lineToRelative(23.07f, -63.44f)
                lineTo(229.5f, 143.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -30.0f)
                close()
                moveTo(157.08f, 152.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.78f, 4.78f)
                lineTo(128.0f, 223.9f)
                lineToRelative(-24.3f, -66.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.78f, -4.78f)
                lineTo(32.1f, 128.0f)
                lineToRelative(66.82f, -24.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, -4.78f)
                lineTo(128.0f, 32.1f)
                lineToRelative(24.3f, 66.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, 4.78f)
                lineTo(223.9f, 128.0f)
                close()
            }
        }
        .build()
        return `_star-four`!!
    }

private var `_star-four`: ImageVector? = null

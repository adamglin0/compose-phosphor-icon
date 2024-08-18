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

public val RegularGroup.`Bezier-curve`: ImageVector
    get() {
        if (`_bezier-curve` != null) {
            return `_bezier-curve`!!
        }
        `_bezier-curve` = Builder(name = "Bezier-curve", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.07f, 144.41f)
                arcTo(96.68f, 96.68f, 0.0f, false, false, 181.0f, 88.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(159.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                lineTo(16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(75.0f, 88.0f)
                arcToRelative(96.68f, 96.68f, 0.0f, false, false, -40.07f, 56.41f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 51.08f, 146.0f)
                arcTo(80.6f, 80.6f, 0.0f, false, true, 99.0f, 93.44f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 58.06f, 0.0f)
                arcTo(80.6f, 80.6f, 0.0f, false, true, 204.92f, 146.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.15f, -1.57f)
                close()
                moveTo(56.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 176.0f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_bezier-curve`!!
    }

private var `_bezier-curve`: ImageVector? = null

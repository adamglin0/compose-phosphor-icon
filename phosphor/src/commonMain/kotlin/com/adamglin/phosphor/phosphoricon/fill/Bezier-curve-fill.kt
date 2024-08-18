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

public val FillGroup.`Bezier-curve-fill`: ImageVector
    get() {
        if (`_bezier-curve-fill` != null) {
            return `_bezier-curve-fill`!!
        }
        `_bezier-curve-fill` = Builder(name = "Bezier-curve-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.0f, 144.4f)
                arcTo(96.26f, 96.26f, 0.0f, false, false, 181.0f, 88.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(159.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                lineTo(16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(75.0f, 88.0f)
                arcTo(96.26f, 96.26f, 0.0f, false, false, 35.0f, 144.4f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 71.0f, 184.0f)
                lineTo(185.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 36.0f, -39.6f)
                close()
                moveTo(40.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 192.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_bezier-curve-fill`!!
    }

private var `_bezier-curve-fill`: ImageVector? = null

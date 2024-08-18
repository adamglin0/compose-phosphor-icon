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

public val RegularGroup.`Closed-captioning`: ImageVector
    get() {
        if (`_closed-captioning` != null) {
            return `_closed-captioning`!!
        }
        `_closed-captioning` = Builder(name = "Closed-captioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                lineTo(32.0f, 64.0f)
                lineTo(224.0f, 64.0f)
                lineTo(224.0f, 192.0f)
                close()
                moveTo(118.92f, 151.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 162.64f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -69.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 13.85f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 41.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 118.92f, 151.71f)
                close()
                moveTo(198.92f, 151.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 162.64f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -69.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 13.85f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 41.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 198.92f, 151.71f)
                close()
            }
        }
        .build()
        return `_closed-captioning`!!
    }

private var `_closed-captioning`: ImageVector? = null

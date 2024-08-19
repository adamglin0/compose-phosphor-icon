package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Option-light`: ImageVector
    get() {
        if (`_option-light` != null) {
            return `_option-light`!!
        }
        `_option-light` = Builder(name = "Option-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(160.94f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, -12.52f, -7.74f)
                lineTo(96.84f, 87.11f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 95.06f, 86.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(95.06f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, 12.52f, 7.74f)
                lineToRelative(51.58f, 103.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.78f, 1.11f)
                horizontalLineTo(224.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 192.0f)
                close()
                moveTo(152.0f, 86.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_option-light`!!
    }

private var `_option-light`: ImageVector? = null

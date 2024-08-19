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

public val LightGroup.`Arrow-u-up-right-light`: ImageVector
    get() {
        if (`_arrow-u-up-right-light` != null) {
            return `_arrow-u-up-right-light`!!
        }
        `_arrow-u-up-right-light` = Builder(name = "Arrow-u-up-right-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.76f, 131.76f)
                lineTo(209.51f, 94.0f)
                horizontalLineTo(88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(88.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, true, 88.0f, 82.0f)
                horizontalLineTo(209.51f)
                lineTo(171.76f, 44.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                close()
            }
        }
        .build()
        return `_arrow-u-up-right-light`!!
    }

private var `_arrow-u-up-right-light`: ImageVector? = null

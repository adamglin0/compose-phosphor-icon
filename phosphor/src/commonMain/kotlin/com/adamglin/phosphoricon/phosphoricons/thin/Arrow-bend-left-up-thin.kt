package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Arrow-bend-left-up-thin`: ImageVector
    get() {
        if (`_arrow-bend-left-up-thin` != null) {
            return `_arrow-bend-left-up-thin`!!
        }
        `_arrow-bend-left-up-thin` = Builder(name = "Arrow-bend-left-up-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 100.0f, 128.0f)
                verticalLineTo(41.66f)
                lineTo(58.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(108.0f, 41.66f)
                verticalLineTo(128.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_arrow-bend-left-up-thin`!!
    }

private var `_arrow-bend-left-up-thin`: ImageVector? = null

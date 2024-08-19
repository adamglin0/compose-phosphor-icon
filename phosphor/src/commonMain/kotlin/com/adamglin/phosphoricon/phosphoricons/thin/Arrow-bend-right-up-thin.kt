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

public val ThinGroup.`Arrow-bend-right-up-thin`: ImageVector
    get() {
        if (`_arrow-bend-right-up-thin` != null) {
            return `_arrow-bend-right-up-thin`!!
        }
        `_arrow-bend-right-up-thin` = Builder(name = "Arrow-bend-right-up-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(156.0f, 41.66f)
                verticalLineTo(128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 56.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                verticalLineTo(41.66f)
                lineTo(106.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 202.83f, 82.83f)
                close()
            }
        }
        .build()
        return `_arrow-bend-right-up-thin`!!
    }

private var `_arrow-bend-right-up-thin`: ImageVector? = null

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

public val ThinGroup.`Arrow-clockwise-thin`: ImageVector
    get() {
        if (`_arrow-clockwise-thin` != null) {
            return `_arrow-clockwise-thin`!!
        }
        `_arrow-clockwise-thin` = Builder(name = "Arrow-clockwise-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(37.7f)
                lineTo(187.53f, 68.69f)
                lineToRelative(-0.13f, -0.12f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -1.75f, 120.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.5f, 5.82f)
                arcTo(91.43f, 91.43f, 0.0f, false, true, 128.0f, 220.0f)
                horizontalLineToRelative(-1.26f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 193.0f, 62.84f)
                lineToRelative(35.0f, 32.05f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_arrow-clockwise-thin`!!
    }

private var `_arrow-clockwise-thin`: ImageVector? = null

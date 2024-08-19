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

public val ThinGroup.`Empty-thin`: ImageVector
    get() {
        if (`_empty-thin` != null) {
            return `_empty-thin`!!
        }
        `_empty-thin` = Builder(name = "Empty-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.76f, 62.72f)
                lineToRelative(18.2f, -20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 205.0f, 37.31f)
                lineToRelative(-18.2f, 20.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -123.6f, 136.0f)
                lineToRelative(-18.2f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 51.0f, 218.69f)
                lineToRelative(18.2f, -20.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 192.76f, 62.72f)
                close()
                moveTo(44.0f, 128.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 181.46f, 63.25f)
                lineTo(68.63f, 187.36f)
                arcTo(83.72f, 83.72f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.64f, 83.64f, 0.0f, false, true, -53.46f, -19.25f)
                lineTo(187.37f, 68.64f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_empty-thin`!!
    }

private var `_empty-thin`: ImageVector? = null

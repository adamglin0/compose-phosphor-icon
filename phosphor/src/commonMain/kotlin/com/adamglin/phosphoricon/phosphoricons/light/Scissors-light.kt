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

public val LightGroup.`Scissors-light`: ImageVector
    get() {
        if (`_scissors-light` != null) {
            return `_scissors-light`!!
        }
        `_scissors-light` = Builder(name = "Scissors-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.38f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.57f, -8.34f)
                lineToRelative(67.66f, -46.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.78f, 9.91f)
                lineToRelative(-67.67f, 46.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.34f, -1.56f)
                close()
                moveTo(237.0f, 197.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.34f, 1.56f)
                lineTo(136.0f, 135.27f)
                lineTo(91.0f, 166.06f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 84.0f, 156.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.19f, 0.2f)
                lineTo(125.37f, 128.0f)
                lineTo(84.23f, 99.84f)
                lineTo(84.0f, 100.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 7.0f, -10.1f)
                lineToRelative(144.38f, 98.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 237.0f, 197.09f)
                close()
                moveTo(75.56f, 91.55f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -31.12f, 0.0f)
                arcToRelative(21.88f, 21.88f, 0.0f, false, false, 31.12f, 0.0f)
                close()
                moveTo(82.0f, 180.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -6.44f, 15.56f)
                horizontalLineToRelative(0.0f)
                arcTo(21.88f, 21.88f, 0.0f, false, false, 82.0f, 180.0f)
                close()
            }
        }
        .build()
        return `_scissors-light`!!
    }

private var `_scissors-light`: ImageVector? = null

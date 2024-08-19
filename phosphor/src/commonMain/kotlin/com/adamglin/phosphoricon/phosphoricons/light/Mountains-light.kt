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

public val LightGroup.`Mountains-light`: ImageVector
    get() {
        if (`_mountains-light` != null) {
            return `_mountains-light`!!
        }
        `_mountains-light` = Builder(name = "Mountains-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 78.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 78.0f)
                close()
                moveTo(164.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f)
                close()
                moveTo(253.16f, 196.94f)
                lineTo(198.6f, 104.86f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -12.0f, -6.86f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.88f, 13.88f, 0.0f, false, false, -12.0f, 6.86f)
                lineToRelative(-27.88f, 47.05f)
                lineToRelative(-46.56f, -79.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.13f, 0.0f)
                lineTo(2.83f, 197.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 206.0f)
                lineTo(248.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.16f, -9.06f)
                close()
                moveTo(86.27f, 79.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.46f, 0.0f)
                lineToRelative(25.34f, 43.0f)
                lineTo(60.93f, 122.0f)
                close()
                moveTo(18.5f, 194.0f)
                lineToRelative(35.36f, -60.0f)
                horizontalLineToRelative(68.29f)
                lineToRelative(19.3f, 32.77f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(16.0f, 27.2f)
                close()
                moveTo(171.43f, 194.0f)
                lineTo(153.58f, 163.71f)
                lineTo(184.83f, 111.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -1.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.72f, 1.0f)
                lineToRelative(49.2f, 83.0f)
                close()
            }
        }
        .build()
        return `_mountains-light`!!
    }

private var `_mountains-light`: ImageVector? = null

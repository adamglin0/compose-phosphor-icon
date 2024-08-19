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

public val ThinGroup.`Star-four-thin`: ImageVector
    get() {
        if (`_star-four-thin` != null) {
            return `_star-four-thin`!!
        }
        `_star-four-thin` = Builder(name = "Star-four-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.13f, 116.77f)
                lineTo(162.94f, 93.06f)
                lineTo(139.23f, 27.87f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -22.46f, 0.0f)
                lineTo(93.06f, 93.06f)
                lineTo(27.87f, 116.77f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, 22.46f)
                lineToRelative(65.19f, 23.71f)
                lineToRelative(23.71f, 65.19f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 22.46f, 0.0f)
                lineToRelative(23.71f, -65.19f)
                lineToRelative(65.19f, -23.71f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, -22.46f)
                close()
                moveTo(225.4f, 131.77f)
                lineTo(158.4f, 156.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, 2.39f)
                lineToRelative(-24.34f, 67.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.44f, 0.0f)
                lineToRelative(-24.34f, -67.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, -2.39f)
                lineTo(30.6f, 131.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -7.44f)
                lineTo(97.55f, 99.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, -2.39f)
                lineTo(124.28f, 30.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.44f, 0.0f)
                lineToRelative(24.34f, 66.95f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 2.39f)
                lineToRelative(67.0f, 24.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.44f)
                close()
            }
        }
        .build()
        return `_star-four-thin`!!
    }

private var `_star-four-thin`: ImageVector? = null

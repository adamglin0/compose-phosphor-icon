package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Star-half-bold`: ImageVector
    get() {
        if (`_star-half-bold` != null) {
            return `_star-half-bold`!!
        }
        `_star-half-bold` = Builder(name = "Star-half-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.9f, 117.88f)
                lineToRelative(-5.06f, 4.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.87f, -17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.0f, -23.92f)
                lineToRelative(8.27f, 0.67f)
                arcToRelative(20.45f, 20.45f, 0.0f, false, true, 11.66f, 35.87f)
                close()
                moveTo(172.53f, 141.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.84f, 11.86f)
                lineToRelative(4.08f, 17.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.35f, -5.54f)
                lineToRelative(-2.4f, -10.12f)
                lineToRelative(6.12f, -5.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.67f, -18.17f)
                close()
                moveTo(205.6f, 205.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.68f, 2.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.2f, 20.66f)
                lineToRelative(6.71f, 4.13f)
                arcToRelative(20.39f, 20.39f, 0.0f, false, false, 30.49f, -22.15f)
                close()
                moveTo(175.0f, 102.0f)
                lineToRelative(-15.64f, -1.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.13f, -7.38f)
                lineTo(140.0f, 70.94f)
                lineTo(140.0f, 182.39f)
                lineToRelative(5.53f, 3.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 133.0f, 206.24f)
                lineToRelative(-5.0f, -3.05f)
                lineTo(79.57f, 233.0f)
                arcToRelative(20.39f, 20.39f, 0.0f, false, true, -30.49f, -22.15f)
                lineToRelative(13.2f, -55.7f)
                lineTo(19.1f, 117.88f)
                arcTo(20.45f, 20.45f, 0.0f, false, true, 30.75f, 82.0f)
                lineToRelative(56.6f, -4.57f)
                lineToRelative(21.82f, -52.82f)
                arcToRelative(20.36f, 20.36f, 0.0f, false, true, 37.66f, 0.0f)
                lineToRelative(21.82f, 52.82f)
                lineToRelative(8.32f, 0.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 175.0f, 102.0f)
                close()
                moveTo(116.0f, 182.36f)
                lineTo(116.0f, 70.94f)
                lineToRelative(-9.27f, 22.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.13f, 7.38f)
                lineToRelative(-55.4f, 4.47f)
                lineTo(83.47f, 141.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.84f, 11.86f)
                lineTo(74.42f, 208.0f)
                close()
            }
        }
        .build()
        return `_star-half-bold`!!
    }

private var `_star-half-bold`: ImageVector? = null

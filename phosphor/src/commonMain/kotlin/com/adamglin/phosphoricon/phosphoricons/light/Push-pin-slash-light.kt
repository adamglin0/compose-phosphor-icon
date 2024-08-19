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

public val LightGroup.`Push-pin-slash-light`: ImageVector
    get() {
        if (`_push-pin-slash-light` != null) {
            return `_push-pin-slash-light`!!
        }
        `_push-pin-slash-light` = Builder(name = "Push-pin-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(71.27f, 74.51f)
                curveTo(61.78f, 76.0f, 50.6f, 80.0f, 39.22f, 89.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 38.1f, 110.0f)
                lineToRelative(49.71f, 49.71f)
                lineToRelative(-44.05f, 44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(44.05f, -44.05f)
                lineTo(146.0f, 217.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.11f)
                quadToRelative(0.49f, 0.0f, 1.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.19f, -5.54f)
                arcToRelative(85.51f, 85.51f, 0.0f, false, false, 12.44f, -22.84f)
                lineToRelative(24.0f, 26.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.87f, -8.08f)
                close()
                moveTo(157.49f, 209.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.2f)
                lineTo(46.58f, 101.51f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.18f, -3.0f)
                curveToRelative(13.18f, -10.64f, 25.84f, -12.9f, 34.79f, -12.7f)
                lineTo(170.0f, 183.11f)
                curveTo(167.83f, 193.74f, 162.11f, 203.07f, 157.49f, 209.21f)
                close()
                moveTo(233.91f, 102.59f)
                lineTo(189.26f, 147.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.5f, -8.47f)
                lineToRelative(44.65f, -44.79f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.84f)
                lineTo(164.73f, 30.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.83f, 0.0f)
                lineTo(120.68f, 71.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.5f, -8.47f)
                lineToRelative(41.23f, -41.36f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.81f, 0.0f)
                lineToRelative(60.69f, 60.69f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 233.91f, 102.59f)
                close()
            }
        }
        .build()
        return `_push-pin-slash-light`!!
    }

private var `_push-pin-slash-light`: ImageVector? = null

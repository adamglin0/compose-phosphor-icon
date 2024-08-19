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

public val LightGroup.`Person-light`: ImageVector
    get() {
        if (`_person-light` != null) {
            return `_person-light`!!
        }
        `_person-light` = Builder(name = "Person-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 70.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 40.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 70.0f)
                close()
                moveTo(128.0f, 22.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 22.0f)
                close()
                moveTo(216.88f, 135.42f)
                lineTo(171.67f, 84.16f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 149.17f, 74.0f)
                lineTo(106.83f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -22.5f, 10.15f)
                lineTo(39.12f, 135.42f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 64.46f, 161.0f)
                lineToRelative(21.11f, -16.93f)
                lineTo(67.44f, 212.92f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 32.75f, 14.94f)
                lineTo(128.0f, 180.0f)
                lineToRelative(27.81f, 47.91f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 32.75f, -14.94f)
                lineToRelative(-18.13f, -68.87f)
                lineTo(191.54f, 161.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 25.34f, -25.56f)
                close()
                moveTo(208.25f, 152.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, 0.0f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.49f, -0.44f)
                lineToRelative(-35.51f, -28.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.56f, 6.2f)
                lineToRelative(22.87f, 86.93f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.88f, 5.07f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, -0.25f, -0.48f)
                lineTo(133.19f, 165.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.38f, 0.0f)
                lineTo(89.69f, 222.05f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, -0.25f, 0.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.88f, -5.07f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, -1.0f)
                lineToRelative(22.87f, -86.93f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 99.27f, 123.0f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.76f, 1.32f)
                lineTo(56.73f, 151.8f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.49f, 0.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f)
                lineToRelative(0.26f, -0.27f)
                lineTo(93.33f, 92.09f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 106.83f, 86.0f)
                horizontalLineToRelative(42.34f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 13.5f, 6.09f)
                lineTo(208.0f, 143.48f)
                lineToRelative(0.26f, 0.27f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 208.25f, 152.24f)
                close()
            }
        }
        .build()
        return `_person-light`!!
    }

private var `_person-light`: ImageVector? = null

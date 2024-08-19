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

public val ThinGroup.`Push-pin-thin`: ImageVector
    get() {
        if (`_push-pin-thin` != null) {
            return `_push-pin-thin`!!
        }
        `_push-pin-thin` = Builder(name = "Push-pin-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 84.2f)
                lineTo(171.8f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(99.45f, 79.07f)
                curveToRelative(-8.08f, -3.0f, -32.79f, -9.45f, -59.0f, 11.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, 17.84f)
                lineToRelative(51.13f, 51.13f)
                lineTo(45.17f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(45.46f, -45.47f)
                lineToRelative(51.12f, 51.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 155.9f, 220.0f)
                curveToRelative(0.28f, 0.0f, 0.57f, 0.0f, 0.85f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.73f, -4.74f)
                curveToRelative(19.83f, -26.36f, 16.51f, -47.18f, 11.71f, -58.57f)
                lineToRelative(55.3f, -55.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 84.2f)
                close()
                moveTo(226.83f, 95.51f)
                horizontalLineToRelative(0.0f)
                lineTo(169.56f, 153.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.75f, 4.61f)
                curveToRelative(10.43f, 20.85f, -1.62f, 42.0f, -9.73f, 52.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 0.4f)
                lineTo(45.17f, 102.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.33f, -6.0f)
                curveTo(58.44f, 86.53f, 70.86f, 83.74f, 80.44f, 83.74f)
                arcTo(43.9f, 43.9f, 0.0f, false, true, 98.6f, 87.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.62f, -0.75f)
                lineToRelative(57.27f, -57.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(60.68f, 60.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 95.51f)
                close()
            }
        }
        .build()
        return `_push-pin-thin`!!
    }

private var `_push-pin-thin`: ImageVector? = null

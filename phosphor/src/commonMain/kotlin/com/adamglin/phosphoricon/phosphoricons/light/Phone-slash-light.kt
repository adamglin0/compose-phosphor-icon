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

public val LightGroup.`Phone-slash-light`: ImageVector
    get() {
        if (`_phone-slash-light` != null) {
            return `_phone-slash-light`!!
        }
        `_phone-slash-light` = Builder(name = "Phone-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(73.08f, 76.51f)
                arcToRelative(139.32f, 139.32f, 0.0f, false, false, -47.27f, 31.08f)
                curveToRelative(-19.25f, 19.26f, -21.11f, 47.65f, -4.52f, 69.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 37.39f, 181.0f)
                lineToRelative(49.0f, -17.37f)
                lineToRelative(0.22f, -0.09f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 8.53f, -10.25f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.21f, -1.47f)
                arcToRelative(80.07f, 80.07f, 0.0f, false, true, 10.0f, -2.75f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(98.29f, 111.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.0f, 10.45f)
                lineTo(83.37f, 151.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.15f, 1.43f)
                lineTo(33.28f, 169.77f)
                lineToRelative(-0.22f, 0.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.29f, -0.58f)
                curveToRelative(-13.0f, -16.73f, -11.56f, -38.11f, 3.53f, -53.19f)
                arcTo(127.91f, 127.91f, 0.0f, false, true, 81.75f, 86.0f)
                lineToRelative(21.34f, 23.48f)
                curveTo(101.47f, 110.0f, 99.87f, 110.47f, 98.29f, 111.0f)
                close()
                moveTo(234.71f, 176.61f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -16.1f, 4.41f)
                lineToRelative(-9.28f, -3.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.0f, -11.31f)
                lineToRelative(9.38f, 3.33f)
                lineToRelative(0.22f, 0.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.29f, -0.58f)
                curveToRelative(13.0f, -16.73f, 11.56f, -38.11f, -3.53f, -53.19f)
                curveTo(195.64f, 90.0f, 158.86f, 76.2f, 120.83f, 78.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -0.63f, -12.0f)
                curveToRelative(41.44f, -2.15f, 81.52f, 12.93f, 110.0f, 41.39f)
                curveTo(249.44f, 126.85f, 251.3f, 155.24f, 234.71f, 176.63f)
                close()
            }
        }
        .build()
        return `_phone-slash-light`!!
    }

private var `_phone-slash-light`: ImageVector? = null

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

public val LightGroup.`Dribbble-logo-light`: ImageVector
    get() {
        if (`_dribbble-logo-light` != null) {
            return `_dribbble-logo-light`!!
        }
        `_dribbble-logo-light` = Builder(name = "Dribbble-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.81f, 122.3f)
                curveToRelative(-3.26f, -0.19f, -6.54f, -0.3f, -9.8f, -0.3f)
                arcToRelative(166.44f, 166.44f, 0.0f, false, false, -45.25f, 6.29f)
                arcTo(164.28f, 164.28f, 0.0f, false, false, 148.33f, 96.0f)
                curveToRelative(-0.14f, -0.25f, -0.3f, -0.49f, -0.44f, -0.74f)
                arcToRelative(166.34f, 166.34f, 0.0f, false, false, 40.79f, -33.71f)
                arcTo(89.79f, 89.79f, 0.0f, false, true, 217.81f, 122.3f)
                close()
                moveTo(179.29f, 54.09f)
                arcToRelative(154.52f, 154.52f, 0.0f, false, true, -37.9f, 31.11f)
                arcTo(167.0f, 167.0f, 0.0f, false, false, 98.88f, 42.84f)
                arcToRelative(89.87f, 89.87f, 0.0f, false, true, 80.41f, 11.25f)
                close()
                moveTo(85.71f, 48.58f)
                arcToRelative(155.0f, 155.0f, 0.0f, false, true, 45.0f, 42.27f)
                arcTo(153.71f, 153.71f, 0.0f, false, true, 64.0f, 106.0f)
                arcToRelative(156.8f, 156.8f, 0.0f, false, true, -22.84f, -1.69f)
                arcTo(90.37f, 90.37f, 0.0f, false, true, 85.71f, 48.58f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.17f, 90.17f, 0.0f, false, true, 0.79f, -11.92f)
                arcTo(167.23f, 167.23f, 0.0f, false, false, 64.0f, 118.0f)
                arcToRelative(165.69f, 165.69f, 0.0f, false, false, 73.29f, -17.0f)
                curveToRelative(0.22f, 0.37f, 0.46f, 0.73f, 0.67f, 1.1f)
                arcTo(152.2f, 152.2f, 0.0f, false, true, 151.34f, 132.0f)
                arcToRelative(164.57f, 164.57f, 0.0f, false, false, -26.09f, 12.11f)
                arcTo(167.0f, 167.0f, 0.0f, false, false, 69.57f, 196.4f)
                arcTo(89.84f, 89.84f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(79.19f, 203.58f)
                arcToRelative(155.24f, 155.24f, 0.0f, false, true, 52.05f, -49.12f)
                arcToRelative(152.9f, 152.9f, 0.0f, false, true, 23.38f, -10.93f)
                arcToRelative(154.31f, 154.31f, 0.0f, false, true, 4.3f, 36.16f)
                arcToRelative(154.78f, 154.78f, 0.0f, false, true, -3.81f, 34.13f)
                arcToRelative(89.88f, 89.88f, 0.0f, false, true, -75.92f, -10.24f)
                close()
                moveTo(168.43f, 208.39f)
                arcToRelative(166.76f, 166.76f, 0.0f, false, false, 2.49f, -28.7f)
                arcToRelative(166.67f, 166.67f, 0.0f, false, false, -4.86f, -39.87f)
                arcTo(154.6f, 154.6f, 0.0f, false, true, 208.0f, 134.0f)
                curveToRelative(3.25f, 0.0f, 6.52f, 0.11f, 9.77f, 0.32f)
                arcTo(90.16f, 90.16f, 0.0f, false, true, 168.43f, 208.39f)
                close()
            }
        }
        .build()
        return `_dribbble-logo-light`!!
    }

private var `_dribbble-logo-light`: ImageVector? = null

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

public val BoldGroup.`Plant-bold`: ImageVector
    get() {
        if (`_plant-bold` != null) {
            return `_plant-bold`!!
        }
        `_plant-bold` = Builder(name = "Plant-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.62f, 51.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.27f, -11.27f)
                curveToRelative(-53.27f, -3.13f, -96.2f, 13.36f, -114.84f, 44.14f)
                curveToRelative(-12.14f, 20.0f, -12.56f, 44.17f, -1.46f, 67.3f)
                arcToRelative(75.14f, 75.14f, 0.0f, false, false, -12.28f, 23.0f)
                lineToRelative(-12.66f, -12.66f)
                curveToRelative(7.19f, -16.77f, 6.43f, -34.11f, -2.4f, -48.69f)
                curveTo(86.73f, 90.36f, 54.89f, 78.0f, 15.55f, 80.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.28f, 91.55f)
                curveTo(2.0f, 130.89f, 14.36f, 162.73f, 37.45f, 176.71f)
                arcToRelative(49.76f, 49.76f, 0.0f, false, false, 26.0f, 7.27f)
                arcToRelative(57.54f, 57.54f, 0.0f, false, false, 22.7f, -4.87f)
                lineTo(112.0f, 205.0f)
                verticalLineToRelative(23.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(198.51f)
                arcToRelative(51.63f, 51.63f, 0.0f, false, true, 9.49f, -29.95f)
                arcToRelative(76.82f, 76.82f, 0.0f, false, false, 32.1f, 7.39f)
                arcToRelative(64.91f, 64.91f, 0.0f, false, false, 33.89f, -9.46f)
                curveTo(242.25f, 147.85f, 258.76f, 104.92f, 255.62f, 51.65f)
                close()
                moveTo(49.88f, 156.18f)
                curveToRelative(-13.19f, -8.0f, -21.18f, -27.46f, -21.83f, -52.13f)
                curveToRelative(24.67f, 0.65f, 44.14f, 8.64f, 52.13f, 21.83f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 3.63f, 17.0f)
                lineTo(72.48f, 131.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(11.34f, 11.34f)
                arcTo(26.27f, 26.27f, 0.0f, false, true, 49.88f, 156.18f)
                close()
                moveTo(199.05f, 146.0f)
                curveToRelative(-10.66f, 6.45f, -23.0f, 7.67f, -35.81f, 3.76f)
                lineToRelative(37.25f, -37.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-37.25f, 37.24f)
                curveTo(142.37f, 120.0f, 143.59f, 107.61f, 150.0f, 97.0f)
                curveToRelative(12.7f, -21.0f, 42.65f, -33.0f, 81.32f, -33.0f)
                horizontalLineTo(232.0f)
                curveTo(232.14f, 103.0f, 220.14f, 133.18f, 199.05f, 146.0f)
                close()
            }
        }
        .build()
        return `_plant-bold`!!
    }

private var `_plant-bold`: ImageVector? = null

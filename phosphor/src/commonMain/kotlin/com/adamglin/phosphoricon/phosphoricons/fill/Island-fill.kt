package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Island-fill`: ImageVector
    get() {
        if (`_island-fill` != null) {
            return `_island-fill`!!
        }
        `_island-fill` = Builder(name = "Island-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.55f, 226.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 232.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.0f, -14.25f)
                curveToRelative(1.63f, -1.3f, 38.53f, -30.26f, 98.29f, -33.45f)
                arcTo(120.0f, 120.0f, 0.0f, false, true, 114.0f, 146.37f)
                curveToRelative(1.73f, -21.71f, 10.91f, -50.63f, 42.95f, -72.48f)
                arcToRelative(66.28f, 66.28f, 0.0f, false, false, -15.0f, -1.87f)
                lineToRelative(-1.67f, 0.0f)
                curveToRelative(-19.0f, 0.62f, -30.94f, 11.71f, -36.5f, 33.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 112.0f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, true, -2.0f, -0.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, -9.7f)
                curveToRelative(9.25f, -36.95f, 33.11f, -45.42f, 51.5f, -46.0f)
                arcToRelative(81.43f, 81.43f, 0.0f, false, true, 21.68f, 2.45f)
                curveToRelative(-3.82f, -6.33f, -9.42f, -12.93f, -17.21f, -16.25f)
                curveToRelative(-10.0f, -4.24f, -22.17f, -2.39f, -36.31f, 5.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -14.0f)
                curveToRelative(18.74f, -10.45f, 35.72f, -12.54f, 50.48f, -6.2f)
                curveToRelative(12.49f, 5.36f, 20.73f, 15.78f, 25.88f, 25.0f)
                curveToRelative(6.17f, -9.64f, 13.87f, -16.17f, 22.38f, -18.94f)
                curveToRelative(11.86f, -3.87f, 24.64f, -0.72f, 38.0f, 9.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.64f, 12.76f)
                curveToRelative(-8.91f, -6.73f, -16.77f, -9.06f, -23.34f, -6.93f)
                curveToRelative(-7.3f, 2.35f, -12.87f, 10.0f, -16.38f, 16.61f)
                arcTo(70.46f, 70.46f, 0.0f, false, true, 208.0f, 73.07f)
                curveToRelative(14.61f, 8.35f, 32.0f, 26.05f, 32.0f, 62.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -23.46f, -8.06f, -40.0f, -24.0f, -49.0f)
                arcToRelative(50.49f, 50.49f, 0.0f, false, false, -5.75f, -2.8f)
                arcToRelative(55.64f, 55.64f, 0.0f, false, true, 5.06f, 33.06f)
                arcToRelative(59.41f, 59.41f, 0.0f, false, true, -8.86f, 23.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, -9.2f)
                curveToRelative(0.75f, -1.09f, 16.33f, -24.38f, -3.26f, -49.37f)
                curveToRelative(-27.0f, 15.21f, -41.89f, 37.25f, -44.16f, 65.59f)
                arcToRelative(104.27f, 104.27f, 0.0f, false, false, 3.83f, 36.44f)
                curveToRelative(62.65f, 1.81f, 101.52f, 32.33f, 103.2f, 33.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 239.55f, 226.65f)
                close()
                moveTo(52.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 52.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_island-fill`!!
    }

private var `_island-fill`: ImageVector? = null

package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 76.0f)
                close()
                moveTo(220.22f, 145.58f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, true, -26.78f, 31.29f)
                curveToRelative(-0.24f, 0.2f, -0.47f, 0.39f, -0.72f, 0.56f)
                arcToRelative(109.52f, 109.52f, 0.0f, false, true, -13.55f, 8.83f)
                curveToRelative(-18.3f, 10.07f, -40.88f, 15.9f, -67.22f, 17.36f)
                lineTo(91.0f, 249.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.89f, 7.0f)
                quadToRelative(-0.41f, 0.0f, -0.81f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.66f, -8.44f)
                lineToRelative(-14.16f, -46.0f)
                lineToRelative(-46.0f, -14.19f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 7.0f, 165.0f)
                lineToRelative(45.4f, -20.92f)
                curveToRelative(1.47f, -26.33f, 7.3f, -48.91f, 17.37f, -67.2f)
                arcTo(110.62f, 110.62f, 0.0f, false, true, 78.57f, 63.3f)
                curveToRelative(0.16f, -0.22f, 0.34f, -0.44f, 0.51f, -0.66f)
                arcTo(101.91f, 101.91f, 0.0f, false, true, 110.41f, 35.8f)
                curveToRelative(25.55f, -14.19f, 54.33f, -16.37f, 74.0f, -15.69f)
                curveToRelative(17.76f, 0.61f, 36.49f, 4.0f, 40.76f, 6.52f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, true, 4.23f, 4.23f)
                curveToRelative(2.52f, 4.26f, 5.92f, 23.0f, 6.53f, 40.76f)
                curveTo(236.57f, 91.26f, 234.4f, 120.0f, 220.22f, 145.58f)
                close()
                moveTo(151.52f, 172.24f)
                arcToRelative(56.92f, 56.92f, 0.0f, false, true, -11.12f, -8.64f)
                arcToRelative(55.81f, 55.81f, 0.0f, false, true, -15.9f, -32.1f)
                arcToRelative(55.81f, 55.81f, 0.0f, false, true, -32.1f, -15.9f)
                arcToRelative(56.63f, 56.63f, 0.0f, false, true, -8.63f, -11.13f)
                quadToRelative(-7.0f, 20.48f, -7.7f, 47.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.0f, 10.61f)
                lineTo(45.51f, 173.64f)
                lineToRelative(22.1f, 6.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.94f, 7.94f)
                lineToRelative(6.79f, 22.09f)
                lineTo(93.23f, 186.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.61f, -7.0f)
                quadTo(131.0f, 179.29f, 151.52f, 172.24f)
                close()
                moveTo(209.0f, 47.0f)
                curveToRelative(-16.25f, -3.14f, -61.81f, -9.0f, -95.0f, 14.91f)
                arcToRelative(76.73f, 76.73f, 0.0f, false, false, -14.0f, 13.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 35.0f, 32.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.09f, 13.09f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 33.0f, 35.0f)
                arcToRelative(76.33f, 76.33f, 0.0f, false, false, 13.0f, -14.0f)
                curveTo(218.05f, 108.81f, 212.18f, 63.22f, 209.0f, 47.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null

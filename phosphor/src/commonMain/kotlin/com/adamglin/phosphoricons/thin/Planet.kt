package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.66f, 62.68f)
                curveToRelative(-6.73f, -11.58f, -26.58f, -13.8f, -56.0f, -6.3f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 37.0f, 141.7f)
                curveToRelative(-21.38f, 21.69f, -29.44f, 40.0f, -22.68f, 51.62f)
                curveToRelative(4.13f, 7.11f, 13.0f, 10.71f, 26.0f, 10.71f)
                arcTo(115.25f, 115.25f, 0.0f, false, false, 65.0f, 200.9f)
                curveToRelative(1.74f, -0.39f, 3.52f, -0.82f, 5.32f, -1.28f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 220.0f, 128.0f)
                arcToRelative(92.84f, 92.84f, 0.0f, false, false, -1.0f, -13.73f)
                curveToRelative(12.77f, -13.0f, 21.31f, -25.28f, 24.0f, -35.47f)
                curveTo(244.69f, 72.54f, 244.23f, 67.12f, 241.66f, 62.68f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(84.13f, 84.13f, 0.0f, false, true, 82.38f, 67.56f)
                curveToRelative(-16.17f, 15.69f, -38.8f, 32.48f, -64.49f, 47.24f)
                curveToRelative(-27.31f, 15.69f, -52.81f, 26.25f, -73.61f, 32.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(21.25f, 189.3f)
                curveTo(17.0f, 182.0f, 23.75f, 167.7f, 39.0f, 151.24f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 63.0f, 193.09f)
                curveTo(40.86f, 198.0f, 25.47f, 196.58f, 21.25f, 189.3f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.58f, 83.58f, 0.0f, false, true, -48.0f, -15.1f)
                curveToRelative(21.58f, -6.58f, 45.83f, -17.37f, 69.85f, -31.16f)
                curveToRelative(24.25f, -13.94f, 45.61f, -29.46f, 61.83f, -44.44f)
                curveToRelative(0.18f, 2.21f, 0.3f, 4.44f, 0.3f, 6.7f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(235.28f, 76.73f)
                curveToRelative(-2.13f, 8.0f, -8.58f, 17.65f, -18.25f, 28.06f)
                arcToRelative(92.07f, 92.07f, 0.0f, false, false, -24.12f, -41.92f)
                curveToRelative(21.85f, -4.82f, 37.59f, -3.46f, 41.83f, 3.83f)
                curveTo(236.2f, 69.23f, 236.39f, 72.6f, 235.28f, 76.73f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null

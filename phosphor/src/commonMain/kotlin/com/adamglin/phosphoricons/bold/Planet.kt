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

public val BoldGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.59f, 58.67f)
                curveToRelative(-6.31f, -10.87f, -23.0f, -21.06f, -66.16f, -9.71f)
                arcTo(95.94f, 95.94f, 0.0f, false, false, 32.0f, 128.0f)
                quadToRelative(0.0f, 3.6f, 0.26f, 7.14f)
                curveTo(0.56f, 166.86f, 1.1f, 186.4f, 7.44f, 197.33f)
                curveTo(13.4f, 207.61f, 25.3f, 212.0f, 40.68f, 212.0f)
                curveToRelative(9.79f, 0.0f, 21.0f, -1.78f, 32.95f, -4.91f)
                arcTo(95.94f, 95.94f, 0.0f, false, false, 224.0f, 128.0f)
                curveToRelative(0.0f, -2.41f, -0.09f, -4.79f, -0.27f, -7.16f)
                curveToRelative(14.31f, -14.38f, 23.86f, -28.21f, 27.0f, -40.0f)
                curveTo(253.55f, 70.42f, 251.12f, 63.0f, 248.59f, 58.67f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(72.11f, 72.11f, 0.0f, false, true, 70.19f, 56.0f)
                curveTo(184.0f, 124.73f, 165.0f, 138.59f, 141.92f, 151.86f)
                curveToRelative(-21.74f, 12.49f, -43.55f, 22.36f, -63.09f, 28.65f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 56.0f)
                close()
                moveTo(28.19f, 185.29f)
                curveToRelative(-0.61f, -1.07f, -0.17f, -8.22f, 10.67f, -21.71f)
                arcTo(95.77f, 95.77f, 0.0f, false, false, 52.35f, 187.0f)
                curveTo(35.12f, 189.61f, 28.85f, 186.41f, 28.19f, 185.29f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(71.66f, 71.66f, 0.0f, false, true, -22.56f, -3.64f)
                arcToRelative(394.1f, 394.1f, 0.0f, false, false, 48.42f, -23.69f)
                arcTo(388.11f, 388.11f, 0.0f, false, false, 198.43f, 143.0f)
                arcTo(72.12f, 72.12f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(227.57f, 74.65f)
                curveToRelative(-1.28f, 4.78f, -4.81f, 10.87f, -10.39f, 17.8f)
                arcTo(95.74f, 95.74f, 0.0f, false, false, 203.68f, 69.0f)
                curveToRelative(15.83f, -2.37f, 23.17f, 0.0f, 24.15f, 1.71f)
                curveTo(228.0f, 71.0f, 228.21f, 72.28f, 227.57f, 74.65f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null

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

public val ThinGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.0f, 157.32f)
                curveToRelative(-1.32f, -1.46f, -24.47f, -26.63f, -61.79f, -40.43f)
                curveToRelative(-1.26f, -18.56f, -7.78f, -35.45f, -18.66f, -48.13f)
                curveTo(156.62f, 52.56f, 136.38f, 44.0f, 112.0f, 44.0f)
                curveTo(62.51f, 44.0f, 30.1f, 88.58f, 28.74f, 90.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.51f, 4.65f)
                curveTo(35.56f, 94.7f, 66.68f, 52.0f, 112.0f, 52.0f)
                curveToRelative(22.0f, 0.0f, 40.11f, 7.6f, 52.45f, 22.0f)
                curveToRelative(9.11f, 10.61f, 14.81f, 24.62f, 16.46f, 40.13f)
                arcTo(137.84f, 137.84f, 0.0f, false, false, 140.6f, 108.0f)
                curveToRelative(-25.1f, 0.0f, -46.09f, 6.48f, -60.69f, 18.75f)
                curveTo(67.26f, 137.39f, 60.0f, 152.15f, 60.0f, 167.25f)
                arcToRelative(43.64f, 43.64f, 0.0f, false, false, 12.69f, 31.22f)
                curveTo(81.59f, 207.32f, 94.0f, 212.0f, 108.6f, 212.0f)
                curveToRelative(51.63f, 0.0f, 79.87f, -44.08f, 80.78f, -86.32f)
                curveToRelative(34.07f, 13.58f, 55.36f, 36.67f, 55.65f, 37.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.94f, -5.36f)
                close()
                moveTo(162.6f, 178.79f)
                curveToRelative(-9.37f, 11.5f, -26.34f, 25.21f, -54.0f, 25.21f)
                curveTo(80.71f, 204.0f, 68.0f, 185.0f, 68.0f, 167.25f)
                curveTo(68.0f, 142.57f, 90.72f, 116.0f, 140.6f, 116.0f)
                arcToRelative(129.23f, 129.23f, 0.0f, false, true, 40.8f, 6.77f)
                verticalLineToRelative(0.81f)
                curveTo(181.4f, 144.0f, 174.54f, 164.1f, 162.57f, 178.79f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null

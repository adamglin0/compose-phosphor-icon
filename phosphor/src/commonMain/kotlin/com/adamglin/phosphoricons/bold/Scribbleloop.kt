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

public val BoldGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.9f, 152.0f)
                curveToRelative(-1.33f, -1.47f, -23.75f, -25.85f, -60.21f, -40.69f)
                curveToRelative(-2.15f, -18.28f, -9.1f, -34.9f, -20.1f, -47.71f)
                curveTo(157.12f, 45.52f, 134.79f, 36.0f, 108.0f, 36.0f)
                curveTo(54.44f, 36.0f, 19.69f, 83.79f, 18.24f, 85.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.53f, 14.0f)
                curveTo(38.05f, 99.38f, 66.65f, 60.0f, 108.0f, 60.0f)
                curveToRelative(19.85f, 0.0f, 35.45f, 6.45f, 46.38f, 19.18f)
                arcToRelative(61.35f, 61.35f, 0.0f, false, true, 12.4f, 24.0f)
                arcTo(143.6f, 143.6f, 0.0f, false, false, 136.61f, 100.0f)
                curveToRelative(-27.0f, 0.0f, -49.79f, 7.13f, -65.85f, 20.63f)
                curveTo(56.3f, 132.79f, 48.0f, 149.78f, 48.0f, 167.25f)
                curveTo(48.0f, 193.46f, 67.44f, 220.0f, 104.61f, 220.0f)
                curveToRelative(51.93f, 0.0f, 82.34f, -40.28f, 87.87f, -82.43f)
                arcToRelative(156.46f, 156.46f, 0.0f, false, true, 42.62f, 30.48f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 252.9f, 152.0f)
                close()
                moveTo(152.37f, 173.74f)
                curveTo(144.09f, 183.9f, 129.09f, 196.0f, 104.61f, 196.0f)
                curveTo(82.08f, 196.0f, 72.0f, 181.56f, 72.0f, 167.25f)
                curveTo(72.0f, 146.42f, 92.22f, 124.0f, 136.61f, 124.0f)
                arcToRelative(119.85f, 119.85f, 0.0f, false, true, 32.64f, 4.62f)
                curveTo(168.24f, 145.44f, 162.21f, 161.66f, 152.37f, 173.74f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null

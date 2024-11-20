package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.45f, 156.0f)
                curveToRelative(-1.32f, -1.46f, -24.27f, -26.42f, -61.37f, -40.5f)
                curveToRelative(-1.5f, -18.49f, -8.13f, -35.31f, -19.0f, -48.0f)
                curveTo(157.74f, 50.8f, 137.0f, 42.0f, 112.0f, 42.0f)
                curveTo(61.49f, 42.0f, 28.5f, 87.38f, 27.12f, 89.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.76f, 7.0f)
                curveTo(37.18f, 95.87f, 67.75f, 54.0f, 112.0f, 54.0f)
                curveToRelative(21.37f, 0.0f, 39.0f, 7.35f, 50.93f, 21.27f)
                curveToRelative(8.26f, 9.62f, 13.64f, 22.14f, 15.62f, 36.06f)
                arcToRelative(139.0f, 139.0f, 0.0f, false, false, -38.0f, -5.33f)
                curveToRelative(-25.58f, 0.0f, -47.0f, 6.65f, -62.0f, 19.22f)
                curveToRelative(-13.1f, 11.0f, -20.62f, 26.34f, -20.62f, 42.0f)
                arcToRelative(45.65f, 45.65f, 0.0f, false, false, 13.28f, 32.64f)
                curveTo(80.56f, 209.12f, 93.47f, 214.0f, 108.6f, 214.0f)
                curveToRelative(51.73f, 0.0f, 80.55f, -43.09f, 82.68f, -85.38f)
                curveToRelative(32.05f, 13.49f, 52.0f, 35.09f, 52.27f, 35.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.9f, -8.0f)
                close()
                moveTo(161.0f, 177.53f)
                curveTo(151.92f, 188.69f, 135.44f, 202.0f, 108.6f, 202.0f)
                curveTo(90.0f, 202.0f, 70.0f, 191.12f, 70.0f, 167.25f)
                curveTo(70.0f, 143.53f, 92.09f, 118.0f, 140.6f, 118.0f)
                arcToRelative(126.74f, 126.74f, 0.0f, false, true, 38.8f, 6.22f)
                curveTo(179.26f, 143.94f, 172.58f, 163.34f, 161.0f, 177.53f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null

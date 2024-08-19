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

public val ThinGroup.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.12f, 136.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -86.0f, -31.56f)
                arcToRelative(28.25f, 28.25f, 0.0f, false, false, -4.56f, -2.39f)
                lineToRelative(17.27f, -68.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.72f, -4.34f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 100.0f, 126.62f)
                curveToRelative(0.0f, 0.46f, 0.0f, 0.92f, 0.0f, 1.38f)
                arcToRelative(27.39f, 27.39f, 0.0f, false, false, 0.26f, 3.76f)
                lineTo(31.91f, 151.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 29.0f, 154.94f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 41.45f, 56.62f)
                arcToRelative(56.46f, 56.46f, 0.0f, false, false, 14.59f, 1.93f)
                arcToRelative(56.07f, 56.07f, 0.0f, false, false, 55.73f, -60.59f)
                arcToRelative(27.93f, 27.93f, 0.0f, false, false, 4.33f, -2.77f)
                lineToRelative(51.09f, 49.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 199.0f, 200.7f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 1.84f, -0.45f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 229.12f, 136.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(76.0f, 76.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 71.4f, -41.92f)
                lineToRelative(-16.55f, 66.06f)
                curveToRelative(-0.94f, -0.09f, -1.89f, -0.14f, -2.85f, -0.14f)
                arcToRelative(28.06f, 28.06f, 0.0f, false, false, -26.34f, 18.49f)
                arcTo(47.82f, 47.82f, 0.0f, false, true, 76.0f, 76.0f)
                close()
                moveTo(109.0f, 199.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -72.0f, -40.87f)
                lineToRelative(65.5f, -18.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 156.0f)
                arcToRelative(28.81f, 28.81f, 0.0f, false, false, 4.94f, -0.44f)
                arcTo(47.81f, 47.81f, 0.0f, false, true, 109.0f, 199.0f)
                close()
                moveTo(216.6f, 174.54f)
                arcToRelative(47.93f, 47.93f, 0.0f, false, true, -17.0f, 17.22f)
                lineToRelative(-49.0f, -47.37f)
                arcToRelative(27.91f, 27.91f, 0.0f, false, false, -1.3f, -34.44f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.22f, 64.59f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null

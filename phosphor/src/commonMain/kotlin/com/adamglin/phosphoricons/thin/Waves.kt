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

public val ThinGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.08f, 179.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.53f, 5.63f)
                curveTo(203.56f, 197.9f, 188.9f, 204.0f, 173.93f, 204.0f)
                arcToRelative(54.84f, 54.84f, 0.0f, false, true, -6.12f, -0.34f)
                curveToRelative(-15.0f, -1.65f, -28.6f, -9.0f, -41.72f, -16.14f)
                curveToRelative(-25.52f, -13.86f, -49.62f, -27.0f, -83.54f, 1.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, -6.16f)
                curveToRelative(17.0f, -14.12f, 33.62f, -20.08f, 50.74f, -18.19f)
                curveToRelative(15.0f, 1.64f, 28.6f, 9.0f, 41.72f, 16.14f)
                curveToRelative(25.52f, 13.86f, 49.62f, 26.94f, 83.54f, -1.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.08f, 179.84f)
                close()
                moveTo(213.45f, 123.31f)
                curveToRelative(-33.92f, 28.12f, -58.0f, 15.0f, -83.54f, 1.17f)
                curveToRelative(-13.12f, -7.12f, -26.69f, -14.49f, -41.72f, -16.14f)
                curveToRelative(-17.12f, -1.88f, -33.72f, 4.07f, -50.74f, 18.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.1f, 6.16f)
                curveToRelative(33.92f, -28.12f, 58.0f, -15.0f, 83.54f, -1.17f)
                curveToRelative(13.12f, 7.12f, 26.69f, 14.49f, 41.72f, 16.14f)
                arcToRelative(57.34f, 57.34f, 0.0f, false, false, 6.12f, 0.34f)
                curveToRelative(15.0f, 0.0f, 29.63f, -6.1f, 44.62f, -18.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.1f, -6.16f)
                close()
                moveTo(42.55f, 76.69f)
                curveToRelative(33.92f, -28.13f, 58.0f, -15.0f, 83.54f, -1.18f)
                curveToRelative(13.12f, 7.13f, 26.69f, 14.5f, 41.72f, 16.14f)
                arcToRelative(54.84f, 54.84f, 0.0f, false, false, 6.12f, 0.34f)
                curveToRelative(15.0f, 0.0f, 29.63f, -6.1f, 44.62f, -18.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.1f, -6.16f)
                curveToRelative(-33.92f, 28.13f, -58.0f, 15.0f, -83.54f, 1.18f)
                curveTo(116.79f, 61.35f, 103.22f, 54.0f, 88.19f, 52.34f)
                curveToRelative(-17.12f, -1.88f, -33.72f, 4.07f, -50.74f, 18.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.1f, 6.16f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null

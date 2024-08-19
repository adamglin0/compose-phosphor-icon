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

public val BoldGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.51f, 227.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 236.0f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, true, -3.4f, -0.49f)
                lineToRelative(-84.6f, -25.0f)
                lineToRelative(-84.6f, 25.0f)
                arcTo(12.15f, 12.15f, 0.0f, false, true, 40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.4f, -23.51f)
                lineTo(85.65f, 198.0f)
                lineTo(36.6f, 183.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.8f, -23.0f)
                lineToRelative(84.6f, 25.0f)
                lineToRelative(84.6f, -25.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.8f, 23.0f)
                lineTo(170.35f, 198.0f)
                lineToRelative(49.05f, 14.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.51f, 227.4f)
                close()
                moveTo(64.0f, 104.0f)
                curveToRelative(0.0f, -50.59f, 55.93f, -81.28f, 58.31f, -82.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.38f, 0.0f)
                curveTo(136.07f, 22.72f, 192.0f, 53.41f, 192.0f, 104.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.47f, -2.71f, -12.55f, -8.0f, -18.07f)
                arcToRelative(41.26f, 41.26f, 0.0f, false, false, -4.0f, -3.57f)
                arcToRelative(42.49f, 42.49f, 0.0f, false, false, -4.0f, 3.57f)
                curveToRelative(-5.33f, 5.52f, -8.0f, 11.6f, -8.0f, 18.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 144.0f)
                close()
                moveTo(88.0f, 104.0f)
                arcToRelative(39.78f, 39.78f, 0.0f, false, false, 4.85f, 19.08f)
                curveToRelative(4.81f, -25.0f, 28.66f, -37.25f, 29.78f, -37.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f)
                curveToRelative(1.12f, 0.56f, 25.0f, 12.78f, 29.78f, 37.81f)
                arcTo(39.78f, 39.78f, 0.0f, false, false, 168.0f, 104.0f)
                curveToRelative(0.0f, -28.34f, -27.74f, -49.81f, -40.0f, -57.92f)
                curveTo(115.75f, 54.18f, 88.0f, 75.66f, 88.0f, 104.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null

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

public val BoldGroup.Rainbowcloud: ImageVector
    get() {
        if (_rainbowcloud != null) {
            return _rainbowcloud!!
        }
        _rainbowcloud = Builder(name = "Rainbowcloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 108.0f)
                arcToRelative(52.23f, 52.23f, 0.0f, false, false, -47.23f, 30.23f)
                lineTo(156.0f, 138.23f)
                curveToRelative(-19.85f, 0.0f, -36.0f, 16.55f, -36.0f, 36.89f)
                reflectiveCurveTo(136.15f, 212.0f, 156.0f, 212.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(156.0f, 188.0f)
                curveToRelative(-6.62f, 0.0f, -12.0f, -5.78f, -12.0f, -12.89f)
                reflectiveCurveToRelative(5.38f, -12.89f, 12.0f, -12.89f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 4.26f, 0.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.31f, -8.71f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 204.0f, 188.0f)
                close()
                moveTo(109.22f, 136.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.12f, 16.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(80.0f, 160.0f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, 12.38f, -25.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 109.22f, 136.84f)
                close()
                moveTo(136.66f, 118.84f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 64.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(40.0f, 160.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 149.0f, 98.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.35f, 20.58f)
                close()
                moveTo(24.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(0.0f, 160.0f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 185.47f, 75.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.75f, 18.11f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f)
                close()
            }
        }
        .build()
        return _rainbowcloud!!
    }

private var _rainbowcloud: ImageVector? = null

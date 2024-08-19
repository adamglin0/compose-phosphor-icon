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

public val LightGroup.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 16.0f)
                lineTo(122.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(200.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, -8.48f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 46.0f)
                close()
                moveTo(51.76f, 44.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                close()
                moveTo(137.0f, 74.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.0f, 11.84f)
                curveToRelative(20.0f, 3.34f, 35.0f, 21.44f, 35.0f, 42.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(182.0f, 101.57f, 162.65f, 78.39f, 137.0f, 74.08f)
                close()
                moveTo(230.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(42.0f, 128.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 86.0f, -86.0f)
                horizontalLineToRelative(0.65f)
                curveToRelative(47.06f, 0.35f, 85.35f, 39.38f, 85.35f, 87.0f)
                verticalLineToRelative(33.0f)
                horizontalLineToRelative(2.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 176.0f)
                close()
                moveTo(54.0f, 162.0f)
                lineTo(202.0f, 162.0f)
                lineTo(202.0f, 129.0f)
                curveToRelative(0.0f, -41.0f, -32.94f, -74.7f, -73.44f, -75.0f)
                lineTo(128.0f, 54.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -74.0f, 74.0f)
                close()
                moveTo(218.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 174.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null

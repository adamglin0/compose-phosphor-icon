package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Filejpg: ImageVector
    get() {
        if (_filejpg != null) {
            return _filejpg!!
        }
        _filejpg = Builder(name = "Filejpg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 144.0f)
                lineTo(104.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(120.0f, 184.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(112.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 184.0f)
                verticalLineToRelative(16.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.22f, 5.53f)
                arcTo(30.06f, 30.06f, 0.0f, false, true, 192.0f, 216.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f)
                arcToRelative(29.38f, 29.38f, 0.0f, false, true, 16.48f, 5.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, 13.26f)
                arcTo(13.21f, 13.21f, 0.0f, false, false, 192.0f, 160.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, 9.0f, -16.0f, 20.0f)
                reflectiveCurveToRelative(7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(13.63f, 13.63f, 0.0f, false, false, 8.0f, -2.71f)
                lineTo(200.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 184.0f)
                close()
                moveTo(80.0f, 152.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(64.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(160.0f, 80.0f)
                lineTo(160.0f, 51.31f)
                lineTo(188.69f, 80.0f)
                close()
            }
        }
        .build()
        return _filejpg!!
    }

private var _filejpg: ImageVector? = null

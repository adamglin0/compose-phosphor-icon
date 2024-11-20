package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Boot: ImageVector
    get() {
        if (_boot != null) {
            return _boot!!
        }
        _boot = Builder(name = "Boot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 168.0f)
                curveToRelative(9.22f, -32.06f, 12.0f, -88.65f, 0.0f, -120.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 112.0f)
                lineTo(160.0f, 112.0f)
                lineTo(160.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(32.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.47f, 10.86f)
                curveToRelative(11.06f, 28.84f, 8.76f, 83.71f, -0.22f, 114.93f)
                arcTo(8.25f, 8.25f, 0.0f, false, false, 24.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(66.11f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, -1.69f)
                lineTo(85.89f, 208.0f)
                horizontalLineToRelative(16.22f)
                lineToRelative(12.62f, 6.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, 1.69f)
                horizontalLineToRelative(28.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, -1.69f)
                lineTo(169.89f, 208.0f)
                horizontalLineToRelative(16.22f)
                lineToRelative(12.62f, 6.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, 1.69f)
                lineTo(232.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 168.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 192.0f, 112.0f)
                close()
                moveTo(144.0f, 56.0f)
                lineTo(144.0f, 80.0f)
                lineTo(112.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                lineTo(112.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, true, 39.2f, 32.0f)
                lineTo(42.25f, 160.0f)
                curveToRelative(6.74f, -30.84f, 8.16f, -74.17f, 0.61f, -104.0f)
                close()
                moveTo(205.89f, 200.0f)
                lineTo(193.27f, 193.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f)
                lineTo(169.89f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f)
                lineTo(150.11f, 200.0f)
                lineTo(121.89f, 200.0f)
                lineToRelative(-12.62f, -6.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f)
                lineTo(85.89f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f)
                lineTo(66.11f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 176.0f)
                lineTo(232.0f, 176.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _boot!!
    }

private var _boot: ImageVector? = null

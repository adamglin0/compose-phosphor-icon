package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Boot: ImageVector
    get() {
        if (_boot != null) {
            return _boot!!
        }
        _boot = Builder(name = "Boot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 112.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.47f, 10.86f)
                curveToRelative(11.06f, 28.84f, 8.76f, 83.71f, -0.22f, 114.93f)
                arcTo(8.25f, 8.25f, 0.0f, false, false, 24.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(66.11f)
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
                horizontalLineTo(232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(168.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 192.0f, 112.0f)
                close()
                moveTo(42.86f, 56.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, true, 39.2f, 32.0f)
                horizontalLineTo(42.25f)
                curveTo(49.0f, 129.16f, 50.41f, 85.83f, 42.86f, 56.0f)
                close()
                moveTo(232.0f, 200.0f)
                horizontalLineTo(205.89f)
                lineToRelative(-12.62f, -6.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f)
                horizontalLineTo(169.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f)
                lineTo(150.11f, 200.0f)
                horizontalLineTo(121.89f)
                lineToRelative(-12.62f, -6.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f)
                horizontalLineTo(85.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f)
                lineTo(66.11f, 200.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(232.0f)
                close()
            }
        }
        .build()
        return _boot!!
    }

private var _boot: ImageVector? = null

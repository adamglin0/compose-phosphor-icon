package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Boot: ImageVector
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
                lineTo(112.27f, 112.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, -7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 96.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(160.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(112.27f, 80.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 104.0f, 72.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 64.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(160.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(32.22f, 40.0f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -5.08f, 1.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.61f, 9.22f)
                curveToRelative(11.06f, 28.84f, 8.76f, 83.71f, -0.22f, 114.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 168.0f)
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
                arcTo(56.0f, 56.0f, 0.0f, false, false, 192.0f, 112.0f)
                close()
                moveTo(232.0f, 200.0f)
                lineTo(205.89f, 200.0f)
                lineToRelative(-12.62f, -6.31f)
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
                close()
            }
        }
        .build()
        return _boot!!
    }

private var _boot: ImageVector? = null

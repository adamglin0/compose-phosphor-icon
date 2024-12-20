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

public val FillGroup.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 192.0f)
                close()
                moveTo(176.0f, 184.0f)
                lineTo(160.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(244.39f, 122.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 128.0f)
                lineTo(200.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -24.0f, 72.0f)
                lineTo(80.0f, 232.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -24.0f, -72.0f)
                lineTo(56.0f, 128.0f)
                lineTo(24.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 8.31f, 109.0f)
                arcTo(56.13f, 56.13f, 0.0f, false, true, 63.22f, 64.0f)
                horizontalLineToRelative(1.64f)
                arcTo(55.83f, 55.83f, 0.0f, false, true, 48.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(55.83f, 55.83f, 0.0f, false, true, -16.86f, 40.0f)
                horizontalLineToRelative(1.64f)
                arcToRelative(56.13f, 56.13f, 0.0f, false, true, 54.91f, 45.0f)
                arcTo(15.82f, 15.82f, 0.0f, false, true, 244.39f, 122.12f)
                close()
                moveTo(144.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 124.0f)
                close()
                moveTo(88.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 124.0f)
                close()
                moveTo(56.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, true, 8.0f, -24.0f)
                horizontalLineToRelative(-0.8f)
                arcTo(40.09f, 40.09f, 0.0f, false, false, 24.0f, 112.0f)
                close()
                moveTo(200.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(80.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 200.0f, 192.0f)
                close()
                moveTo(232.0f, 112.0f)
                arcToRelative(40.08f, 40.08f, 0.0f, false, false, -39.2f, -32.0f)
                lineTo(192.0f, 80.0f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, true, 8.0f, 24.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null

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

public val FillGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.8f, 169.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 168.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(208.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(40.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 8.0f, 64.0f)
                curveTo(8.0f, 77.61f, 18.05f, 85.54f, 19.2f, 86.4f)
                horizontalLineToRelative(0.0f)
                arcTo(7.89f, 7.89f, 0.0f, false, false, 24.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.87f, -14.33f)
                horizontalLineToRelative(0.0f)
                curveTo(28.83f, 73.62f, 24.0f, 69.74f, 24.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                lineTo(56.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                curveTo(232.0f, 178.39f, 222.0f, 170.46f, 220.8f, 169.6f)
                close()
                moveTo(104.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 136.0f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(107.71f, 208.0f)
                arcTo(31.82f, 31.82f, 0.0f, false, false, 112.0f, 192.0f)
                arcToRelative(26.92f, 26.92f, 0.0f, false, false, -1.21f, -8.0f)
                horizontalLineToRelative(102.0f)
                arcToRelative(12.58f, 12.58f, 0.0f, false, true, 3.23f, 8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null

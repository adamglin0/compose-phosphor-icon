package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 104.0f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(104.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(232.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(88.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(56.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                curveToRelative(0.0f, 5.74f, 4.83f, 9.62f, 4.88f, 9.66f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 88.0f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -4.79f, -1.61f)
                horizontalLineToRelative(0.0f)
                curveTo(18.05f, 85.54f, 8.0f, 77.61f, 8.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 40.0f, 32.0f)
                lineTo(176.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(208.0f, 168.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f)
                curveTo(222.0f, 170.46f, 232.0f, 178.39f, 232.0f, 192.0f)
                close()
                moveTo(96.26f, 173.48f)
                arcTo(8.07f, 8.07f, 0.0f, false, true, 104.0f, 168.0f)
                horizontalLineToRelative(88.0f)
                lineTo(192.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(67.69f, 48.0f)
                arcTo(31.71f, 31.71f, 0.0f, false, true, 72.0f, 64.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                curveToRelative(0.0f, -5.74f, -4.83f, -9.62f, -4.88f, -9.66f)
                arcTo(7.82f, 7.82f, 0.0f, false, true, 96.26f, 173.48f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(12.58f, 12.58f, 0.0f, false, false, -3.23f, -8.0f)
                horizontalLineToRelative(-94.0f)
                arcToRelative(26.92f, 26.92f, 0.0f, false, true, 1.21f, 8.0f)
                arcToRelative(31.82f, 31.82f, 0.0f, false, true, -4.29f, 16.0f)
                lineTo(200.0f, 208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null

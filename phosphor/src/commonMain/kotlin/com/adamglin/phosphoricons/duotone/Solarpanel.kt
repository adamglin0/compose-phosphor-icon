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

public val DuotoneGroup.Solarpanel: ImageVector
    get() {
        if (_solarpanel != null) {
            return _solarpanel!!
        }
        _solarpanel = Builder(name = "Solarpanel", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 216.0f)
                horizontalLineTo(24.0f)
                lineToRelative(40.7f, -72.0f)
                horizontalLineTo(191.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(56.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 104.0f)
                close()
                moveTo(71.43f, 58.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 82.75f, 47.43f)
                lineTo(71.43f, 36.12f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 60.12f, 47.43f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 40.0f)
                close()
                moveTo(178.91f, 61.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(11.31f, -11.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(173.25f, 47.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, 13.66f)
                close()
                moveTo(192.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(200.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 104.0f)
                close()
                moveTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 112.0f)
                close()
                moveTo(238.91f, 220.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.91f, 4.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, -11.94f)
                lineToRelative(40.69f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, -4.06f)
                lineTo(191.3f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 4.06f)
                lineToRelative(40.69f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 238.91f, 220.0f)
                close()
                moveTo(186.64f, 152.0f)
                lineTo(162.27f, 152.0f)
                lineToRelative(3.48f, 16.0f)
                horizontalLineToRelative(29.93f)
                close()
                moveTo(149.38f, 168.0f)
                lineTo(145.9f, 152.0f)
                lineTo(110.1f, 152.0f)
                lineToRelative(-3.48f, 16.0f)
                close()
                moveTo(103.14f, 184.0f)
                lineTo(97.93f, 208.0f)
                horizontalLineToRelative(60.14f)
                lineToRelative(-5.21f, -24.0f)
                close()
                moveTo(60.32f, 168.0f)
                lineTo(90.25f, 168.0f)
                lineToRelative(3.48f, -16.0f)
                lineTo(69.36f, 152.0f)
                close()
                moveTo(37.71f, 208.0f)
                lineTo(81.55f, 208.0f)
                lineToRelative(5.22f, -24.0f)
                lineTo(51.28f, 184.0f)
                close()
                moveTo(218.29f, 208.0f)
                lineTo(204.72f, 184.0f)
                lineTo(169.23f, 184.0f)
                lineToRelative(5.22f, 24.0f)
                close()
            }
        }
        .build()
        return _solarpanel!!
    }

private var _solarpanel: ImageVector? = null

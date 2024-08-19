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

public val DuotoneGroup.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = Builder(name = "Rainbow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 168.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(168.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(168.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, true, 224.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 168.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 112.0f, 0.0f)
                close()
                moveTo(128.0f, 80.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 168.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(216.0f, 168.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 48.0f)
                arcTo(120.13f, 120.13f, 0.0f, false, false, 8.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 168.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 208.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(248.0f, 168.0f)
                arcTo(120.13f, 120.13f, 0.0f, false, false, 128.0f, 48.0f)
                close()
            }
        }
        .build()
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null

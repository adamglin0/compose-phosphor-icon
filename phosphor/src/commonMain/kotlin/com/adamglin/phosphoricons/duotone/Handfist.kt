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

public val DuotoneGroup.Handfist: ImageVector
    get() {
        if (_handfist != null) {
            return _handfist!!
        }
        _handfist = Builder(name = "Handfist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 112.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -192.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 224.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                lineTo(184.0f, 80.0f)
                lineTo(184.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -56.0f, -21.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 72.21f, 60.42f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 208.0f, 0.0f)
                lineTo(232.0f, 112.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 80.0f)
                close()
                moveTo(152.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(168.0f, 80.0f)
                lineTo(136.0f, 80.0f)
                lineTo(136.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 48.0f)
                close()
                moveTo(88.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(40.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -175.92f, 3.75f)
                arcTo(31.93f, 31.93f, 0.0f, false, false, 80.0f, 125.13f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, false, 44.58f, 3.35f)
                arcToRelative(32.21f, 32.21f, 0.0f, false, false, 11.8f, 11.44f)
                arcTo(47.88f, 47.88f, 0.0f, false, false, 120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _handfist!!
    }

private var _handfist: ImageVector? = null

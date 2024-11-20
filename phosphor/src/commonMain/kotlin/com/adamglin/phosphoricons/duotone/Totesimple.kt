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

public val DuotoneGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(231.94f, 80.93f)
                lineToRelative(-14.25f, 120.0f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, -8.0f, 7.07f)
                horizontalLineTo(46.33f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, -8.0f, -7.07f)
                lineToRelative(-14.25f, -120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.93f)
                horizontalLineTo(223.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 231.94f, 80.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 69.4f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 223.92f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                lineTo(32.08f, 64.0f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, -12.0f, 5.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.92f, 12.48f)
                lineToRelative(14.26f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 14.12f)
                lineTo(209.67f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -14.12f)
                lineToRelative(14.26f, -120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 236.0f, 69.4f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(96.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(209.76f, 200.0f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, -0.09f, 0.0f)
                lineTo(46.25f, 200.0f)
                lineTo(32.08f, 80.0f)
                lineTo(224.0f, 80.0f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null

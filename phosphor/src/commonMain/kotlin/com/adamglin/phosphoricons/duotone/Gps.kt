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

public val DuotoneGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 120.0f)
                horizontalLineTo(215.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, false, 136.0f, 40.37f)
                verticalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, false, 40.37f, 120.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, false, 120.0f, 215.63f)
                verticalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(215.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, false, 215.63f, 136.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _gps!!
    }

private var _gps: ImageVector? = null

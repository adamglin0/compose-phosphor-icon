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

public val DuotoneGroup.Asclepius: ImageVector
    get() {
        if (_asclepius != null) {
            return _asclepius!!
        }
        _asclepius = Builder(name = "Asclepius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 48.0f)
                verticalLineToRelative(8.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 56.0f, 88.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 79.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.67f, -27.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.66f, -11.92f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 216.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(79.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, -23.0f, -23.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, true, 39.0f, 39.0f)
                close()
                moveTo(56.0f, 96.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 64.0f, 40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 56.0f, 96.0f)
                close()
                moveTo(80.0f, 56.0f)
                horizontalLineTo(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 40.0f, 80.0f)
                horizontalLineTo(56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 56.0f)
                close()
            }
        }
        .build()
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null

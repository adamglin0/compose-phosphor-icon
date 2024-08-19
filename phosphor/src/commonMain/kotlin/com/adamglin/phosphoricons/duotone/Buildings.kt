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

public val DuotoneGroup.Buildings: ImageVector
    get() {
        if (_buildings != null) {
            return _buildings!!
        }
        _buildings = Builder(name = "Buildings", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 32.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(85.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.56f, -6.66f)
                lineToRelative(80.0f, -53.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(144.0f, 80.0f)
                lineTo(144.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -24.88f, -13.32f)
                lineTo(39.12f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 85.34f)
                lineTo(32.0f, 208.0f)
                lineTo(16.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(208.0f, 96.0f)
                lineTo(208.0f, 208.0f)
                lineTo(144.0f, 208.0f)
                lineTo(144.0f, 96.0f)
                close()
                moveTo(48.0f, 85.34f)
                lineTo(128.0f, 32.0f)
                lineTo(128.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(112.0f, 112.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                close()
                moveTo(80.0f, 112.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(64.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                close()
                moveTo(80.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(112.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _buildings!!
    }

private var _buildings: ImageVector? = null

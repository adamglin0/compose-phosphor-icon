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

public val DuotoneGroup.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(40.0f, 112.0f)
                lineTo(80.0f, 112.0f)
                verticalLineToRelative(32.0f)
                lineTo(40.0f, 144.0f)
                close()
                moveTo(96.0f, 112.0f)
                lineTo(216.0f, 112.0f)
                verticalLineToRelative(32.0f)
                lineTo(96.0f, 144.0f)
                close()
                moveTo(216.0f, 64.0f)
                lineTo(216.0f, 96.0f)
                lineTo(40.0f, 96.0f)
                lineTo(40.0f, 64.0f)
                close()
                moveTo(40.0f, 160.0f)
                lineTo(80.0f, 160.0f)
                verticalLineToRelative(32.0f)
                lineTo(40.0f, 192.0f)
                close()
                moveTo(216.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                lineTo(96.0f, 160.0f)
                lineTo(216.0f, 160.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null

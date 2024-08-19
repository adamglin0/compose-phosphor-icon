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

public val DuotoneGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 128.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 184.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 57.9f)
                lineToRelative(9.67f, -2.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -3.35f, -15.64f)
                lineToRelative(-224.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 104.0f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, false, 1.69f, -0.18f)
                lineTo(24.0f, 102.47f)
                lineTo(24.0f, 184.0f)
                lineTo(16.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 99.0f)
                lineTo(216.0f, 61.33f)
                lineTo(216.0f, 184.0f)
                lineTo(192.0f, 184.0f)
                lineTo(192.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 184.0f)
                close()
                moveTo(176.0f, 152.0f)
                lineTo(80.0f, 152.0f)
                lineTo(80.0f, 136.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(80.0f, 168.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                lineTo(80.0f, 184.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null

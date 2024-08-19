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

public val DuotoneGroup.Chartbarhorizontal: ImageVector
    get() {
        if (_chartbarhorizontal != null) {
            return _chartbarhorizontal!!
        }
        _chartbarhorizontal = Builder(name = "Chartbarhorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                lineTo(184.0f, 96.0f)
                lineTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(56.0f, 48.0f)
                lineTo(56.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(152.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 96.0f)
                close()
                moveTo(168.0f, 64.0f)
                lineTo(168.0f, 96.0f)
                lineTo(56.0f, 96.0f)
                lineTo(56.0f, 64.0f)
                close()
                moveTo(136.0f, 192.0f)
                lineTo(56.0f, 192.0f)
                lineTo(56.0f, 160.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(216.0f, 144.0f)
                lineTo(56.0f, 144.0f)
                lineTo(56.0f, 112.0f)
                lineTo(216.0f, 112.0f)
                close()
            }
        }
        .build()
        return _chartbarhorizontal!!
    }

private var _chartbarhorizontal: ImageVector? = null

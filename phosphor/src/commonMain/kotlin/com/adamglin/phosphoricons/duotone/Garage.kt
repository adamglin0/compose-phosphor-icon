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

public val DuotoneGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 136.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 98.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.12f, -13.31f)
                lineToRelative(-88.0f, -58.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.75f, 0.0f)
                lineToRelative(-88.0f, 58.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 98.67f)
                lineTo(24.0f, 192.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 98.67f)
                lineTo(128.0f, 40.0f)
                lineToRelative(88.0f, 58.66f)
                lineTo(216.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                lineTo(192.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 192.0f)
                close()
                moveTo(176.0f, 144.0f)
                verticalLineToRelative(16.0f)
                lineTo(136.0f, 160.0f)
                lineTo(136.0f, 144.0f)
                close()
                moveTo(120.0f, 160.0f)
                lineTo(80.0f, 160.0f)
                lineTo(80.0f, 144.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(80.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                lineTo(80.0f, 192.0f)
                close()
                moveTo(136.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                lineTo(136.0f, 192.0f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null

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

public val DuotoneGroup.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) {
            return _cellSignalHigh!!
        }
        _cellSignalHigh = Builder(name = "CellSignalHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 60.7f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.12f, 25.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.44f, 3.46f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                lineTo(192.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 40.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 198.12f, 25.23f)
                close()
                moveTo(152.0f, 80.0f)
                lineTo(152.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(168.0f, 200.0f)
                lineTo(168.0f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null

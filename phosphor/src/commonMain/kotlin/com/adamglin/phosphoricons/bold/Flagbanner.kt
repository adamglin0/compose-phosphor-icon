package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Flagbanner: ImageVector
    get() {
        if (_flagbanner != null) {
            return _flagbanner!!
        }
        _flagbanner = Builder(name = "Flagbanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.15f, 49.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 44.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 20.49f)
                lineTo(71.0f, 104.0f)
                lineTo(31.52f, 143.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 164.0f)
                horizontalLineTo(167.28f)
                lineToRelative(-26.11f, 54.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.66f, 10.32f)
                lineToRelative(80.0f, -168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 242.15f, 49.59f)
                close()
                moveTo(178.71f, 140.0f)
                horizontalLineTo(69.0f)
                lineToRelative(27.52f, -27.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(69.0f, 68.0f)
                horizontalLineTo(213.0f)
                close()
            }
        }
        .build()
        return _flagbanner!!
    }

private var _flagbanner: ImageVector? = null

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

public val BoldGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 63.51f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(191.0f, 48.0f)
                lineTo(168.0f, 71.0f)
                lineTo(136.49f, 39.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(123.0f, 60.0f)
                lineTo(41.86f, 141.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 36.0f, 155.31f)
                verticalLineTo(203.0f)
                lineTo(15.51f, 223.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineTo(53.0f, 220.0f)
                horizontalLineToRelative(47.72f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineTo(196.0f, 133.0f)
                lineToRelative(3.51f, 3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(185.0f, 88.0f)
                lineToRelative(23.0f, -23.0f)
                lineToRelative(15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                close()
                moveTo(99.0f, 196.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(157.0f)
                lineToRelative(14.0f, -14.0f)
                lineToRelative(17.51f, 17.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(91.0f, 126.0f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(17.51f, 17.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(119.0f, 98.0f)
                lineToRelative(21.0f, -21.0f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null

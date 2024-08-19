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

public val BoldGroup.Roadhorizon: ImageVector
    get() {
        if (_roadhorizon != null) {
            return _roadhorizon!!
        }
        _roadhorizon = Builder(name = "Roadhorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.88f, 202.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.34f, -4.58f)
                lineTo(153.0f, 76.0f)
                lineTo(140.0f, 76.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 76.0f)
                lineTo(103.0f, 76.0f)
                lineTo(34.46f, 197.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.92f, -11.76f)
                lineTo(75.48f, 76.0f)
                lineTo(24.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(232.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(180.52f, 76.0f)
                lineToRelative(61.94f, 110.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 237.88f, 202.46f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _roadhorizon!!
    }

private var _roadhorizon: ImageVector? = null

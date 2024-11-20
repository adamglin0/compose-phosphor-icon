package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) {
            return _airTrafficControl!!
        }
        _airTrafficControl = Builder(name = "AirTrafficControl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.83f, 73.11f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 28.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(104.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(124.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.72f, 84.1f)
                lineToRelative(26.19f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 66.18f, 164.0f)
                lineTo(100.0f, 164.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(108.0f, 164.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(156.0f, 164.0f)
                horizontalLineToRelative(33.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.27f, -7.9f)
                lineToRelative(26.19f, -72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 225.83f, 73.11f)
                close()
                moveTo(107.34f, 156.0f)
                lineTo(92.79f, 76.0f)
                horizontalLineToRelative(70.42f)
                lineToRelative(-14.55f, 80.0f)
                close()
                moveTo(62.42f, 153.37f)
                lineTo(36.24f, 81.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 76.0f)
                lineTo(84.66f, 76.0f)
                lineTo(99.2f, 156.0f)
                horizontalLineToRelative(-33.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 62.42f, 153.37f)
                close()
                moveTo(219.76f, 81.37f)
                lineTo(193.58f, 153.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, 2.63f)
                horizontalLineToRelative(-33.0f)
                lineToRelative(14.55f, -80.0f)
                lineTo(216.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.76f, 5.37f)
                close()
            }
        }
        .build()
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null

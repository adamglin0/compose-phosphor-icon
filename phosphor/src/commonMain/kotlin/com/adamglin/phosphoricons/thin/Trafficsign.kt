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

public val ThinGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.32f, 119.12f)
                lineTo(136.88f, 15.68f)
                arcToRelative(12.55f, 12.55f, 0.0f, false, false, -17.76f, 0.0f)
                lineTo(15.68f, 119.12f)
                arcToRelative(12.55f, 12.55f, 0.0f, false, false, 0.0f, 17.76f)
                lineTo(119.12f, 240.32f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.55f, 12.55f, 0.0f, false, false, 17.76f, 0.0f)
                lineTo(240.32f, 136.88f)
                arcToRelative(12.55f, 12.55f, 0.0f, false, false, 0.0f, -17.76f)
                close()
                moveTo(234.66f, 131.22f)
                lineTo(131.22f, 234.67f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, -6.44f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(21.33f, 131.22f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, true, 0.0f, -6.44f)
                lineTo(124.78f, 21.33f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, 6.44f, 0.0f)
                lineTo(234.67f, 124.78f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, true, 0.0f, 6.44f)
                close()
                moveTo(170.83f, 117.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(158.34f, 124.0f)
                lineTo(112.0f, 124.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(46.34f)
                lineTo(141.17f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null

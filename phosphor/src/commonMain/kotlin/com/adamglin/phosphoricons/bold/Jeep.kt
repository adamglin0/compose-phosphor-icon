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

public val BoldGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 84.0f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(-8.61f, -40.19f)
                arcTo(20.11f, 20.11f, 0.0f, false, false, 205.53f, 28.0f)
                lineTo(50.47f, 28.0f)
                arcTo(20.11f, 20.11f, 0.0f, false, false, 30.91f, 43.81f)
                lineTo(22.3f, 84.0f)
                lineTo(16.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(68.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(88.0f, 180.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 108.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(53.7f, 52.0f)
                lineTo(202.3f, 52.0f)
                lineToRelative(6.86f, 32.0f)
                lineTo(46.84f, 84.0f)
                close()
                moveTo(64.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 180.0f)
                lineTo(64.0f, 180.0f)
                close()
                moveTo(192.0f, 196.0f)
                lineTo(192.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(212.0f, 156.0f)
                lineTo(180.0f, 156.0f)
                lineTo(180.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(140.0f, 156.0f)
                lineTo(140.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(100.0f, 156.0f)
                lineTo(100.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 108.0f)
                lineTo(212.0f, 108.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null

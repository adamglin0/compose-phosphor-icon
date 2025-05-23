package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) {
            return _courtBasketball!!
        }
        _courtBasketball = Builder(name = "CourtBasketball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(226.0f, 162.0f)
                lineTo(216.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, -68.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(30.0f, 94.0f)
                lineTo(40.0f, 94.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                lineTo(30.0f, 162.0f)
                close()
                moveTo(30.0f, 192.0f)
                lineTo(30.0f, 174.0f)
                lineTo(40.0f, 174.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                lineTo(30.0f, 82.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(122.0f, 194.0f)
                lineTo(32.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 192.0f)
                close()
                moveTo(224.0f, 194.0f)
                lineTo(134.0f, 194.0f)
                lineTo(134.0f, 62.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(226.0f, 82.0f)
                lineTo(216.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, 92.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 194.0f)
                close()
            }
        }
        .build()
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null

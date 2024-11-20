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

public val LightGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 194.0f)
                lineTo(230.0f, 194.0f)
                lineTo(230.0f, 98.67f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 223.77f, 87.0f)
                lineToRelative(-88.0f, -58.66f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.54f, 0.0f)
                lineTo(32.23f, 87.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 98.67f)
                lineTo(26.0f, 194.0f)
                lineTo(16.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(38.0f, 98.67f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.89f, 97.0f)
                lineToRelative(88.0f, -58.67f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.22f, 0.0f)
                lineToRelative(88.0f, 58.67f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.89f, 1.66f)
                lineTo(218.0f, 194.0f)
                lineTo(190.0f, 194.0f)
                lineTo(190.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(72.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                lineTo(38.0f, 194.0f)
                close()
                moveTo(178.0f, 142.0f)
                verticalLineToRelative(20.0f)
                lineTo(134.0f, 162.0f)
                lineTo(134.0f, 142.0f)
                close()
                moveTo(122.0f, 162.0f)
                lineTo(78.0f, 162.0f)
                lineTo(78.0f, 142.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(78.0f, 174.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                lineTo(78.0f, 194.0f)
                close()
                moveTo(134.0f, 174.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                lineTo(134.0f, 194.0f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
